package edu.com.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import edu.com.mum.domain.Category;
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

}
