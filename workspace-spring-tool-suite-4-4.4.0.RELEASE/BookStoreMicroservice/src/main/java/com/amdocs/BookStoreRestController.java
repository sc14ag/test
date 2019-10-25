package com.amdocs;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookStoreRestController {
//	@Autowired
//	private ArrayList<Book> locallyCachedlistOfBooks;
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/aa")
	public ArrayList<Book> getBookCatalogue() {
		RestTemplate restTemplate = new RestTemplate();
		
		URI url = URI.create("http://localhost:8080/books");
		
		ParameterizedTypeReference<ArrayList<Book>> latestBookCatalogue
        = new ParameterizedTypeReference<ArrayList<Book>>() { };

        ResponseEntity<ArrayList<Book>> response
                = restTemplate.exchange(url, HttpMethod.GET, null,latestBookCatalogue);

        return response.getBody();
	}


}

