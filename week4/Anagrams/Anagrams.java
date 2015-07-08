package com.hackbulgaria.programming51.week4;

import java.util.*;
import java.util.Arrays;

public class Anagrams {
	public static boolean areAnagrams(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}

		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		String a2 = new String(a1);
		String b2 = new String(b1);
		return a2.equals(b2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		String b = scanner.next();

		if (areAnagrams(a, b)) {
			System.out.println("ANAGRAMS");
		} else {
			System.out.println("NOT ANAGRAMS");
		}

	}
}
