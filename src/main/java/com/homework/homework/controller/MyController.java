package com.homework.homework.controller;

import java.io.FileNotFoundException;
import java.util.List;

import com.homework.exception.GlobalExceptionHandler;
import com.homework.exception.IncorrectFileNameException;
import com.homework.exception.ResourceNotFoundException;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.homework.homework.entities.Student;
import com.homework.homewrok.services.StudentService;
import com.homework.homewrok.services.StudentServiceimpl;
@RestController
public class MyController {
	
	@Autowired
	private StudentServiceimpl myService;

	//Testing Connection
	@GetMapping("/home")
	public String home()
	{
		return "this is home";
	}

//	Get all Students
	@GetMapping("/student")
	public List<Student> getStudents()
	{
	return this.myService.getStudents();

	}

	//Get by ID
	@GetMapping("/studentByID")
	public Student getID(@RequestParam(name = "studentID") String studentID) throws IncorrectFileNameException {

		if(studentID!=null && !studentID.contains("null")) {
			try {
				return myService.getID(Long.parseLong(studentID));
			} catch(Exception e) {
				throw new IncorrectFileNameException("Student Id not Found...!");
			}
		}
		else {
			throw new IncorrectFileNameException("student Id not found...!");
		}

	}

	//Add Student
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student s)
	{
		return this.myService.addStudent(s);
		
	}

	//Update Student
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student s)
	{
		return this.myService.updateStudent(s);
	}
	 
}
