package com.hackbulgaria.programming51.week1;
import java.util.Scanner;


public class PalindromeScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		int counter=1;
		
		while(true){
		int newTemp = 0;
		int oldTemp = num;
		int digit = 1;
		int number=num;
		
		while (number > 0) {
			digit = number % 10;
			newTemp = newTemp * 10 + digit;
			number = number / 10;
		}
			int reversedNum = 0;
			int temp = num;
			while (temp != 0) {
				reversedNum = reversedNum * 10 + temp % 10;
				temp = temp / 10;
			}

			if (newTemp == oldTemp) {
				System.out.println("Palindrom: " + counter);
				break;
			} else {
				counter++;
				num = num + reversedNum;
			}
		}
	}

}
