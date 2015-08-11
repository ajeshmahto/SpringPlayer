package edu.com.mum.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import edu.com.mum.domain.Category;



@Repository
public interface CategoryRepository  extends CrudRepository<Category, Long> 
{
  
		@Query ("SELECT c From CATEGORY c where id= :categoryId")
		 Category getCategoryById(@Param("categoryId") Long categoryId);
		 
	 
}
