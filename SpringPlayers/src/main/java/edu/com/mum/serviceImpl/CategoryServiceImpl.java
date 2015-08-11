package edu.com.mum.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.com.mum.domain.Category;
import edu.com.mum.repository.CategoryRepository;
import edu.com.mum.service.CategoryService;


@Service
@Transactional

public class CategoryServiceImpl implements  CategoryService {
	
	@Autowired 
	 CategoryRepository categoryRepository;
	private List<Category> categories;

	@Override
	public void save(Category category) {
		
		categoryRepository.save(category);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>) categoryRepository.findAll();
	}
	
	
	@Override
	public void delete(Category category)
	{
		categoryRepository.delete(category);
		
	}
	
	/*@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public Category get(long id) {
		for(Category category: categories)
			if(id== category.getId())
			{
				return category;
			}
		return null;
	}
	
	
	 @Override
	    public Category update(Category category) {
	        int categoryCount = categories.size();
	        for (int i = 0; i < categoryCount; i++) {
	        	Category savedCategory = categories.get(i);
	            if (savedCategory.getId() == category.getId()) {
	            	categories.set(i, category);
	                return category;
	            }
	        }
	        return category;
	    }
	 
	 
	 @Override
	 public Category getCategoryById(Long categoryId) 
	 {
			return categoryRepository.getCategoryById(categoryId);
	}

}
