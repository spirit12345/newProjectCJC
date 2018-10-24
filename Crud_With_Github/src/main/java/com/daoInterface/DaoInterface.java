package com.daoInterface;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;

public interface DaoInterface extends CrudRepository<Login, Integer>{

}
