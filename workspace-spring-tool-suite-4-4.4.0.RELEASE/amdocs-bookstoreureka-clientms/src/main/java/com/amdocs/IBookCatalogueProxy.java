package com.amdocs;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("book-catalogue-ms")
public interface IBookCatalogueProxy {
	
	@GetMapping("/books")
	public List<Book> getBookCatalogue();

}
