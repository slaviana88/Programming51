package com.hackbulgaria.programming51.week2;

public class Food {
	public String name = "";
	public String type = "";
	public int weight = 0;

	public Food(String name, String type, int weight) {
		this.name = name;
		this.type = type;
		this.weight = weight;
	}

	public String toString() {
		return name + "-" + type + ":" + weight + "grams";
	}
}
