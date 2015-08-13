package edu.com.mum.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import edu.com.mum.domain.Cart;
import edu.com.mum.domain.CartItem;
import edu.com.mum.domain.Product;
import edu.com.mum.service.CartItemService;
import edu.com.mum.service.CartRestService;
import edu.com.mum.service.CartService;
import edu.com.mum.service.ProductService;

@Controller
@RequestMapping(value="/rest")
public class CartRestController {
	
	@Autowired
	CartRestService cartRestService;
	@Autowired
	ProductService productService;
	@Autowired
	CartService cartService;
	@Autowired
	CartItemService cartItemService;
	
	@RequestMapping(value="/addToCart/{id}", method=RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void addToCart(@PathVariable("id") int productId,  Model model, Product product,HttpServletRequest request)
	{
		String sessionId = request.getSession(true).getId();
		Cart cart = cartService.getCartByCartID(sessionId);
		 product = productService.getProductByID(productId);
		 List<CartItem> cartItems= new ArrayList<CartItem>();
		 CartItem cartItem = new CartItem(product,sessionId);
		 
		 cartItems.add(cartItem)  ;
		if(cart== null) {
		  
		   cartRestService.save(new Cart(sessionId,product));
		   
		   cartItemService.save(cartItem);
		}
		
		else
		{
			cartItemService.save(cartItem);
		}
		
		
	
	}
	
	
	@RequestMapping(value="/removeFromCart/{id}", method=RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removeItem(@PathVariable("id") Long cartItemid, HttpServletRequest request) {
		
		CartItem cartItem = cartItemService.getCartItemByid(cartItemid);
		
		cartItemService.delete(cartItem);
	}
	
	
	

}
