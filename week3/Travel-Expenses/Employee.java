package com.hackbulgaria.programming51.week3;

public class Employee {
	public String name = "";
	
	public Employee(String name){
		this.name=name;
	}

	public String toString(){
		return this.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee slavyana = new Employee("Slavyana Monkova");
		
		System.out.println(slavyana.toString().equals("Slavyana Monkova"));
	}

}
