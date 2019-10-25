package com.amdocs;

import java.util.HashMap;

public class DrinkFactory {
	
	public static HashMap<Integer,String> drinkMapName;
	static {
		
		drinkMapName = new HashMap<Integer,String>();
		drinkMapName.put(1, "com.amdocs.Expresso");
		drinkMapName.put(2,"com.amdocs.Latte");
	}
	
	public static Drink getDrink(int choice) {
		
		
		Drink drink = null;
		try {
		String className = drinkMapName.get(choice);
		drink = (Drink) Class.forName(className).newInstance();
		
		}
		catch(Exception e) {
			drink =new NullDrink();
		}
		
		return drink;
		
	}

}
