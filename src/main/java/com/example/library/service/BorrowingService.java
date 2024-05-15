package com.example.library.service;

import java.util.List;

import com.example.library.entity.Borrowing;

public interface BorrowingService {

	Borrowing postBorrowing(Borrowing bo);

	List<Borrowing> retrieveBorrowing();

	Borrowing reteieveOneBorrowing(int id);

	String removeABorrowing(int id);

}
