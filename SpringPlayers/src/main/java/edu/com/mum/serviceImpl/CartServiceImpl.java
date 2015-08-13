package edu.com.mum.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.com.mum.domain.Cart;
import edu.com.mum.repository.CartRepository;
import edu.com.mum.service.CartService;

@Service
@Transactional
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;
	@Override
	public Cart getCartByCartID(String cartId) {
		
		return cartRepository.getCartBycartId(cartId);
		
	}
	
	public void deleteCart(Cart cart)
	{
		cartRepository.delete(cart);
	}

}
