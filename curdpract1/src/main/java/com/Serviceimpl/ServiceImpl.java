package com.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DaoInterface.DaoIn;
import com.DaoInterface.DaoInLogin;
import com.ServiceInterface.ServiceIn;
import com.model.Login;
import com.model.Student;
@Service
public class ServiceImpl implements ServiceIn{
@Autowired
DaoIn dao;
@Autowired
DaoInLogin daol;
	@Override
	public Student save(Student s) {
		System.out.println("In service save");
		return dao.save(s);
	}

	@Override
	public Student findAllById(int i) {
		System.out.println("In findAllById() of service implementation");
		return dao.findOne(i);
	}
	
	
	public Student updateStudent(Student s) {
		System.out.println("In update of service"+s.getName());
		
		return dao.save(s);
	}
	
	
	public Login findAllByUsernameAndPassword(String username, String password) {
		System.out.println("login page");
		System.out.println(username);
		Login l=daol.findAllByUsernameAndPassword(username, password);
		return l ;
	}
	
	public List<Student> getAll(Student s)
	{
		System.out.println("getAll data");
		
		return (List<Student>) dao.findAll();
		
	}
	
	public List<Student> delete(Student s)
	{
		dao.delete(s.getId());
		return getAll(s);
		
	}
	

}
