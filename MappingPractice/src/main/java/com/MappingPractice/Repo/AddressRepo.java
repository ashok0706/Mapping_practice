package com.MappingPractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MappingPractice.Model.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, String>{

}
