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


@Entity(name= "USER")
public class User { 
	
	 @Id
	 @Column(name = "USERNAME", nullable = false, unique = true)
		@NotEmpty
	String username;
	


	
	@NotEmpty
	@Column(name="PASSWORD")
	private String password;
	
	Boolean enabled;

 	public Boolean getEnabled() {
		return enabled;
	}


	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


	@Column(name = "AUTHORITY")
 	private String authority;
	
	
/*	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER, mappedBy="user")
	private List<Order> orders = new ArrayList<Order>();


	@OneToMany(cascade=CascadeType.ALL, mappedBy="user", fetch=FetchType.EAGER)
	private List<PaymentInfo> paymentInfos = new ArrayList<PaymentInfo>();*/


	public String getAuthority() {
		return authority;
	}


	public void setAuthority(String authority) {
		this.authority = authority;
	}


	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private UserProfile userProfile;
	


	public User() {

	}


	public User(String username, String password) {
		this.username = username;
		this.password = password;
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
