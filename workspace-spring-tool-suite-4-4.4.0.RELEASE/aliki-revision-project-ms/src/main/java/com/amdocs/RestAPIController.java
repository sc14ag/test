package com.amdocs;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
	
	@Autowired
	private ProductManager productManager;

	
@GetMapping("/products")
public ArrayList<Product> getProducts(){
	return productManager.getAllProducts();
}
	
}
