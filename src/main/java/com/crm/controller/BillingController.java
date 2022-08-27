package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.entities.Billing;
import com.crm.services.BillingService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingservice;
	
	@RequestMapping("/generateBill")
	public String generateBill(Billing bill,ModelMap model) {
		
		billingservice.saveBill(bill);
		
		model.addAttribute("bill", bill);
		
		return "final_billing_info";
	}
	@RequestMapping("/getReport")
	public String getReport(ModelMap model) {
		
		List<Billing> bill = billingservice.getAllReport();
		
		model.addAttribute("bills", bill);
		
		return "billing_result";
	}

}
