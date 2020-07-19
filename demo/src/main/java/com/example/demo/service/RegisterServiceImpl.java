package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.RegisterEntity;
import com.example.demo.respository.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);
	
	@Autowired
	RegisterRepository registerRepository;

	@Override
	public boolean registerClient(RegisterEntity register) {
		try
		{
			
		registerRepository.save(register);
		logger.info("register saved in database");
		return true;
		}
		catch(Exception e)
		{
			logger.error("error occured in resgister");
			return false;
		}
		
	}

	@Override
	public boolean loginClient(String email, String password) {
		
		RegisterEntity entity;
		
		entity = registerRepository.findByEmailAndPassword(email,password);
		if(entity!=null)
		{
			return true;
		}
		return false;
	}
	
	
}
