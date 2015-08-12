package edu.com.mum.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import edu.com.mum.domain.User;

	@Repository
	public interface CreditionalRepository extends  CrudRepository <User, String> 
	{

		
  	}

