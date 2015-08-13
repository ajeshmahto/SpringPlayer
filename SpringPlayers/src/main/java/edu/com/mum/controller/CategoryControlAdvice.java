package edu.com.mum.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import edu.com.mum.domain.Category;
import edu.com.mum.domain.Product;
import edu.com.mum.expection.DataNotFoundException;
import edu.com.mum.service.CategoryService;
import edu.com.mum.service.ProductService;
@Component
@ControllerAdvice

public class CategoryControlAdvice {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@ModelAttribute("categories")
    private List<Category> getCategories(Model model)
    {
    	 model.addAttribute("categories", categoryService.findAll());
          return categoryService.findAll();
    }
	
	
	@ModelAttribute("products")
    private List<Product> getProducts(Model model)
    {
    	 model.addAttribute("products", productService.getAllProducts());
          return productService.getAllProducts();
    }
	
	@ExceptionHandler(DataNotFoundException.class)
	public ModelAndView handleError(HttpServletRequest req, DataNotFoundException exception) {
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("invalidCategoryId", exception.getFullMessage());
			 mav.setViewName("CategoryNotFound");
		 return mav;
	}

}
