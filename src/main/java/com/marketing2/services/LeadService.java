package com.marketing2.services;

import java.util.List;

import com.marketing2.entity.Lead;

public interface LeadService {

	public void saveLead(Lead lead);

	public List<Lead> listLead();

	public void deleteByid(long id);

	public Lead updateLead(long id);

	public Lead getOneLead(long id);



	
	
	
}
