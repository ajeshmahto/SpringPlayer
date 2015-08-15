package edu.com.mum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.com.mum.domain.User;
import edu.com.mum.domain.UserProfile;
import edu.com.mum.repository.CreditionalRepository;
import edu.com.mum.repository.UserRepository;
import edu.com.mum.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired 
	private UserRepository customerRepository;
	
	@Autowired
	private CreditionalRepository creditionalRepository;

	
  
	public void save(UserProfile userProfile) {
		
		customerRepository.save(userProfile);
		save(userProfile.getUser());	
	}
	
	public List<UserProfile> getAllUsers() {
		//return (List<UserProfile>) customerRepository.findAll();
		return ((UserRepository) customerRepository).getAllUsers();
	}
	
	public UserProfile getUserById(Long userID){
		
		return customerRepository.getUserById(userID);
	}

	
	public void delete(Long userID) {
		customerRepository.delete(userID);
		
	}
	/**
	 * I've created this method just for making a unauthorized users can't have access to the 
	 * update page. At the same time I wanted them to access the registration page. so if I putted this
	 * role on the top of save it would restrict anyone of gaining access to registration page which 
	 * is not normal. I just called save method inside this method.
	 * 
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void update(UserProfile userProfile) {
		save(userProfile);	
	}

	/**
	 * instead of having password encrypted in the save method, I used another method for doing this.
	 * this method is private so I could just use it inside this class as a helper method.
	 * */
	
  	private void save(User user) {

  		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();   		
  		String encodedPassword = passwordEncoder.encode(user.getPassword());
  		user.setPassword(encodedPassword);
  		
  		creditionalRepository.save(user);
	}

	
}
