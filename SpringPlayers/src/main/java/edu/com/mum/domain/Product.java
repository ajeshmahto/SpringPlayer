package edu.com.mum.domain;

import java.util.ArrayList;
import java.util.List;







public class Product {
	

	private Long id;
	

	private String name;
	

	private Float price;

	private List<String> details = new ArrayList<String>();
	



	private Catagory catagory;


	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Catagory getCatagory() {
		return catagory;
	}
	
	public List<String> getDetails() {
		return details;
	}

	public Long getId() {
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

	public void setDetails(List<String> details) {
		this.details = details;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Float price) {
		this.price = price;
	}


}
