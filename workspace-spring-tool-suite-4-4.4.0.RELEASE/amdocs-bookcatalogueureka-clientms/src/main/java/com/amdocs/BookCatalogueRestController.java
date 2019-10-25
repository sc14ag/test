package com.amdocs;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookCatalogueRestController {
	
	

	private static List<Book> listOfBooks;
	
	static {
		
		listOfBooks = new ArrayList<Book>();
		listOfBooks.add(new Book("Clean Code","Rober Martin",10.00));
		listOfBooks.add(new Book("Working effectively with Legacy Code","Martin Fowler",49.00));
		listOfBooks.add(new Book("Mastering C++ Programming","Jeganathan Swaminathan",49.00));
		listOfBooks.add(new Book("Building Microservices","Sams Newman",35.00));
	}

	public BookCatalogueRestController() {
		
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return listOfBooks;
	}
}
