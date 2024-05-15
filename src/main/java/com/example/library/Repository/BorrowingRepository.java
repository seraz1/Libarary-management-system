package com.example.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.entity.Book;
import com.example.library.entity.Borrowing;

public interface BorrowingRepository extends JpaRepository<Borrowing, Integer>{

}
