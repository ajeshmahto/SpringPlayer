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
import edu.com.mum.expection.CategoryNotFoundExpection;
import edu.com.mum.service.CategoryService;
@Component
@ControllerAdvice

public class CategoryControlAdvice {
	
	@Autowired
	CategoryService categoryService;
	
	@ModelAttribute("categories")
    private List<Category> getCategories(Model model)
    {
    	 model.addAttribute("categories", categoryService.findAll());
          return categoryService.findAll();
    }
	
	@ExceptionHandler(CategoryNotFoundExpection.class)
	public ModelAndView handleError(HttpServletRequest req, CategoryNotFoundExpection exception) {
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("invalidCategoryId", exception.getFullMessage());
			 mav.setViewName("CategoryNotFound");
		 return mav;
	}

}
