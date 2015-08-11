package edu.com.mum.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import edu.com.mum.domain.UserProfile;
import edu.com.mum.service.UserService;



@Controller
@RequestMapping({"/users"})
public class UserController {
	
	@Autowired
	private UserService customerService;

	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistration(@ModelAttribute("registration") UserProfile userProfile) {

		
        return "registration";
    }
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registrationPost( @ModelAttribute("registration") @Valid UserProfile userProfile, BindingResult result) {

		if(result.hasErrors()) 
			return "registration";
		
		customerService.save(userProfile);
		
        return "redirect:/users/all";
    }
	

	@RequestMapping("/all")
	public String allUsers(Model model) {
		
 		return "users";
	}
	
	  
	@RequestMapping("/user")
	public String oneUser(Model model,@RequestParam("id") Long userID) {
		
		UserProfile userProfile = customerService.getUserById(userID);
		model.addAttribute("user",userProfile);
 		return "user";
	}
	
/*	@RequestMapping(value = "/{userID}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable(value = "userID") String userID) {
		customerService.delete(userID);
	}
	*/
	
	@ModelAttribute("users")
	   
	List<UserProfile> UserList(Model model) 
	   {
	    return customerService.getAllUsers();
	   }
	
	
	

}
