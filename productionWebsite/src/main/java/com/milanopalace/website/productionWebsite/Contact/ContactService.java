package com.milanopalace.website.productionWebsite.Contact;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

	@Autowired
	private ContactFormRepository contactFormRepository ;
	
	public ContactForm submitForm(ContactForm request) {
		request.setSentOn(new Date());
		return contactFormRepository.save(request);
	}
	
	public List<ContactForm> getAll(){
		return contactFormRepository.findAll() ; 
	}
	
}
