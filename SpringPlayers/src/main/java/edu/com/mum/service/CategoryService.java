package edu.com.mum.service;

import java.util.List;

import edu.com.mum.domain.Category;
import edu.com.mum.domain.Product;

public interface CategoryService {
	
	public void save (Category category);
	public List<Category> findAll();
	//public void update();
	public void delete(Category category);
	Category get(long id);
	Category update(Category category);
	
	Category getCategoryById(Long categoryId);
	
	public List<Product> getProductByCategoryId(Long categoryId);
	
}
