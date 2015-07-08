package com.hackbulgaria.programming51.week3;

public class IntegerVectorStatic {
	public static String toString(IntegerVector v) {
		String temp = "";
		for (int i = 0; i < v.size() - 1; i++) {
			temp += v.get(i) + ", ";
		}
		temp += v.get(v.size() - 1) + " ";
		return temp;
	}

	public static void sort(IntegerVector v) {
		for (int i = 0; i < v.size(); i++) {
			for (int j = i; j < v.size(); j++) {
				if (v.get(i) > v.get(j)) // swap items
				{
					int temp = v.get(i);
					v.set(i, v.get(j));
					v.set(j, temp);
				}
			}
		}
	}

	public static IntegerVector reverse(IntegerVector v) {
		IntegerVector reverseVector = new IntegerVector();
		int b = 0;

		for (int i = v.size() - 1; i >= 00; i--) {
			b = v.get(i);
			reverseVector.add(b);
		}

		return reverseVector;
	}

	public static String join(IntegerVector v, String glue) {
		String temp = "";
		for (int i = 0; i < v.size() - 1; i++) {
			temp += v.get(i) + glue;
		}

		temp += v.get(v.size() - 1) + " ";
		return temp;
	}

	public static int sum(IntegerVector v) {
		int result = 0;
		for (int i = 0; i < v.size(); i++) {
			result += v.get(i);
		}

		return result;
	}

	public static IntegerVector range(int a, int b) {
		IntegerVector result = new IntegerVector();
		result.insert(0, a);
		int j = b - a;

		for (int i = 1; i <= j; i++) {
			a++;
			result.insert(i, a);
		}

		return result;
	}

	public static IntegerVector filterOdd(IntegerVector v) {
		IntegerVector result = new IntegerVector();

		for (int i = 0; i < v.size(); i++) {
			if (v.get(i) % 2 != 0) {
				result.add(v.get(i));
			}
		}

		return result;
	}
}
