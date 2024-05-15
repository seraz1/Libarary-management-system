package com.example.library.bookController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Book;
import com.example.library.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService  bookService;
	
	@GetMapping("/testserver")
	public String test() {
	return "server is working fine";
	
	}
	
	 @PostMapping("/insert")
  
    public Book insertBook(@RequestBody Book bok) {
     Book  b = bookService.insertBook(bok);
     return b;

   }	
	 
	 @GetMapping("/getAllBookDetails")
     public List<Book> selectbok() {
   	 return bookService.selectBook();  
	 
	 }	
	 
	@GetMapping("/getAllBookDetails/{id}")
    public Book selectBookById(@PathVariable int id) {
   	return  bookService.selectOneBook(id);
	
	}
	
	 @DeleteMapping("/delete/{id}")
     public String deleteABook(@PathVariable int id) {
   	 return bookService.deleteABook(id);
    
	 }
//	  @GetMapping("/select/title/{title}")
//       public Book selectBookById(@PathVariable String name) {
//   	   return  bookService.selectBookByName(name);
//   
//	 }     
	 
	 }
