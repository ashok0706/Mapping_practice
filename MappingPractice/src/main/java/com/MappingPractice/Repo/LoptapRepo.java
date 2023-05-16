package com.MappingPractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MappingPractice.Model.Loptap;
@Repository
public interface LoptapRepo extends JpaRepository<Loptap, String>{

}
