package com.yourname.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yourname.Dao.Interface.StudentDao;
import com.yourname.Entity.Student;

@Repository
@Qualifier(value="StudentDaodb")
public class StudentDaoimpl implements StudentDao {

	private static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>() {
			{
				put(1, new Student(1,"Shiva","Mechanical Eng"));
				put(2, new Student(2,"Ram","-----Mechanical Eng"));
				put(3, new Student(3,"Spring","Software  Eng"));
			}
		};
	}
	
	/* (non-Javadoc)
	 * @see com.yourname.Dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	/* (non-Javadoc)
	 * @see com.yourname.Dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		return this.students.get(id);
	}

	/* (non-Javadoc)
	 * @see com.yourname.Dao.StudentDao#deleteStudentById(int)
	 */
	@Override
	public void deleteStudentById(int id) {
		this.students.remove(id);
	}
	
	/* (non-Javadoc)
	 * @see com.yourname.Dao.StudentDao#udpateStudentById(com.yourname.Entity.Student)
	 */
	@Override
	public void udpateStudentById(Student student) {
		
		Student s = students.get(student.getId());
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		
		students.put(student.getId(), s);	
	}
	
	/* (non-Javadoc)
	 * @see com.yourname.Dao.StudentDao#insertStudentById(com.yourname.Entity.Student)
	 */
	@Override
	public void insertStudentById(Student student) {
		
		students.put(student.getId(), student);	
	}
}
