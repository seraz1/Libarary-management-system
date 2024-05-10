package com.example.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String auther;
	private String isbn;
	private String genre;
	private int quantity;
	
	
	@Override
	public String toString() {
		return "BookTable [id=" + id + ", title=" + title + ", auther=" + auther + ", isbn=" + isbn + ", genre=" + genre
				+ ", quantity=" + quantity + "]";
	}


	public Book() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuther() {
		return auther;
	}


	public void setAuther(String auther) {
		this.auther = auther;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Book(int id, String title, String auther, String isbn, String genre, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.auther = auther;
		this.isbn = isbn;
		this.genre = genre;
		this.quantity = quantity;
	}

}
