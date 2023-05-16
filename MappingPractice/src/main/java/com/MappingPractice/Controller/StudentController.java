package com.MappingPractice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MappingPractice.Model.Student;
import com.MappingPractice.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentService StudentService;
	
	@PostMapping("/add")
	public void addStudent(@RequestBody Student Student) {
		StudentService.addStudent(Student);
	}
	
	@PutMapping("/update")
	public String updateStudent(Student Student) {
		return StudentService.updateStudent(Student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable String id) {
		return StudentService.deleteStudent(id);
	}
	
	@GetMapping("/get")
	public List<Student> getStudentes(){
		return StudentService.getStudent();
	}
}
