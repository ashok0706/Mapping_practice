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

import com.MappingPractice.Model.Address;
import com.MappingPractice.service.AddressService;
//import com.MappingPractice.repo.AddressService;


@RestController

@RequestMapping("/Address")
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/add")
	public void addAddress(@RequestBody Address address) {
		addressService.addAddress(address);
	}
	
	@PutMapping("/update")
	public String updateAddress(Address address) {
		return addressService.updateAddress(address);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAddress(@PathVariable String id) {
		return addressService.deleteAddress(id);
	}
	
	@GetMapping("/get")
	public List<Address> getAddresses(){
		 return addressService.getAddress();
	}
}
