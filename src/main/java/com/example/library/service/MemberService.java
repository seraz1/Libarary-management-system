package com.example.library.service;

import java.util.List;

import com.example.library.entity.Member;

public interface MemberService {

	Member saveMember(Member mem);

	List<Member> findMember();

	Member saveOneMember(int id);

	String deleteAMember(int id);
}
