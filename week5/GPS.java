package com.hackbulgaria.programming51.week5;

import java.util.Vector;
import java.util.Scanner;

public class GPS {

	public static Vector<Integer> getGasStations(int tripDistance,
			int tankSize, Vector<Integer> gasStations) {
		Vector<Integer> result = new Vector<>();
		result.add(0);
		gasStations.addElement(tripDistance);
		gasStations.add(0, 0);

		for (int i = 0; i < gasStations.size()-1; i++) {
			int distanceStation = gasStations.elementAt(i + 1)
					- gasStations.elementAt(i);

			int diff = (result.lastElement()+tankSize) - gasStations.elementAt(i) ;
			
			if (diff <= distanceStation) {
				result.add(gasStations.elementAt(i));
			} 
		}
		result.remove(0);
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tripDistance = scanner.nextInt();
		int tankSize = scanner.nextInt();

		int gasStationsCount = scanner.nextInt();
		Vector<Integer> gasStations = new Vector<Integer>();

		for (int i = 0; i < gasStationsCount; i++) {
			gasStations.add(scanner.nextInt());
		}

		Vector<Integer> result = getGasStations(tripDistance, tankSize,
				gasStations);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}
}