package com.capg.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capg.springboot.entity.*;
import com.capg.springboot.exceptions.*;
import com.capg.springboot.repository.*;


public class ContactServiceImpl implements ContactRepository{
	@Autowired
	private ContactRepository contactRepository;
	
	//Add User
	@Override
	public Contact addContact(Contact add) {
		
		return contactRepository.save(add);
		
	}
	
	//Modify User
	@Override
	public Contact updateContact(Contact add) {
		contactRepository.save(add);
		return add;
	}
	
	//Delete User
	@Override
	public Contact viewContactBy(String customerid) throws UserNotFoundException {
		Contact add=ContactRepository.findContactById(customerid);
            if(add==null)
            	throw new UserNotFoundException("Contact Not Found ");
        return add;
	}

	@Override
	public Contact save(Contact add) {
		// TODO Auto-generated method stub
		return null;
	}

}
