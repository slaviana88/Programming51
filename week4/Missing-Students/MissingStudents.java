package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class MissingStudents {

	public static Vector<Vector<String>> missingStudents(
			Vector<String> students, Vector<Vector<String>> presence) {
		Vector<Vector<String>> result = new Vector<>();

		for (int j = 0; j < presence.size(); j++) {
			Vector<String> dayMissing = new Vector<>();
			Vector<String> oneDay = presence.elementAt(j);
			for (int i = 0; i < students.size(); i++) {
				if (oneDay.contains(students.elementAt(i))) {
					continue;
				}
				dayMissing.add(students.elementAt(i));
			}
			result.add(dayMissing);

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<String> students = new Vector<>();
		Vector<Vector<String>> presence = new Vector<>();

		int studentsCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < studentsCount; i++) {
			String student = scanner.nextLine();
			students.add(student);
		}

		int days = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < days; i++) {
			int studentsForThatDay = Integer.parseInt(scanner.nextLine());
			Vector<String> presenceForDay = new Vector<>();
			for (int j = 0; j < studentsForThatDay; j++) {
				presenceForDay.add(scanner.nextLine());
			}

			presence.add(presenceForDay);
		}

		Vector<Vector<String>> missing = missingStudents(students, presence);

		System.out.println(missing);
	}
}
