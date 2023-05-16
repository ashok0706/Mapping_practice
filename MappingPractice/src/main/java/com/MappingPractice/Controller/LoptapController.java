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

import com.MappingPractice.Model.Loptap;
import com.MappingPractice.service.LoptapService;

@RestController
@RequestMapping("/Laptop")
public class LoptapController {

	@Autowired
	LoptapService LoptapService;
	
	@PostMapping("/add")
	public void addLoptap(@RequestBody Loptap Loptap) {
		LoptapService.addLoptap(Loptap);
	}
	
	@PutMapping("/update")
	public String updateLoptap(Loptap Loptap) {
		return LoptapService.updateLoptap(Loptap);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLoptap(@PathVariable String id) {
		return LoptapService.deleteLoptap(id);
	}
	
	@GetMapping("/get")
	public List<Loptap> getLoptapes(){
		return	LoptapService.getLoptap();
	}

}
