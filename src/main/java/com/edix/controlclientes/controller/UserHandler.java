package com.edix.controlclientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edix.controlclientes.model.repository.IntUserDao;

@Controller
@RequestMapping("/users")
public class UserHandler {
	@Autowired
	private IntUserDao udao;
	
	@GetMapping("/login")
	public String logUser;
	public int 
	
	

}