package com.capgemini.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	String name;
	@Autowired
	Author author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Author getAuthor() {
//		return author;
//	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void getAuthor() {
		// TODO Auto-generated method stub
		
	}
	

}
