package com.example.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer>{
	
	Book findByName(String title);

}
