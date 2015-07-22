package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class WordCounter {

	public static boolean istPalindrom(String word) {
		int i1 = 0;
		int i2 = word.length() - 1;
		while (i2 > i1) {
			if (word.charAt(i1) != word.charAt(i2)) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}

	public static boolean contains(String haystack, String needle) {
		haystack = haystack == null ? "" : haystack;
		needle = needle == null ? "" : needle;

		return haystack.toLowerCase().contains(needle.toLowerCase());
	}

	public static int rowLeftToRight(String word, char[][] matrix, int rows,
			int columns) {
		int counter = 0;
		for (int i = 0; i < rows; i++) {
			String str = "";
			for (int j = 0; j < columns; j++) {
				str += (char) matrix[i][j];
			}
			if (contains(str, word)) {
				counter++;
			}
		}
		return counter;

	}

	public static int colUpToDown(String word, char[][] matrix, int rows,
			int columns) {
		int counter = 0;
		for (int j = 0; j < columns; j++) {
			String str = "";
			for (int i = 0; i < rows; i++) {
				str += (char) matrix[i][j];
			}
			if (contains(str, word)) {
				counter++;
			}
		}
		return counter;

	}

	public static int diagonals(String word, char[][] matrix, int rows,
			int columns) {
		int counter = 0;
		int row = 0;
		int col = columns - 1;
		for (int i = 0; i < rows + columns - 1; ++i) {
			String str = "";
			int n = Math.min(rows - row, columns - col);
			for (int k = 0; k < n; ++k) {
				str += matrix[row + k][col + k];
			}
			if (contains(str, word)) {
				counter++;
			}
			if (col > 0) {
				--col;
			} else {
				++row;
			}
		}
		return counter;
	}

	public static char[][] reverseMatrix(char[][] matrix, int rows, int columns) {
		char[][] result = new char[rows][columns];
		for (int i = 0; i < rows; i++) {
			char ch = 0;
			for (int j = columns - 1, k = 0; j >= 0; j--, k++) {
				ch = (char) matrix[i][j];
				result[i][k] = ch;
			}
		}
		return result;
	}

	public static char[][] traverse(char[][] matrix, int rows, int columns) {
		char[][] result = new char[rows][columns];
		for (int i = rows - 1, k = 0; i >= 0; i--, k++) {
			char ch = 0;
			for (int j = 0; j < columns; j++) {
				ch = (char) matrix[i][j];
				result[k][j] = ch;
			}
		}
		return result;

	}

	public static int wordCounter(char matrix[][], int n, int m, String word) {
		int counter = 0;
		counter += rowLeftToRight(word, matrix, n, m);
		counter += colUpToDown(word, matrix, n, m);
		counter += diagonals(word, matrix, n, m);
		counter += diagonals(word, reverseMatrix(matrix, n, m), n, m);
		if (!istPalindrom(word)) {
			counter += rowLeftToRight(word, reverseMatrix(matrix, n, m), n, m);
			counter += colUpToDown(word, traverse(matrix, n, m), n, m);
			counter += diagonals(word, traverse(matrix, n, m), n, m);
			counter += diagonals(word,
					traverse(reverseMatrix(matrix, n, m), n, m), n, m);
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String searched = scanner.next();
		char[][] map;
		int n, m;
		n = scanner.nextInt();
		m = scanner.nextInt();
		map = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scanner.next().charAt(0);
			}
		}

		System.out.println(wordCounter(map, n, m, searched));

	}

}
