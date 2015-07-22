package com.hackbulgaria.programming51.week6;
import java.util.ArrayList;

public class Landscape {

	private ArrayList<Tile> landscape = new ArrayList<>();

	public void addTile(Tile t) {
		landscape.add(t);
	}

	public String renderAll() {
		String result = "";
		for (Tile t : landscape) {
			result += t.render();
		}
		return result;
	}
}
