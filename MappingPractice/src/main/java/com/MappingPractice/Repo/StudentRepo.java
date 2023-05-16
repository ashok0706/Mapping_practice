package com.MappingPractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MappingPractice.Model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, String>{

}
