package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class StringNormalizer {

	StringBuilder sb = new StringBuilder(10);

	public static String normalizeString(String str) {
		String[] result = str.split("\\s+");
		for (int x = 0; x < result.length; x++) {
			result[x] = result[x].trim().toLowerCase();
			char first = result[x].charAt(0);
			if (first >= 97 && first <= 122) {
				result[x] = result[x].replace(result[x].charAt(0),
						(char) (result[x].charAt(0) - 32));
			}
			System.out.print(result[x] + " ");
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		System.out.println(normalizeString(s));

	}

}
