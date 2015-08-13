package edu.com.mum.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.com.mum.domain.Cart;

@Repository
public interface CartRepository  extends CrudRepository<Cart, String>

{
	
	//@Query("SELECT c From Cart where cartId:=cartId")
	public Cart getCartBycartId(@Param("cartId") String cartId);
}
