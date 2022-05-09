package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private String bcode;
	private String bname;
	private String bauthor;
	private String addedDate;
	

	public Book() {
		super();
	}


	public Book(String bcode, String bname, String bauthor, String addedDate) {
		super();
		this.bcode = bcode;
		this.bname = bname;
		this.bauthor = bauthor;
		this.addedDate = addedDate;
	}


	public String getBcode() {
		return bcode;
	}


	public void setBcode(String bcode) {
		this.bcode = bcode;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getBauthor() {
		return bauthor;
	}


	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}


	public String getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}



	

}
