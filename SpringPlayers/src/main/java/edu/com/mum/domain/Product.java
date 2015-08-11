package edu.com.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;






@Entity(name= "PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="PRODUCTNAME")
	private String name;
	
	@Column(name="PRICE")
	private Float price;
	
	@Column(name="DETAILS")
	private String details;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Transient
	private Catagory catagory;


	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Catagory getCatagory() {
		return catagory;
	}
	
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Float getPrice() {
		return price;
	}


	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
