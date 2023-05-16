package com.MappingPractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MappingPractice.Model.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course, String>{

}
