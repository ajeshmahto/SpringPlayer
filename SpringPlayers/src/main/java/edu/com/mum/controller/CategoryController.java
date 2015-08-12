package edu.com.mum.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.com.mum.domain.Category;
import edu.com.mum.expection.CategoryNotFoundExpection;
import edu.com.mum.service.CategoryService;

@Controller
@RequestMapping({"/Category"})
class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	
	@RequestMapping(value={"/", "/categoryList"})
	public String listCategory(Model model) {
		List<Category> category = categoryService.findAll();
		if (category == null || category.isEmpty()) {
			throw new CategoryNotFoundExpection();
		}

		model.addAttribute("categories", category);
				//categoryService.findAll());
		return "categoryList";
	}
	

	@RequestMapping(value = "/addCategory", method = RequestMethod.GET)
	public String addNewCategory(@ModelAttribute("category") Category newCategory) {
	   return "addCategory";
	}
	   
	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	public String processAddNewProduct(@ModelAttribute("category") Category categoryToBeAdded) {
		categoryService.save(categoryToBeAdded);
		return  "redirect:categoryList";
	}
	
	
	 @RequestMapping(value = "/category_delete/{id}", method = RequestMethod.GET)
	    public String deleteCategory(Model model, @PathVariable("id") long id, HttpServletRequest request) {
		 	Category category = categoryService.getCategoryById(id);
	        categoryService.delete(category);
	        String referer = request.getHeader("Referer");
			return "redirect:" + referer;
	      
	    }
	 
    @RequestMapping(value = "/category_edit/{id}", method = RequestMethod.GET)
    public String editCategory(Model model ,Category category, @PathVariable("id") long id) {
       category = categoryService.getCategoryById(id);
       model.addAttribute(category);
       return "editCategory";
    }
	
	
/*@ModelAttribute("categories")
    private List<Category> getCategories(Model model)
    {
    	 //model.addAttribute("categories", new Category());
          return categoryService.findAll();
    }*/
    
    @RequestMapping(value = "/throw", method = RequestMethod.GET)
	public String throwException(@ModelAttribute("category") Category category) {
	

	Long categoryId = (long) 54;
	category =  categoryService.getCategoryById(categoryId);
	 if(category== null)
	 {
		 throw new CategoryNotFoundExpection(categoryId, null);
	 }
	 
	 return "";
	
}
  
}
