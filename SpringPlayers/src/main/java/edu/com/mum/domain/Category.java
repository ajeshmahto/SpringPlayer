package edu.com.mum.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.validator.constraints.NotEmpty;




@Entity(name = "CATEGORY")
public class Category {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@NotEmpty
	@Column(name="categoryName")
	private String categoryName;
	
	 @OneToMany(mappedBy="category",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    // Defaults to table IF no Join Mentioned [ comment out Join column to see]
	 @PrimaryKeyJoinColumn
	 private List<Product> products;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	
	
	 
	 public List<Product> getProducts() {
			return products;
		}
	 
	public void setProducts(List<Product> products) {
			this.products = products;
		}
	 
	 
	 
	
}
