package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.utilities.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailservice;

	@RequestMapping("/sendEmail")
	public String showEmailPage(@RequestParam("email") String email,ModelMap model) {
		
		model.addAttribute("to", email);
		
		return "compose_email";
		
	}
	@RequestMapping("send")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("sub") String sub,@RequestParam("message") String message,ModelMap model) {   
		
		emailservice.sendSimpleMessage(to, sub, message);
		
		model.addAttribute("msg", "Email sent");
		
		return "compose_email";
		
	}
}
