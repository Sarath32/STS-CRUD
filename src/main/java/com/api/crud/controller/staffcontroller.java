package com.api.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.entity.staffdetails;
import com.api.crud.exception.responsestatus;
import com.api.crud.repository.repository;

@RestController
@RequestMapping("/api/compstaffdetails")
@CrossOrigin(origins="http://localhost:3001")
public class staffcontroller {

	@Autowired
	public repository starepo;
	
	@GetMapping
	public List<staffdetails> getalldetails(){
		
		return this.starepo.findAll();
		
	}
	
	@PostMapping
	public staffdetails addstaff(@RequestBody staffdetails stadet) {
		
		return this.starepo.save(stadet);
		
	}
	
	@PutMapping("/{id}")
	public staffdetails updatestaff(@RequestBody staffdetails stadet,@PathVariable("id")long staffid) {
		
		staffdetails existingstaff=this.starepo.findById(staffid).orElseThrow(()->new responsestatus("ID Mismatch"));
		
		
		existingstaff.setStaffname(stadet.getStaffname());;
		existingstaff.setStaffaddress(stadet.getStaffaddress());;
		existingstaff.setStaffsalary(stadet.getStaffsalary());;
		existingstaff.setStaffage(stadet.getStaffage());;
		
		return this.starepo.save(existingstaff);
	
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<staffdetails> deletestaff(@PathVariable("id")long staffid){
		
		staffdetails existingstaff=this.starepo.findById(staffid).orElseThrow(()-> new responsestatus("ID Mismatch")); 
	
		this.starepo.delete(existingstaff);

		return ResponseEntity.ok().build();
	}
	//get user By ID
			@GetMapping("/{id}")
			public staffdetails getUserById(@PathVariable(value="id") long staffid)
			{
				return this.starepo.findById(staffid).orElseThrow(()->new responsestatus("ID Mismatch"));
		
				
			}
	
}
