package com.MappingPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.MappingPractice.Model.Loptap;
import com.MappingPractice.Repo.LoptapRepo;

@Service
public class LoptapService {

	@Autowired
	LoptapRepo Loptaprepo;
	
	
	public void addLoptap(@RequestBody Loptap Loptap) {
		Loptaprepo.save(Loptap);
	}
	
	
	public String updateLoptap(Loptap Loptap) {
		Loptap adr = Loptaprepo.findById(Loptap.getID()).get();
		if(adr!=null) {
			Loptaprepo.save(Loptap);
			return "Loptap succfully Updated"; 
		}
		
		return " There Is no Excisting Id hence new Addres created Loptap updated";
	}
	
	
	public String deleteLoptap(@PathVariable String id) {
		Loptap adr = Loptaprepo.findById(id).get();
		if(adr!=null) {
			Loptaprepo.deleteById(id);
			return "Loptap successfully Delated";
		}
		return "There no Excisting Id";
	}
	
	
	public List<Loptap> getLoptap(){
		 return Loptaprepo.findAll();
	}
}
