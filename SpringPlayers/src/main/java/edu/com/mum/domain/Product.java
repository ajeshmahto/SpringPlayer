package edu.com.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import edu.com.mum.validator.ProductId;







@Entity(name= "PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty
	@ProductId
	@Column(name="PRODUCTID")
	String productID;
	
	@NotEmpty
	@Size(min=4, max=50, message="{Size.name.validation}")
	@Column(name="PRODUCTNAME")
	private String name;
	
	@NotNull
	@Column(name="PRICE")
	private Float price;
	
	@NotEmpty
	@Column(name="DETAILS")
	private String details;
	
	@NotNull
	@Column(name="QUANTITY")
	private int quantity;
	
	/*@Transient
	private Catagory catagory;*/
	
	@Transient
	private MultipartFile  productImage;
	
	@ManyToOne
    
	private Category category;


public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

public MultipartFile getProductImage() {
		return productImage;
	}

	//@Column(name="PRODUCTIMAGE")
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
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


	/*public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}*/

	

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
	
	

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
