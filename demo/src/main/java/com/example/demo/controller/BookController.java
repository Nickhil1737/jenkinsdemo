package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookRepo;
import com.example.demo.entity.Book;

@RestController
public class BookController {
	@Autowired
	BookRepo brepo;
	
	@RequestMapping("/book")
	public List<Book> getBooks() {
		return (List<Book>) brepo.findAll();
	}
	@PostMapping("/book")
	public Book addBook(@RequestBody Book b) {
		brepo.save(b);
		return b;
	}
	@PutMapping("/book")
	public Book updateBook(@RequestBody Book b) {
		brepo.save(b);
		return b;
	}


	@DeleteMapping("/book/{bid}")
	public String deleteAuthor(@PathVariable String bid) {
		Book b = brepo.findById(bid).orElse(new Book());
		brepo.delete(b);
		return "deleted";
	}

	@RequestMapping("/book/{bid}")
	public Optional<Book> getBook(@PathVariable("bid") String bid) {
		return brepo.findById(bid);
	}
	
}
