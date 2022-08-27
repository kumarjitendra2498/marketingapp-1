package com.marketing2.controller;

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

import com.marketing2.entity.Lead;
import com.marketing2.services.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
@Autowired
	private LeadService leadService;

	@GetMapping
	public List<Lead> getAllLeads(){
		List<Lead> leads = leadService.listLead();
		return leads;	
	}
	@PostMapping
public void saveOneLead(@RequestBody Lead lead) {
	leadService.saveLead(lead);
}
	@DeleteMapping("/delete/{id}")
	public void deleteOneLead(@PathVariable long id) {
		leadService.deleteByid(id);
		
	}
	
	@PutMapping
		public void updateOneLead(@RequestBody Lead lead) {
		leadService.saveLead(lead);
		
	}
@GetMapping ("/leadinfo/{id}")
public Lead getOneLead(@PathVariable("id") long id) {
	Lead lead = leadService.getOneLead(id);
	return lead;
	
}
	
}
