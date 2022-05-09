package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Author;

public interface AuthorRepo extends CrudRepository<Author, Integer>{

}
