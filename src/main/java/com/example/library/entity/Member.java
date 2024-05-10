package com.example.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Member {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String contact;
	private String member_id;
	public Member(int id, String name, String contact, String member_id) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.member_id = member_id;
		
		
	}
	public Member() {
		super();
	}
	@Override
	public String toString() {
		return "MemberTable [id=" + id + ", name=" + name + ", contact=" + contact + ", member_id=" + member_id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	
}
