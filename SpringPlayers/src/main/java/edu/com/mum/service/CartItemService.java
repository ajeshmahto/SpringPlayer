package edu.com.mum.service;

import java.util.List;

import edu.com.mum.domain.CartItem;

public interface CartItemService {
	
	public List<CartItem> getCartItemByCartId(String cartId);
	
	public void save(CartItem cartItem);
	
	public CartItem getCartItemByid(Long id);
	public void delete(CartItem cartItem);
	
		


}
