package com.crm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Contact;
import com.crm.entities.Lead;
import com.crm.repositories.ContactRepository;
import com.crm.repositories.LeadRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired	
	private ContactRepository contactRepo;
	
	@Override
	public void saveLead(Contact contact) {
		
		contactRepo.save(contact);
		
	}

	@Override
	public List<Contact> getAllContact() {
		
		List<Contact> contacts = contactRepo.findAll();
		
		return contacts;
	}

	@Override
	public Contact findById(long id) {
		
		Optional<Contact> findById = contactRepo.findById(id);
		
		Contact contact = findById.get();
		
		return contact;
	}
	
	

}
