package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Lead;
import com.crm.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservice;
	
    
	@RequestMapping("/viewleadpage")
	public String viewLeadPage() {
		
		return "save_lead";
	}
	@RequestMapping("/savelead")
	public String saveLead(Lead lead , ModelMap model) {
		leadservice.saveLead(lead);
		
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/listall")
	public String getLeads(ModelMap model) {
		
		List<Lead> leads = leadservice.getAllLead();
		model.addAttribute("leads", leads);
		return "leads_result";
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id ,ModelMap model) {
		
		Lead lead = leadservice.findById(id);
		
		model.addAttribute("lead", lead);
		
		return "lead_info";
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id,ModelMap model) {
		
		leadservice.deleteLead(id);
		List<Lead> leads = leadservice.getAllLead();
		model.addAttribute("leads", leads);
		
		  return "leads_result";
		
		
	}
	
}
