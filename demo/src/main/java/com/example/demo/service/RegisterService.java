package com.example.demo.service;

import com.example.demo.entity.RegisterEntity;

public interface RegisterService {
	
	public boolean registerClient(RegisterEntity register);
	
	public boolean loginClient(String email, String password);

	
	

}
