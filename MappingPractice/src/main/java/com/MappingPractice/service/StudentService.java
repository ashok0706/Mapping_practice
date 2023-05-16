package com.MappingPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.MappingPractice.Model.Student;
import com.MappingPractice.Repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo Studentrepo;
	
	
	public void addStudent(@RequestBody Student Student) {
		Studentrepo.save(Student);
	}
	
	
	public String updateStudent(Student Student) {
		Student adr = Studentrepo.findById(Student.getID()).get();
		if(adr!=null) {
			Studentrepo.save(Student);
			return "Student succfully Updated"; 
		}
		
		return " There Is no Excisting Id hence new Addres created Student updated";
	}
	
	
	public String deleteStudent(@PathVariable String id) {
		Student adr = Studentrepo.findById(id).get();
		if(adr!=null) {
			Studentrepo.deleteById(id);
			return "Student successfully Delated";
		}
		return "There no Excisting Id";
	}
	
	
	public List<Student> getStudent(){
		 return Studentrepo.findAll();
	}
}
