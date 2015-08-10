package edu.com.mum.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.com.mum.domain.Category;
import edu.com.mum.domain.Product;
import edu.com.mum.service.CategoryService;



@Controller
@RequestMapping("/Category")
class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	
	@RequestMapping(value="/categoryList")
	public String listCategory(Model model) {
	model.addAttribute("categories", categoryService.findAll());
		return "categoryList";
	}
	

	@RequestMapping(value = "/addCategory", method = RequestMethod.GET)
	public String addNewCategor(@ModelAttribute("newCategory") Category newCategory) {
	   return "addCategory";
	}
	   
	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	public String processAddNewProduct(@ModelAttribute("newCategory") Category categoryToBeAdded) {
 
		categoryService.save(categoryToBeAdded);
		 return  "redirect:/Category/categoryList";
	}
	
	
	
	
	
	
/*@ModelAttribute("categories")
    private List<Category> getCategories(Model model)
    {
    	 //model.addAttribute("categories", new Category());
          return categoryService.findAll();
    }*/
  
}
