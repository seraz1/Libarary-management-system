package com.example.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.entity.Book;
import com.example.library.entity.Member;
@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{

}
