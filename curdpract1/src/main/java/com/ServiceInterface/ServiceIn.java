package com.ServiceInterface;

import java.util.List;

import com.model.Student;

public interface ServiceIn {
public Student save(Student s);
public Student findAllById(int i);
List getAllRecord();
List<Student> updateStudent(Student s);
}
