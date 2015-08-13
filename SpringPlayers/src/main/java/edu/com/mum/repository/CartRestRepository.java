package edu.com.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.com.mum.domain.Cart;

@Repository
public interface CartRestRepository  extends CrudRepository<Cart, String>

{
	
	

}
