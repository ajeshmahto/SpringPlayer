package edu.com.mum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.com.mum.domain.CartItem;
import edu.com.mum.repository.CartItemRepository;
import edu.com.mum.service.CartItemService;

@Service
@Transactional
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	CartItemRepository cartItemRepository;
	
	
	@Override
	public List<CartItem> getCartItemByCartId(String cartId) {
		
		return cartItemRepository.getCartItemBycartId(cartId);
		
	}



	@Override
	public void save(CartItem cartItem) {
		
		cartItemRepository.save(cartItem);
	}



	@Override
	public CartItem getCartItemByid(Long id) {
		
		return cartItemRepository.getCartItemByid(id);
	}



	@Override
	public void delete(CartItem cartItem) {
		
		cartItemRepository.delete(cartItem);
	}



	@Override
	public void deleteAll(List<CartItem> cartItems) {
		cartItemRepository.delete(cartItems);
		
	}

}
