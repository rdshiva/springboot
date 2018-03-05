package com.yourname.controller;


import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.yourname.Entity.Student;
import com.yourname.Services.StudentService;

@RestController
@RequestMapping(value="/students")
public class StudentsController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		return this.studentService.getAllStudents();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return this.studentService.getStudentById(id);
	}
		
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteStudentById(@PathVariable("id") int id) {
		this.studentService.deleteStudentById(id);
		 return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.PUT, consumes= MediaType.APPLICATION_JSON_VALUE)
	public void udpateStudentById(@RequestBody Student student) {
		studentService.udpateStudentById(student);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	public void insertStudentById(@RequestBody Student student) {
		studentService.insertStudentById(student);
	}
	
}
