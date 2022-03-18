package com.capg.springboot.repository;
import com.capg.springboot.entity.*;
import com.capg.springboot.exceptions.*;
public interface ContactRepository {
	static Contact findContactById(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	Contact addContact(Contact add);

	Contact viewContactBy(String customerId) throws UserNotFoundException;

	Contact save(Contact add);

	Contact updateContact(Contact add);


}
