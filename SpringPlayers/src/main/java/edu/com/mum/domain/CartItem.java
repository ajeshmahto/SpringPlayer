package edu.com.mum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CartItem {
	@Id @GeneratedValue
	private Long id;
	private Long quantity;
	private Float total;
	private int productId;
	private String cartId;
	private String productImageId;
	private String productDescription;
	private String productName;
;
	
	
	public CartItem(){}
	
	
	public CartItem(Product product,String cartId)
	{
		this.productId=product.getId();
		this.cartId=cartId;
		this.total=product.getPrice();
		this.quantity=1L;
		this.productDescription=product.getDetails();
		this.productImageId=product.getProductID();
		this.productName=product.getName();
		
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

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


	public String getProductImageId() {
		return productImageId;
	}


	public void setProductImageId(String productImageId) {
		this.productImageId = productImageId;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}

}
