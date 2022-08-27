package com.marketing2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing2.dto.LeadData;
import com.marketing2.entity.Lead;
import com.marketing2.services.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
@RequestMapping("/createLead")
	public String createLeadpage() {
		return "create";
	}

@RequestMapping("/saveLead")
public String saveLead( @ModelAttribute ("lead") Lead lead, ModelMap model) {
	leadService.saveLead(lead);
	model.addAttribute("msg", "Details saved!!");	
	return "create";
	
}

@RequestMapping("/listAll")
public String listAllLeads(ModelMap model) {
	List<Lead> leads = leadService.listLead();
	model.addAttribute("leads",leads);
	return "list_lead";	
}

@RequestMapping("/delete")
public String deleteLeads(@RequestParam("id") long id, ModelMap model) {
	leadService.deleteByid(id);
	List<Lead> leads = leadService.listLead();
	model.addAttribute("leads",leads);
	return "list_lead";
	
}

@RequestMapping("/update")
public String updateLead(@RequestParam("id")long id,ModelMap model) {
	Lead lead = leadService.updateLead(id);
	model.addAttribute("lead",lead);
	return "update";
}
@RequestMapping("/updateLead")
public String updateOneLeadData(LeadData data,ModelMap model) {
	Lead lead= new Lead();
	
lead.setId(data.getId());
lead.setFirst_name(data.getFirst_name());
lead.setLast_name(data.getLast_name());
lead.setCity(data.getCity());
lead.setEmail(data.getEmail());
lead.setMobile_number(data.getMobile_number());
	
	leadService.saveLead(lead);
	
	List<Lead> leads = leadService.listLead();
	model.addAttribute("leads",leads);
	return "list_lead";
	
}
}

