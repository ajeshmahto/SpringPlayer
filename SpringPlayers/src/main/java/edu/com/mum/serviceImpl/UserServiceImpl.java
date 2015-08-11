package edu.com.mum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import edu.com.mum.domain.UserProfile;
import edu.com.mum.repository.UserRepository;
import edu.com.mum.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired 
	private UserRepository customerRepository;

	@Override
	public void save(UserProfile userProfile) {
		
		customerRepository.save(userProfile);
		
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
/*	public void update(Long userID, UserProfile userProfile) {
		customerRepository.update(userID, userProfile);
	}*/
	
}
