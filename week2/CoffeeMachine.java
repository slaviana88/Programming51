package com.hackbulgaria.programming51.week2;

public class CoffeeMachine {
	public Coffee [] brandsOfCoffee = new Coffee[10];
	public float balance=0;
	public int temp=0;

	public boolean addCoffee(Coffee coffee) {
		if (temp >= 10) {
			return false;
		} else {
			brandsOfCoffee[temp] = coffee;
			temp++;
			return true;
		}
	}

	public double buyCoffee(String name, double userMoney) {
		for (int i = 0; i < temp; i++) {
			double change = 0;
			if (name.equals(brandsOfCoffee[i].name)) {
				change = userMoney - brandsOfCoffee[i].price;
				return change;
			}
		}

		return -1;
	}
	
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Coffee java = new Coffee();
		Coffee latte = new Coffee();

		java.name = "Java";
		java.price = 1.00;

		latte.name = "Latte";
		latte.price = 1.50;

		cm.addCoffee(java);
		cm.addCoffee(latte);

		System.out.println(cm.buyCoffee("Latte", 3.40));
		System.out.println("Current balance: " + cm.balance);
	}

}
