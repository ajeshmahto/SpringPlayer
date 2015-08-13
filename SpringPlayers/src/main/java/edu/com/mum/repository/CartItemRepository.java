package edu.com.mum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.com.mum.domain.CartItem;

@Repository
public interface CartItemRepository  extends CrudRepository<CartItem, String>

{
	
	
	@Query("SELECT c From CartItem c where cartId =:cartId")
	public List<CartItem> getCartItemBycartId(@Param("cartId") String cartId) ;
	
	public CartItem getCartItemByid(Long cartItemid) ;
	
	//public void deleteA(List<CartItem> cartItems);
	
	
}
