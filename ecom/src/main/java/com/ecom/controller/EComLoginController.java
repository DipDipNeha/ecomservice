package com.ecom.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.UserProfile;
import com.ecom.model.Response;
import com.ecom.service.impl.EComServiceImpl;

@RestController
@RequestMapping("/userlogin")
public class EComLoginController {
	

	private EComServiceImpl eComServiceImpl;

	public EComLoginController(EComServiceImpl eComServiceImpl) {
		this.eComServiceImpl = eComServiceImpl;
	}

	@PostMapping("/signup")
	public ResponseEntity<Response> signup(@RequestBody UserProfile profile){
		
		Response signup = eComServiceImpl.signup(profile);
		return new ResponseEntity<Response>(signup,HttpStatus.OK);
		
	}
	
	@PostMapping("/signin")
	public ResponseEntity<Response> signin(@RequestBody UserProfile profile){
		
		Response signin = eComServiceImpl.signin(profile);
		return new ResponseEntity<Response>(signin,HttpStatus.OK);
		
	}
	
	
}
