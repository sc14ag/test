package com.amdocs;

public class Singleton {
	
	private static Singleton instance;
	private Singleton() {
		
		System.out.println("Singleton Private Constructor ...");
	}
 
	public synchronized static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
}

}