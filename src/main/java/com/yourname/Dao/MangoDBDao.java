package com.yourname.Dao;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yourname.Dao.Interface.StudentDao;
import com.yourname.Entity.Student;

@Repository
@Qualifier(value="mangodb")
public class MangoDBDao implements StudentDao {

	@Override
	public Collection<Student> getAllStudents() {

		return new ArrayList<Student>() {
			{
				add(new Student(555, "Namo Narashimaiah", "narayanaya"));
			}
		};
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void udpateStudentById(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertStudentById(Student student) {
		// TODO Auto-generated method stub

	}

}
