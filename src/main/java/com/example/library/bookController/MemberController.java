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
import com.example.library.entity.Member;
import com.example.library.service.BookService;
import com.example.library.service.MemberService;
@RestController
public class MemberController {
	
	@Autowired
	MemberService  memberService;
	
	
	@PostMapping("/save")
	public Member saveMember(@RequestBody Member mem) {
	     Member  m = memberService.saveMember(mem);
	     return m;
	}
	
	 @GetMapping("/find")
     public List<Member> findmember() {
   	 return memberService.findMember();  
	
	 }	
	 
	 @GetMapping("/save/id/{id}")
	    public Member saveMemberById(@PathVariable int id) {
	   	return  memberService.saveOneMember(id);
		
	}
	 
	 @DeleteMapping("/find/{id}")
     public String deleteAMember(@PathVariable int id) {
   	 return memberService.deleteAMember(id);
    
	 }
	 
}
