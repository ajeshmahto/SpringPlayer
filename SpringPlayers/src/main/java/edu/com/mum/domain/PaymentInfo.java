package edu.com.mum.domain;

import java.util.Date;




public class PaymentInfo {
	

	private Long id;
	

	private PayType payType;
	

	private String paymentName;
	
	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}


	private String cardNumber;

	private Date expireDate;
	

	private User user;
	

	private Address paymentAddress;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getPaymentAddress() {
		return paymentAddress;
	}

	public void setPaymentAddress(Address paymentAddress) {
		this.paymentAddress = paymentAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
	

	
}
