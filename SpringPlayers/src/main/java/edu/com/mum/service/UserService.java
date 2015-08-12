package edu.com.mum.service;



import java.util.List;

import edu.com.mum.domain.User;
import edu.com.mum.domain.UserProfile;

public interface UserService {
	
	
	public void save(UserProfile userProfile) ;
	
	List<UserProfile> getAllUsers();
	
	
	public UserProfile getUserById(Long userID);
	
	public void delete(Long userID);
	

	public void update(UserProfile userProfile);
	
	//void update(Long userID, UserProfile userProfile);
	
	}

