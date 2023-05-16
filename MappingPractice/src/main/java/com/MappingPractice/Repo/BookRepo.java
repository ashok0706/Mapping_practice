package com.MappingPractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MappingPractice.Model.Book;
@Repository
public interface BookRepo extends JpaRepository<Book, String>{

}
