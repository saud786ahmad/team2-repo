package com.crm.services;
import java.util.List;

import com.crm.entities.Contact;

public interface ContactService {

	public void saveLead(Contact contact);
	
    	public List<Contact> getAllContact();
    	
      	public Contact findById(long id);
	
}
