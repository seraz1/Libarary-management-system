package com.example.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Repository.BookRepository;
import com.example.library.entity.Book;
@Service
public class BookServiceImpl  implements BookService{
	
	@Autowired
	BookRepository bookRepository; 

	@Override
	public Book insertBook(Book bok) {
		
		return bookRepository.save(bok);
	}

	@Override
	public List<Book> selectBook() {
		
		return bookRepository.findAll();
	}

	@Override
	public Book selectOneBook(int id) {
	return bookRepository.findById(id).get();
	
	}

	 @Override
	
	 public String deleteABook(int id) {
	 Optional<Book> bok = bookRepository.findById(id);
	 
	 if(bok.isPresent()) {
	    bookRepository.deleteById(id);
	    return "Book with is "+id+"deleted";
	
	 }else {
	return "Book with is "+id+ "does not exixts";
		
	  }
  }
	//bookRepository.deleteById(id);

//	  @Override
//	  public Book selectBookByName(String title) {
//		return bookRepository.findByName(title);
//	}
}
	
	
	
	
	
	
	


