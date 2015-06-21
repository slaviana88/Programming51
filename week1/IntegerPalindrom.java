package com.hackbulgaria.programming51.week1;
import java.util.Scanner;

public class IntegerPalindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scanner.nextInt();

		int reversedNum = 0;
		int temp =num;
		while (temp != 0) {
			reversedNum = reversedNum * 10 + temp % 10;
			temp = temp / 10;
		}
		System.out.println(reversedNum);
		int isPalindrome = num + reversedNum;
		int newTemp = 0;
		int oldTemp = isPalindrome;
		int digit = 1;
		
		while (isPalindrome > 0) {
			digit = isPalindrome % 10;
			newTemp = newTemp * 10 + digit;
			isPalindrome = isPalindrome / 10;
		}
		
		if (newTemp == oldTemp) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}
		
		

	}

}
