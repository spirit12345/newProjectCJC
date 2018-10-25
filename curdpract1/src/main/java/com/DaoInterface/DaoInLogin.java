package com.DaoInterface;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;

public interface DaoInLogin extends CrudRepository<Login,Integer> {

	public Login findAllByUsernameAndPassword(String username,String password);
	
	
	
}
