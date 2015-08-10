package edu.com.mum.service;

import java.util.List;

import edu.com.mum.domain.Category;




public interface CategoryService {
	
	public void save (Category category);
	public List<Category> findAll();
	public void update();
	public void delete(Category category);
}
