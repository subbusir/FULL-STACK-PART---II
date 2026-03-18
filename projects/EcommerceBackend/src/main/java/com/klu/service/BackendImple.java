package com.klu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.User;
import com.klu.repository.EcommerceRepo;

@Service

public class BackendImple implements BackendOperations {
@Autowired
private EcommerceRepo repo;
	@Override
	public User kluRegister(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

}
