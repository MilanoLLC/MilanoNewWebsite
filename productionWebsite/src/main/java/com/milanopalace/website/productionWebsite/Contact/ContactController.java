package com.milanopalace.website.productionWebsite.Contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService ; 

	
	@PostMapping("/submitContactRequest")
	public ContactForm submitContactForm(@RequestBody ContactForm form ) {
		return contactService.submitForm(form);
	}
	
	@GetMapping("/geta/cont/list")
	public List<ContactForm> getAll(){
		return contactService.getAll();
	}
	
	
}
