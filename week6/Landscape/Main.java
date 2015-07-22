package com.hackbulgaria.programming51.week6;

public class Main {

	  public static void main(String[] args) {
		    Landscape landscape = new Landscape();

		    landscape.addTile(new Land());
		    landscape.addTile(new Water());
		    landscape.addTile(new Mountain());
		    landscape.addTile(new Forest());

		    System.out.println(landscape.renderAll()); // --~~/\!!
		  }
}
