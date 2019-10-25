package com.amdocs;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookStoreRestController {
	
	private List<Book> bookCatalogue;
	
	public BookStoreRestController() {
		bookCatalogue = new ArrayList<Book>();
		
	}
	
	@GetMapping("/bookcatalogue")
	public List<Book> getBookCatalogue(){
			RestTemplate restTemplate = new RestTemplate();
			//This is the rest endpoint of the dependent microservice
			//This microservice doesn't exist right now. We need to create this
			//We are trying to see how this current 
			URI url = URI.create("http://localhost:8085/books");
			
			ParameterizedTypeReference<ArrayList<Book>> reference
	        = new ParameterizedTypeReference<ArrayList<Book>>() { };

	        ResponseEntity<ArrayList<Book>> response
	                = restTemplate.exchange(url, HttpMethod.GET, null,reference);

	        return response.getBody();
		}
	}
	