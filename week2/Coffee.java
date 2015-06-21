package com.hackbulgaria.programming51.week2;

public class Coffee {
	public String name = "";
	public static double price=0;
	
	public String toString(){
		return name+":"+price;
	}
	

	public static void main(String[] args) {
		Coffee Java = new Coffee();
		Java.name = "Java";
		Java.price = 1.00f;
		System.out.println(Java);
		
	}

}
