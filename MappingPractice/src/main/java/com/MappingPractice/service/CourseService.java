package com.MappingPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.MappingPractice.Model.Course;
import com.MappingPractice.Repo.CourseRepo;

@Service
public class CourseService {

	@Autowired
	CourseRepo Courserepo;
	
	
	public void addCourse(@RequestBody Course Course) {
		Courserepo.save(Course);
	}
	
	
	public String updateCourse(Course Course) {
		Course adr = Courserepo.findById(Course.getID()).get();
		if(adr!=null) {
			Courserepo.save(Course);
			return "Course succfully Updated"; 
		}
		
		return " There Is no Excisting Id hence new Addres created Course updated";
	}
	
	
	public String deleteCourse(@PathVariable String id) {
		Course adr = Courserepo.findById(id).get();
		if(adr!=null) {
			Courserepo.deleteById(id);
			return "Course successfully Delated";
		}
		return "There no Excisting Id";
	}
	
	
	public List<Course> getCourse(){
		 return Courserepo.findAll();
	}
}
