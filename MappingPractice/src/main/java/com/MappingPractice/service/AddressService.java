package com.MappingPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.MappingPractice.Model.Address;
import com.MappingPractice.Repo.AddressRepo;

@Service
public class AddressService {

	@Autowired
	AddressRepo addressrepo;
	
	
	public void addAddress(@RequestBody Address address) {
		addressrepo.save(address);
	}
	
	
	public String updateAddress(Address address) {
		Address adr = addressrepo.findById(address.getId()).get();
		if(adr!=null) {
			addressrepo.save(address);
			return "Address succfully Updated"; 
		}
		
		return " There Is no Excisting Id hence new Addres created Address updated";
	}
	
	
	public String deleteAddress(@PathVariable String id) {
		Address adr = addressrepo.findById(id).get();
		if(adr!=null) {
			addressrepo.deleteById(id);
			return "Address successfully Delated";
		}
		return "There no Excisting Id";
	}
	
	
	public List<Address> getAddress(){
		 return addressrepo.findAll();
	}
}
