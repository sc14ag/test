package com.amdocs;

public class Latte extends Drink {

	@Override
	protected void getWater() {
		System.out.println("Took 10ml of plain drinking water");
	}

	@Override
	protected void boilWater() {
		System.out.println("Boiling the drinking water");
	}

	@Override
	protected void getIngredients() {
		System.out.println("Retrieved 15grams of coffee powder and 40 grams of milk");		
	}

	@Override
	protected void mix() {
		System.out.println("Mixing boiled water, milk with coffee powder");
	}

	@Override
	protected void serve() {
		System.out.println("Your Latte is ready!");

	}

}
