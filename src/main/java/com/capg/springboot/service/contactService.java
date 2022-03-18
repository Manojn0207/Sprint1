package com.capg.springboot.service;

import com.capg.springboot.dto.contactDto;
import com.capg.springboot.entity.Contact;

public interface contactService {

	Contact addContact(contactDto contact);

	Contact modifycontact(contactDto contact);

	Contact removeCustomer(contactDto contact);

}
