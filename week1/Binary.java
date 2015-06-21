package week1;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter binary: ");
		String binary = scanner.next();
		System.out.println(isPowerOfTwo(binary));
		

	}

	public static String toBinary(int n) {
		String newStringToBinary = "";
		int number = n;
		while (number >= 1) {
			int m = number % 2;
			number = number / 2;
			newStringToBinary += m;
		}
		String reversedString = "";
		for (int i = 0; i < newStringToBinary.length(); i++) {
			reversedString = newStringToBinary.charAt(i) + reversedString;
		}
		return reversedString;
	}

	public static int toNumber(String binary) {
		int number = 0;
		for (int i = 0; i < binary.length(); i++) {
			char index = binary.charAt(i);
			double temp = 0;
			if (index == '1') {
				temp = Math.pow(2, (binary.length() - (i + 1)));
				number = (int) (number + temp);
			}
		}
		return number;
	}
	public static int countBits(int n){
		int i=1;
		while(true){
			if(n<=Math.pow(2,i)-1 && n>=Math.pow(2,i-1)) {
				return i;
			}
			i++;
		}
	}
	
	public static int isPowerOfTwo(String binary){
		int newBinary=toNumber(binary);
		return newBinary;
	}
}