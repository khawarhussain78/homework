package com.homework.homewrok.services;
import java.util.List;

import com.homework.homework.entities.Student;
public interface StudentService {
	//creating interface to maintain loose coupling


	public List<Student> getStudents();

	public Student getID(long studentID);
	public Student addStudent(Student s);

}
