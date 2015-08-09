package edu.com.mum.domain;



public class Address {
	

	private String lineOne; 
	

	private String lineTwo;

	
	private String state;
	

	private long zipCode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getLineOne() {
		return lineOne;
	}

	public String getLineTwo() {
		return lineTwo;
	}

	public String getState() {
		return state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
