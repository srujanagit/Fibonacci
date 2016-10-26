package com.comparable;

import java.util.Arrays;

	class Fruit implements Comparable<Fruit>{

	String fruitName;
	String fruitDesc;
	int quantity;

	public Fruit(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public int compareTo(Fruit compareFruit) {

		int compareQuantity = ((Fruit) compareFruit).getQuantity();

		return compareQuantity - this.quantity;

	}
}


public class Compareable1 {

	public static void main(String args[]){

			Fruit[] fruits = new Fruit[3];
			Fruit mango = new Fruit("mango", "mango description",50);
			Fruit apple = new Fruit("Apple", "Apple description",100);
			Fruit orange = new Fruit("Orange", "Orange description",80);


			fruits[0]= mango;
			fruits[1]= apple;
			fruits[2]= orange;
			

			Arrays.sort(fruits);

			int i=0;
			for(Fruit f : fruits){
			   System.out.println("fruits " + ++i + " : " + f.getFruitName() +
				", Quantity : " + f.getQuantity());
			}

		}

	}

	