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

import com.MappingPractice.Model.Course;
import com.MappingPractice.service.CourseService;

@RestController
@RequestMapping("/Course")
public class CourseController {

	@Autowired
	CourseService CourseService;
	
	@PostMapping("/add")
	public void addCourse(@RequestBody Course Course) {
		CourseService.addCourse(Course);
	}
	
	@PutMapping("/update")
	public String updateCourse(Course Course) {
		return CourseService.updateCourse(Course);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable String id) {
		return CourseService.deleteCourse(id);
	}
	
	@GetMapping("/get")
	public List<Course> getCoursees(){
		return CourseService.getCourse();
	}
}
