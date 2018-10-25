package com.ServiceInterface;

import java.util.List;

import com.model.Login;
import com.model.Student;

public interface ServiceIn {
public Student save(Student s);
public Login findAllByUsernameAndPassword(String username,String password);
public List<Student> getAll(Student s);
public List<Student> delete(Student s);
}
