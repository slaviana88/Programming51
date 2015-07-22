package com.hackbulgaria.programming51.week5;

public class Node<T> {
	public T data;
	public Node<T> next;

	public Node(T data) {
		this.setData(data);
		setNext(null);
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
