package edu.com.mum.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.com.mum.domain.*;

public  interface ProductService {

	public List<Product> getAllProducts();
	public Product getProductByID(int id);
	//public List<Product> getProductsByCategory(String category);
	public void save(Product product);

	
	

	
}
