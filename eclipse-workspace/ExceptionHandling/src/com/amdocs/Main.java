package com.amdocs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void F1() {
		
		int x= 100;
		int y=0;
		int result = 0;
		try {
		System.out.println("Inside F1() method");
		result = 100/0;
		
		System.out.println("This will never get printed due to exception");
		
	
	}catch(Exception e){
		result = x/y;
	}
		
		
	}

	public static void main(String[] args) throws IOException {
		
		F1();
	}
//		BufferedReader bufferedReader = null;
//		try {
//			InputStreamReader  reader = new FileReader("SomeFile.txt");
//		bufferedReader = new BufferedReader(reader);
//			bufferedReader.readLine();
//			
//		}
//		//More specific to generic errors java
//		catch (FileNotFoundException e) {		
//			System.out.println("File not found in the path");
//		}
//		catch(Exception e) {
//			System.out.println("Unknown error occured.");
//		}
//		finally {
//			System.out.println("This code will get executed always");
//			if(bufferedReader!=null)
//			bufferedReader.close();
//			
//		}
//	}
}
