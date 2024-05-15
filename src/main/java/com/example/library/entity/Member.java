package com.example.library.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Member implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String contact;
	private String memberid;
	

	
	public Member(int id, String name, String contact, String memberid) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.memberid = memberid;
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
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", contact=" + contact + ", memberid=" + memberid + "]";
	}
	public Member() {
		super();
	}


}


	
	

	

