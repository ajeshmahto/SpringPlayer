package edu.com.mum.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.com.mum.domain.Category;



@Repository
public interface CategoryRepository  extends CrudRepository<Category, Integer> 
{

}
