package com.amdocs;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ProductManager {
	private static ArrayList<Product> products;
	
	static {
		products = new ArrayList<Product>();
		products.add(new Product("cheese","best cheese in town",52.30));
		products.add(new Product ("milk","cow milk",2.00));
		products.add((new Product("butter","This is a test description",4.10)));
	}

	public ArrayList<Product> getAllProducts(){
		return products;
		
	}
}
