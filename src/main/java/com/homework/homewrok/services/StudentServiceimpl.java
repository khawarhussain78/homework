package com.homework.homewrok.services;

import java.util.ArrayList;
import java.util.List;

import com.homework.homework.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.homework.homework.entities.Student;

@Service
public class StudentServiceimpl implements StudentService {
     @Autowired
	private StudentDao studentDao;

	List<Student> list;
	 public StudentServiceimpl()
	   {

	   }
	
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		if(studentDao.findAll()==null)
		{

		}
		return studentDao.findAll();
	}

	public Student getID(long studentID) {
		return studentDao.findById(studentID).get();
	}
@Override
	public Student addStudent(Student s) {
        studentDao.save(s);
		return s;
	}


	public Student updateStudent(Student s) {
		studentDao.save(s);
		return s;
	}
	

}
