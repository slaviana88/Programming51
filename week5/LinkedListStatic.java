package com.hackbulgaria.programming51.week5;


public class LinkedListStatic {
	public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
		LinkedList<Integer> result = new LinkedList<>();

		int size = l.size() - 1;
		for (int i = size; i >= 0; i--) {
			result.add(l.get(i));
		}

		return result;
	}

	public static void sort(LinkedList<Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			for (int j = i; j < l.size(); j++) {
				if (l.get(i) < l.get(j)) {
					int temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
		}
	}

	public static LinkedList<Integer> merge(LinkedList<Integer> a,
			LinkedList<Integer> b) {
		LinkedList<Integer> result = new LinkedList<>();
		
		for(int i=0;i<a.size();i++){
			result.add(a.get(i));
		}
		for(int i=0;i<b.size();i++){
			result.add(b.get(i));
		}
		
		LinkedListStatic.sort(result);
		return result;
	}

}
