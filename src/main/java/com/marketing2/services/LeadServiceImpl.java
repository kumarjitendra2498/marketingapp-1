package com.marketing2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing2.repository.LeadRepository;
import com.marketing2.entity.Lead;

@Service
public class LeadServiceImpl implements LeadService {
@Autowired
private LeadRepository leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	
	}

	@Override
	public List<Lead> listLead() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteByid(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public Lead updateLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public Lead getOneLead(long id) {

		return null;
	}

	

}
