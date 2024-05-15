package com.example.library.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Borrowing {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//private int bookId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "memberId")
	private Member memberId;
	private String borrowdate;
	private String returndate;
	
	
	
	public Borrowing(int id, Member memberId, String borrowdate, String returndate, Book book) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.borrowdate = borrowdate;
		this.returndate = returndate;
		this.book = book;
	}
	public Member getMemberId() {
		return memberId;
	}
	public void setMemberId(Member memberId) {
		this.memberId = memberId;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookId")
	private Book book;

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getBorrowdate() {
		return borrowdate;
	}
	public void setBorrowdate(String borrowdate) {
		this.borrowdate = borrowdate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	@Override
	public String toString() {
		return "Borrowing [id=" + id + ", bookId="  + ", memberId=" + memberId + ", borrowdate=" + borrowdate
				+ ", returndate=" + returndate + "]";
	}
	public Borrowing() {
		super();
	}


}

