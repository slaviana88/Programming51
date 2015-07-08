package com.hackbulgaria.programming51.week3;

public class IntegerVector {
	private int[] data;
	private int size;
	private int capacity;

	public IntegerVector() {
		size = 0;
		capacity = 10;
		data = new int[capacity];
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < size; i++) {
			str += data[i] + " ";
		}
		return str;
	}

	private void resize() {
		capacity = capacity * 2 + 1;
		int[] temp = new int[capacity];

		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public void add(int element) {
		if (size == capacity) {
			resize();
		}
		data[size] = element;
		size++;
	}

	public int size() {
		return size;
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += data[i];
		}
		return sum;
	}

	public void set(int index, int value) {
		data[index] = value;
	}

	public int get(int index) {
		return data[index];
	}

	public void addAll(int[] n) {
		for (int i = 0; i < n.length; i++) {
			add(n[i]);
		}
	}

	public void insert(int index, int value) {
		int[] temp = new int[size + 1];
		for (int i = 0; i < index; i++) {
			temp[i] = data[i];
		}
		temp[index] = value;
		for (int j = index; j < size; j++) {
			temp[j + 1] = data[j];
		}
		size++;
		data = temp;
	}

	public void remove(int index) {
		int[] temp = new int[size];
		
		for (int i = 0; i < index; i++) {
			temp[i] = data[i];
		}
		
		for (int j = index; j < size - 1; j++) {
			temp[j] = data[j + 1];
		}
		size--;
		data = temp;
	}
}
