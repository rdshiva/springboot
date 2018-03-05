package com.yourname.Dao.Interface;

import java.util.Collection;

import com.yourname.Entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	void deleteStudentById(int id);

	void udpateStudentById(Student student);

	void insertStudentById(Student student);

}