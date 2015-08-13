package edu.com.mum.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.com.mum.domain.Cart;
import edu.com.mum.repository.CartRestRepository;
import edu.com.mum.service.CartRestService;

@Service
@Transactional
public class CartRestServiceImpl implements CartRestService {
	
	@Autowired
	CartRestRepository cartRestRepository;

	@Override
	public void save(Cart cart) {
//		CartItem cartItem = new CartItem();
//		cartItem.setQuantity(1L);
//		cartItem.setTotal(product.getPrice());
		//cartItem.setp
		cartRestRepository.save(cart);
		
	}

	

}
