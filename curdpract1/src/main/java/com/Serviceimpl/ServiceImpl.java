package com.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DaoInterface.DaoIn;
import com.ServiceInterface.ServiceIn;
import com.model.Student;
@Service
public class ServiceImpl implements ServiceIn{
@Autowired
DaoIn dao;
	@Override
	public Student save(Student s) {
		System.out.println("In service save");
		return dao.save(s);
	}
	@Override
	public Student findAllById(int i) {
		System.out.println("In findAllById() of service implementation");
		return dao.findAllById(i);
	}

}
