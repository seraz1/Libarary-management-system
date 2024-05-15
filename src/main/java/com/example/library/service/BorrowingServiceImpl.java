package com.example.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Repository.BookRepository;
import com.example.library.Repository.BorrowingRepository;
import com.example.library.entity.Borrowing;
import com.example.library.entity.Member;
@Service
public class BorrowingServiceImpl implements BorrowingService{

	@Autowired
	BorrowingRepository borrowingRepository; 

	
	@Override
	public Borrowing postBorrowing(Borrowing bo) {
	
		return borrowingRepository.save(bo);
	}


	@Override
	public List<Borrowing> retrieveBorrowing() {
	
		return borrowingRepository.findAll();
	}


	@Override
	public Borrowing reteieveOneBorrowing(int id) {
	
		return borrowingRepository.findById(id).get();
	}


	@Override
	public String removeABorrowing(int id) {
		 Optional<Borrowing> bo = borrowingRepository.findById(id);
		 if(bo.isPresent()) {
			 
			  borrowingRepository.deleteById(id);
		   
		    return "Borrowing with is "+id+"deleted";
		
		 }else {
		   
			 return "Borrowing with is "+id+ "does not exixts";
			
		 }
      }
}

