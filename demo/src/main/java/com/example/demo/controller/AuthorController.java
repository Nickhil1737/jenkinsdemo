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

import com.example.demo.dao.AuthorRepo;
import com.example.demo.entity.Author;

@RestController
public class AuthorController {
	@Autowired
	AuthorRepo arepo;

	@RequestMapping("/author")
	public List<Author> getAuthors() {
		return (List<Author>) arepo.findAll();
	}
	@PostMapping("/author")
	public Author addAuthor(@RequestBody Author a) {
		arepo.save(a);
		return a;
	}
	@PutMapping("/author")
	public Author updateAuthor(@RequestBody Author a) {
		arepo.save(a);
		return a;
	}


	@DeleteMapping("/author/{aid}")
	public String deleteAuthor(@PathVariable int aid) {
		Author a = arepo.findById(aid).orElse(new Author());
		arepo.delete(a);
		return "deleted";
	}

	@RequestMapping("/author/{aid}")
	public Optional<Author> getAuthor(@PathVariable("aid") int aid) {
		return arepo.findById(aid);
	}
}
