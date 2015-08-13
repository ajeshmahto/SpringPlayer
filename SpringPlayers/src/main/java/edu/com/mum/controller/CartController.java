package edu.com.mum.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.com.mum.domain.CartItem;
import edu.com.mum.service.CartItemService;

@Controller
@RequestMapping(value = "/cart")
public class CartController {
	
	@Autowired
	CartItemService cartItemService;
	
	@RequestMapping
	public String getSession(HttpServletRequest httpRequest)
	{
		return "redirect:/cart/" +httpRequest.getSession(true).getId();
	}
	
	@RequestMapping(value="{cartId}", method=RequestMethod.GET)
	public String showCart(@PathVariable(value = "cartId") String cartId, Model model)
	
	{
		model.addAttribute("cartId",cartId);
		List<CartItem> cartItems = cartItemService.getCartItemByCartId(cartId);
//		if (cart == null) {
//			cart = new Cart(cartId);
//			cartService.create(cart );
//		}
		model.addAttribute("cartItems",cartItems);
		System.out.println(cartItems.size());
		return "cart";
	}

}
