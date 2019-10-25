package com.amdocs;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		displayMenu();
		String choice = getChoice();
		String className = "com.amdocs." + choice;
		IMenuItem menuItem = createMenuItem(className);
		
		menuItem.calculatePrice();

	}

	private static IMenuItem createMenuItem(String className) {
		IMenuItem menuItem = null;
		try {
			menuItem = (IMenuItem) Class.forName(className).newInstance();
		} catch (Exception e) {
			menuItem = new NullMenuItem();
		}
		return menuItem;
	}

	private static String getChoice() {
		Scanner scanner = new Scanner (System.in);
		String choice = scanner.nextLine();
		
		return choice;
	}

	private static void displayMenu() {
		System.out.println("=================");
		System.out.println("Food Menu");
		System.out.println("=================");
		
	}

}
