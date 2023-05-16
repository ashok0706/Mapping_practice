package com.MappingPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.MappingPractice.Model.Book;
import com.MappingPractice.Repo.BookRepo;

@Service
public class BookService {

	
	@Autowired
	BookRepo Bookrepo;
	
	
	public void addBook(@RequestBody Book Book) {
		Bookrepo.save(Book);
	}
	
	
	public String updateBook(Book Book) {
		Book adr = Bookrepo.findById(Book.getID()).get();
		if(adr!=null) {
			Bookrepo.save(Book);
			return "Book succfully Updated"; 
		}
		
		return " There Is no Excisting Id hence new Addres created Book updated";
	}
	
	
	public String deleteBook(@PathVariable String id) {
		Book adr = Bookrepo.findById(id).get();
		if(adr!=null) {
			Bookrepo.deleteById(id);
			return "Book successfully Delated";
		}
		return "There no Excisting Id";
	}
	
	
	public List<Book> getBook(){
		 return Bookrepo.findAll();
	}
}
