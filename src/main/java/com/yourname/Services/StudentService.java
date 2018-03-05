package com.yourname.Services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yourname.Dao.Interface.StudentDao;
import com.yourname.Entity.Student;

@Service
public class StudentService {

	@Autowired
	@Qualifier(value="StudentDaodb")
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return this.studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	public void deleteStudentById(int id) {
		 this.studentDao.deleteStudentById(id);
	}

	public void udpateStudentById(Student student) {
		this.studentDao.udpateStudentById(student);
	}
	
	public void insertStudentById(Student student) {
		this.studentDao.insertStudentById(student);
	}
	
	
}
