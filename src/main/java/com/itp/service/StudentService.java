package com.itp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.model.Student;
import com.itp.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studRepo;
	
	public void insertStudent(Student student) throws Exception {
		studRepo.insertStudent(student);
		
	}

	public List<Student> allStudent() throws Exception {
		return studRepo.allStudent();
	}

	public void deleteStudent(int rno) throws Exception{
		studRepo.deleteStudent(rno);
		
	}

	public Student getStudent(int rno) throws Exception
	{
		return studRepo.getStudent(rno);
	}

	public void updateStudent(Student student) throws Exception{
		studRepo.updateStudent(student);
		
	}
	
	

}
