package edu.com.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class User { 
	
	@Id @GeneratedValue
	private Long id;
	
	@NotEmpty
	@Column(name="USER_NAME")
	private String username;
	
	@NotEmpty
	@Column(name="PASSWORD")
	private String password;
	
	
/*	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER, mappedBy="user")
	private List<Order> orders = new ArrayList<Order>();


	@OneToMany(cascade=CascadeType.ALL, mappedBy="user", fetch=FetchType.EAGER)
	private List<PaymentInfo> paymentInfos = new ArrayList<PaymentInfo>();*/


	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@PrimaryKeyJoinColumn
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
	
/*	public List<Order> getOrders() {
		return orders;
	}
*/
	public String getPassword() {
		return password;
	}
	
/*	public List<PaymentInfo> getPaymentInfos() {
		return paymentInfos;
	}
	*/


	public String getUsername() {
		return username;
	}


	public UserProfile getUserProfile() {
		return userProfile;
	}


	public void setId(Long id) {
		this.id = id;
	}


/*	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
*/

	public void setPassword(String password) {
		this.password = password;
	}


/*	public void setPaymentInfos(List<PaymentInfo> paymentInfos) {
		this.paymentInfos = paymentInfos;
	}
*/

	public void setUsername(String username) {
		this.username = username;
	}


	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
	
}
