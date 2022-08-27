package com.crm.services;

import java.util.List;

import com.crm.entities.Lead;

public interface LeadService {

	public void saveLead(Lead lead);
	
	public List<Lead> getAllLead();

	public Lead findById(long id);

	public void deleteLeadById(long id);

	public List<Lead> showAllLead();

	public void deleteLead(long id);
	
}
