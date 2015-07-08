package com.hackbulgaria.programming51.week4;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class LilisLibrary {
	public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {
		Collections.sort(books);
		Vector<Pair<String, Integer>> result = new Vector<>();
		Vector<String> newBooks = new Vector<>();

		for (int i = 0; i < books.size(); i++) {
			String title = books.elementAt(i);

			int counter = 0;
			Pair<String, Integer> pair = new Pair<>();
			pair.first = title;
			pair.second = counter;

			if (newBooks.contains(title)) {
			} else {
				for (int j = 0; j < books.size(); j++) {
					if (title.equals(books.elementAt(j))) {
						counter++;
					}

				}
				pair.second = counter;

				result.add(pair);
			}
			newBooks.add(title);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Vector<String> books = new Vector<String>();
		int booksCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < booksCount; i++) {
			books.add(scanner.nextLine());
		}

		Vector<Pair<String, Integer>> result = orderBooks(books);

		for (Pair<String, Integer> titleCount : result) {
			System.out.println(titleCount.first + " : " + titleCount.second);
		}
	}
}