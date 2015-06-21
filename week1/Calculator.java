package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = scanner.nextInt();
		System.out.println("Enter operator: ");
		char oper = scanner.next().charAt(0);
		System.out.println("Enter number: ");
		int b = scanner.nextInt();

		if (oper == '+') {
			System.out.println(a + b);
		} else if (oper == '-') {
			System.out.println(a - b);
		} else if (oper == '*') {
			System.out.println(a * b);
		} else if (oper == '/') {
			System.out.println(a / b);
		} else if (oper == '^') {
			int temp = a;
			for (int i = 1; i < b; i++) {
				temp = temp * a;
			}
			System.out.println(temp);
		} else if (oper == '?') {
			int temp1 = 1;
			int temp2 = 1;
			for (int i = 1; i <= a; i++) {
				temp1 = temp1 * i;
			}
			for (int i = 1; i <= b; i++) {
				temp2 = temp2 * i;
			}
			System.out.println(temp1 + temp2);
		}

	}

}
