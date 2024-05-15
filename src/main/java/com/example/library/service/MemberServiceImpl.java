package com.example.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Repository.BookRepository;
import com.example.library.Repository.MemberRepository;
import com.example.library.entity.Book;
import com.example.library.entity.Member;
@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberRepository memberRepository;

	@Override
	public Member saveMember(Member mem) {
		
		return memberRepository.save(mem);
	}

	@Override
	public List<Member> findMember() {
	
		return memberRepository.findAll();
	}

	@Override
	public Member saveOneMember(int id) {
	
		return memberRepository.findById(id).get();
	}

	@Override
	public String deleteAMember(int id) {
		 Optional<Member> mem = memberRepository.findById(id);
		 
		  if(mem.isPresent()) {
		 
			  memberRepository.deleteById(id);
		   
		    return "Book with is "+id+"deleted";
		
		 }else {
		   
			 return "Book with is "+id+ "does not exixts";
			
	
       }
	}
}

	
	


