package edu.com.mum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.com.mum.domain.UserProfile;


	@Repository
	public interface UserRepository extends  CrudRepository <UserProfile, Long> 
	{
		   @Query("SELECT up FROM USERPROFILE up join up.user")
			public List<UserProfile> getAllUsers();
		
		@Query("SELECT u FROM USERPROFILE u where id = :userId")
	    UserProfile getUserById(@Param("userId") Long key);
		
		//void delete(String userID);
		
		//void update(String userID, UserProfile userProfile);

		
  	}

