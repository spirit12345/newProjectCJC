package com.DaoInterface;

import org.springframework.data.repository.CrudRepository;

import com.model.Student;

public interface DaoIn extends CrudRepository<Student, Integer> {

}
