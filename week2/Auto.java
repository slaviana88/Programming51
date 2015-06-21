package com.hackbulgaria.programming51.week2;
import java.util.Arrays;

public class Auto {
	public Person owner = new Person();
	public float maxSpeed=0;
	public String brand ="";
	public String name="";
	public int price=0;
	
	public String toString(){
		return brand+" "+name+",Max Speed:"+maxSpeed+",Price: "+price+",Owner: "+owner;
	}
	public static void main(String[] args) {
		Person Ivan = new Person();
		Ivan.firstName = "Ivan";
		Ivan.lastName = "Ivanov";

		Auto audi = new Auto();

		audi.owner = Ivan;
		audi.maxSpeed = 200;
		audi.brand = "Audi";
		audi.name = "Begachka";
		audi.price = 5000;

		System.out.println(audi);

	}

}
