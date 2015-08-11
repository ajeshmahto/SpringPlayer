package edu.com.mum.service;



import java.util.List;


import edu.com.mum.domain.UserProfile;

public interface UserService {
	
	
	public void save(UserProfile userProfile) ;
	
	
	List<UserProfile> getAllUsers();
	
	public UserProfile getUserById(Long userID);
	
	//void delete(String userID);
	
	}

