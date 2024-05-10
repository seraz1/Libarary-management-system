package com.example.library.service;

import java.util.List;

import com.example.library.entity.Book;

public interface BookService {

	Book insertBook(Book bok);

	List<Book> selectBook();

	Book selectOneBook(int id);

	String deleteABook(int id);

	Book selectBookByName(String name);

}
