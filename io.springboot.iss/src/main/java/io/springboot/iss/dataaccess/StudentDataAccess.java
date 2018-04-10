package io.springboot.iss.dataaccess;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springboot.iss.Students;
import io.springboot.iss.repository.StudentsRepository;

@Service
public class StudentDataAccess {
	@Autowired
	StudentsRepository studentRepository;
	
	public Students createNewStudents(Students s)
	{
		return studentRepository.save(s);
	}
	
	public java.util.List<Students> findAllStudents()
	{
		return studentRepository.findAll();
	}
	
	public Students findStudent(Long id)
	{
		return studentRepository.findOne(id);
	}
	
	public void deleteStudent(Students s)
	{
		 studentRepository.delete(s);
	}
}
