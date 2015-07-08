package com.hackbulgaria.programming51.week3;

import java.util.Collections;
import java.util.Vector;

public class Travel {
	private String country = "";
	private String city = "";
	private int cost = 0;
	private int vat = 0;
	private int index = 0;
	private TravelExpense[] employees = new TravelExpense[20];

	public Travel(String city, String country, int vat) {
		this.city = city;
		this.country = country;
		this.vat = vat;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public int getVat() {
		return vat;
	}

	public int getIndex() {
		return index;
	}

	public void addExpense(TravelExpense expense) {
		cost += expense.getNetCost();
		employees[index] = expense;
		index++;
	}

	public int totalNetCost() {
		return this.cost;
	}

	public int totalCost() {
		int vat = (int) 0.20 * cost;
		return cost + vat;
	}

	public Employee[] mostExpensesMadeBy() {
		Employee[] mostExpenses = new Employee[2];
		int maxCost = employees[0].getNetCost();
		int len = getIndex();
		mostExpenses[0] = employees[0].getEmployee();
		mostExpenses[1] = employees[1].getEmployee();

		for (int i = 0; i < len; i++) {

			if (maxCost < employees[i].getNetCost()) {
				mostExpenses[0] = employees[i].getEmployee();
				maxCost = employees[i].getNetCost();
			}
		}

		for (int j = 0; j < len; j++) {
			int next = employees[j].getNetCost();
			if (next < maxCost) {
				mostExpenses[1] = employees[j].getEmployee();

			}
		}

		return mostExpenses;
	}
}
