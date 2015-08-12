package edu.com.mum.repository;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import edu.com.mum.domain.Category;
import edu.com.mum.domain.Product;



@Repository
public interface CategoryRepository  extends CrudRepository<Category, Long> 
{
  
		@Query ("SELECT c From CATEGORY c where id= :categoryId")
		 Category getCategoryById(@Param("categoryId") Long categoryId);
		
		@Query ("select p from CATEGORY c JOIN c.products p where c.id = :categoryId ")
		public List<Product> getProductByCategoryId(@Param("categoryId") Long categoryId);
		 
	 
}
