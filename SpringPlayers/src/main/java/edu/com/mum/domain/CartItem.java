package edu.com.mum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CartItem {
	@Id @GeneratedValue
	private Long id;
//	@OneToMany(fetch=FetchType.EAGER)
//	@PrimaryKeyJoinColumn
//	private List<Product> products;
	private Long quantity;
	private Float total;
	private int productId;
	private String cartId;
//	@ManyToOne(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name = "cartId")
//	private Cart cart;
	
	
	public CartItem()
	{}
	
	public CartItem(Product product,String cartId)
	{
		this.productId=product.getId();
		this.cartId=cartId;
		this.total=product.getPrice();
		this.quantity=1L;
		
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
//	public List<Product> getProducts() {
//		return products;
//	}
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
//	public Cart getCart() {
//		return cart;
//	}
//	public void setCart(Cart cart) {
//		this.cart = cart;
//	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

}
