package com.example.library.bookController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Borrowing;
import com.example.library.service.BorrowingService;

@RestController
public class BorrowingController {
	
	@Autowired
	BorrowingService  borrowingService;
	
	 @PostMapping("/post")
     public Borrowing postBorrowing(@RequestBody Borrowing bo) {
     Borrowing b = borrowingService.postBorrowing(bo);
     return b;

   }	
	 @GetMapping("/retrieve")
     public List<Borrowing> retrievebo() {
   	 return borrowingService.retrieveBorrowing();  
	 
	 }	
	 @GetMapping("/reteieve/id/{id}")
	    public Borrowing reteieveBorrowingById(@PathVariable int id) {    
	   	return  borrowingService.reteieveOneBorrowing(id);
		
		}
	 @DeleteMapping("/remove/{id}")
     public String removeABorrowing(@PathVariable int id) {
   	 return borrowingService.removeABorrowing(id);
    
	 }
	 
	 
	 
	 
	 
	 
	 

}
