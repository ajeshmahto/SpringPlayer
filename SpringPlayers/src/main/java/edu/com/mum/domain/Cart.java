package edu.com.mum.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Cart {
	@Id @GeneratedValue
	private Long id;
	private String cartId;
//	@OneToMany(mappedBy = "cart")
//	private List<CartItem> cartItems;
	private double total;
	@Transient
	private User user;
	//@Transient
	//private  Product product;
	
	public Cart()
	{
		
	}
	
	public Cart(String cartId, Product product)
	{
		this.cartId=cartId;
		//this.product=product;
		this.total=product.getPrice();
		
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public List<CartItem> getCartItem() {
//		return cartItems;
//	}
//	public void setCartItem(List<CartItem>  cartItems) {
//		this.cartItems = cartItems;
//	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}
