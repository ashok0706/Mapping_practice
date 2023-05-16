package com.MappingPractice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MappingPractice.Model.Book;
import com.MappingPractice.service.BookService;
@RestController
@RequestMapping("/Book")
public class BookController {

	@Autowired
	BookService BookService;
	
	@PostMapping("/add")
	public void addBook(@RequestBody Book Book) {
		BookService.addBook(Book);
	}
	
	@PutMapping("/update")
	public String updateBook(Book Book) {
		return BookService.updateBook(Book);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable String id) {
		return BookService.deleteBook(id);
	}
	
	@GetMapping("/get")
	public List<Book> getBookes(){
		 return BookService.getBook();
	}
}
