package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

public class MaxSpan {
	public static int maxSpan(int[] numbers) {
		int count;
		int maxSpan = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count = j - i + 1;
					if (count > maxSpan) {
						maxSpan = count;
					}
				}
			}
		}

		return maxSpan;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println(maxSpan(numbers));
	}
}
