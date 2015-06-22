package com.hackbulgaria.programming51.week2;

public class Fridge {
	private int currentArrIndex;
	private int fridgeCapacity = 100;
	public Food[] arr = new Food[fridgeCapacity];
	private int weight;
	private int index;

	public Fridge(int currentArrIndex) {
		this.currentArrIndex = currentArrIndex;
	}
	public Fridge(int currentArrIndex, int weight){
		this.currentArrIndex = currentArrIndex;
		this.weight=weight;
		
	}
	public boolean addFood(Food f) {
		if (currentArrIndex<index) {
			return false;
		} else {
			arr[index] = f;
			index++;
//			this.weight-=f.weight;
			return true;
		}
	}

	public int getFoodsCount() {
		return this.index;
	}

	public String toString() {
		for (int i=0;i<index;i++){
			System.out.println(arr[i]);
		}
		return "";
	}

	public String [] getProductsOfType(String type){
		String[] productOfType = new String[index];
		for (int i = 0;i < index; i++) {
			for(int j=0;j<index;j++){
			if (arr[i].type.equals(type)) {
				productOfType[j] = arr[i].name;
			}
		}
		}
		return productOfType;
	}

	public int getWeight() {
		int sum = 0;
		for (int i = 0; i < index; i++) {
			sum += arr[i].weight;
		}
		return sum;
	}
	
	public int getMaxWeight() {
		return this.weight;
	}
	
	public Food getHeaviestFood(){
		int maxWeight = 0;
		Food f = arr[0];
		for (int i = 0; i < index - 1; i++) {
				maxWeight = arr[i].weight;
				if (maxWeight < arr[i + 1].weight) {
				maxWeight = arr[i + 1].weight;
				f = arr[i + 1];
			}
		}
		return f;
	}
	
	public int getCapacity(){
		return currentArrIndex;
	}
	

	
	public static void main(String[] args) {
	    Fridge fridge = new Fridge(10, 3000);
	    fridge.addFood(new Food("Cheese", "Milk", 300));
	    fridge.addFood(new Food("Milk", "Milk", 1000));
	    fridge.addFood(new Food("Beer", "Bevarage", 500));

	    System.out.println(fridge.getMaxWeight());
	    System.out.println(fridge.getCapacity());

		
	}

}
