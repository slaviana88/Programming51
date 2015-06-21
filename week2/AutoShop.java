package com.hackbulgaria.programming51.week2;

public class AutoShop {
	public Auto [] cars = new Auto[10];
	public int temp = 0;
	
	public void addCar(Auto car) {
			cars[temp] = car;
			temp++;
	}
	
	public Auto getTopSpeed(){
		Auto max=cars[0];
		for(int i=0;i<temp;i++){
			if (max.maxSpeed>cars[i].maxSpeed){
				max=cars[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Person ivan = new Person();
		ivan.firstName = "Ivan";
		ivan.lastName = "Ivanov";

		Auto audi = new Auto();

		audi.owner = ivan;
		audi.maxSpeed = 200;
		audi.brand = "Audi";
		audi.name = "Begachka";
		audi.price = 5000;
		
		Person gosho = new Person();
		gosho.firstName = "Georgi";
		gosho.lastName = "Georgiev";

		Auto peugeot = new Auto();

		peugeot.owner = gosho;
		peugeot.maxSpeed = 220;
		peugeot.brand = "Peugeot";
		peugeot.name = "Dragster";
		peugeot.price = 10000;
		AutoShop as = new AutoShop();
		as.addCar(audi);
		as.addCar(peugeot);
		
		System.out.println(as.getTopSpeed());
		
	}

}
