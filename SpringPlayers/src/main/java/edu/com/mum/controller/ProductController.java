package edu.com.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.com.mum.domain.Product;
import edu.com.mum.service.ProductService;
import edu.com.mum.serviceImpl.ProductServiceImpl;


@Controller
@RequestMapping({"/products"})
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/productList")
	public String listEmployees(Model model) {
 
 		model.addAttribute("products", productService.getAllProducts());
 		return "productlist";
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String addNewProduct(@ModelAttribute("newProduct") Product newProduct) {
	   return "addProduct";
	}
	   
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String processAddNewProduct(@ModelAttribute("newProduct") Product productToBeAdded) {
 
		productService.save(productToBeAdded);

	   	return "addProduct";
	}
	
}
