package com.amdocs;
public class NullMenuItem implements IMenuItem {

	@Override
	public void calculatePrice() {
		System.out.println("Invalid menu item. Please choose a valid option");

	}

}
