package com.hackbulgaria.programming51.week5;

public class LinkedList<T> {
	public Node<T> head;
	public Node<T> tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void add(T data) {
		if (head == null) {
			head = new Node<T>(data);
			tail = head;
		} else {
			Node<T> temp = new Node<>(data);
			tail.setNext(temp);
			tail = temp;
		}
	}

	public String toString() {
		String str = "";
		Node<T> temp = head;
		while (temp.getNext() != null) {
			str += temp.getData() + " ";
			temp = temp.getNext();
		}
		return str + temp.getData();
	}

	public T get(int index) {
		Node<T> temp = getNode(index);
		return temp.getData();
	}

	public void set(int index, T data) {
		Node<T> temp = getNode(index);
		temp.setData(data);
	}

	private Node<T> getNode(int index) {
		Node<T> temp = head;
		int counter = 0;

		while (true) {
			if (counter == index) {
				return temp;
			} else {
				temp = temp.getNext();
				counter++;
			}
		}
	}

	public void insertAfter(int index, T data) {
		Node<T> temp = new Node<>(data);
		Node<T> indexNode = getNode(index);
		temp.setNext(indexNode.getNext());

		indexNode.setNext(temp);
	}
	
	

	public void remove(int index) {
		Node<T> indexNode = getNode(index);

		if (index == 0) {
			head = head.getNext();
		} else {
			Node<T> temp = getNode(index - 1);
			temp.setNext(indexNode.getNext());
		}
		indexNode.setNext(null);
	}

	public void addFirst(T data) {
		Node<T> firstNode = new Node<>(data);
		Node<T> temp = head;

		firstNode.setNext(temp);
		head = firstNode;
	}

	public void addLast(T data) {
		add(data);
	}

	public T getFirst() {
		return head.getData();
	}

	public T getLast() {
		int size = size();
		return get(size - 1);
	}

	public boolean contains(T data) {
		Node<T> temp = head;
		boolean contains = false;
		while (temp != null) {
			if (temp.getData().equals(data)) {
				contains = true;
			}
			temp = temp.getNext();
		}
		return contains;
	}

	public int getElementIndex(T data) {
		Node<T> temp = head;
		int index = 0;

		while (temp != null) {
			if (temp.getData().equals(data)) {
				return index;
			}
			temp = temp.getNext();
			index++;
		}
		return -1;
	}

	public int size() {
		int size = 0;
		Node<T> temp = head;
		while (true) {
			if (temp.getNext() == null) {
				size++;
				return size;
			}
			temp = temp.getNext();
			size++;
		}
	}

	public T[] toArray(T[] arr) {
		Node<T> temp = head;
		for (int i = 0; temp != null; i++) {
			arr[i] = temp.getData();
			temp = temp.next;
		}
		return arr;
	}

	public void addArray(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			add(arr[i]);
		}
	}

	public void insertListAfter(int index, LinkedList<T> l) {
		if (l.head != null) {
			for (int i = 0; i < l.size(); i++) {
				insertAfter(index, l.get(i));
				index++;
			}
		}
	}

	public void insertListBefore(int index, LinkedList<T> l) {
		if (l.head != null) {
			for (int i = 0; i < l.size(); i++) {
				if (index == 0) {
					addFirst(l.get(i));
				} else {
					insertAfter(index - 1, l.get(i));
				}
				index++;
			}
		}
	}
}
