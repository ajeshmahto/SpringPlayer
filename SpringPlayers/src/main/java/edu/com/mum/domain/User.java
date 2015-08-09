package edu.com.mum.domain;

import java.util.ArrayList;
import java.util.List;



public class User { 
	

	private Long id;
	

	private String username;

	private String password;
	
	

	private List<Order> orders = new ArrayList<Order>();



	private List<PaymentInfo> paymentInfos = new ArrayList<PaymentInfo>();



	private UserProfile userProfile;


	public User() {

	}


	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}


	public Long getId() {
		return id;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public String getPassword() {
		return password;
	}
	
	public List<PaymentInfo> getPaymentInfos() {
		return paymentInfos;
	}
	


	public String getUsername() {
		return username;
	}


	public UserProfile getUserProfile() {
		return userProfile;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setPaymentInfos(List<PaymentInfo> paymentInfos) {
		this.paymentInfos = paymentInfos;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
	
}
