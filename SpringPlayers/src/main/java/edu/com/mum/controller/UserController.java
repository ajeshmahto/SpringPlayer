package edu.com.mum.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import edu.com.mum.domain.UserProfile;
import edu.com.mum.service.UserService;



@Controller
@RequestMapping({"/users"})
public class UserController {
	
	@Autowired
	private UserService customerService;

	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistration(@ModelAttribute("userProfile") UserProfile userProfile) {

		
        return "registration";
    }
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registrationPost( @ModelAttribute("userProfile") @Valid UserProfile userProfile, BindingResult result) {

		if(result.hasErrors()) 
			return "registration";
		
		customerService.save(userProfile);
		
		
        return "userFinishRegistration";
    }
	

	@RequestMapping("/allUsers")
	public String allUsers(Model model) {
		
 		return "allUsers";
	}
	
	  
	@RequestMapping("/userDetails")
	public String oneUser(Model model,@RequestParam("id") Long userID) {
		
		UserProfile userProfile = customerService.getUserById(userID);
		model.addAttribute("user",userProfile);
 		return "userDetails";
	}

	
	@RequestMapping("/user_delete/{id}")
	public String deleteUser(Model model, @PathVariable("id") long id) {
		customerService.delete(id);
 		//model.addAttribute("users", customerService.getAllUsers());
 		return "redirect:/users/allUsers";
	}
	
	
	@RequestMapping(value = "/user_edit/{id}", method = RequestMethod.GET)
    public String editProduct(Model model, UserProfile userProfile, @PathVariable("id") long id) {
    
        userProfile = customerService.getUserById(id);
        model.addAttribute(userProfile);
     
        return "editUser";
    }
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
    public String registrationUpdate( @ModelAttribute("userProfile") @Valid UserProfile userProfile, BindingResult result) {

		if(result.hasErrors()) 
			return "editUser";
		
		customerService.save(userProfile);
		
		
        return "redirect:allUsers";
    }
	
	
	
	
	@ModelAttribute("users")	   
	List<UserProfile> UserList(Model model) 
	   {
	    return customerService.getAllUsers();
	   }
	
	
	

}
