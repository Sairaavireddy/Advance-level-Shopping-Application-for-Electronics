package com.ecommerceclone.shopping.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceclone.shopping.application.requestdto.UserRequest;
import com.ecommerceclone.shopping.application.responsedto.UserResponse;
import com.ecommerceclone.shopping.application.service.AuthService;
import com.ecommerceclone.shopping.application.utility.ResponseStructure;

@RestController
public class AuthController {
	
	@Autowired
	private AuthService authservice;
	
	@PostMapping("/register")
	public ResponseEntity<ResponseStructure<UserResponse>> registerUser(@RequestBody UserRequest userrequest) {
		return authservice.registerAdmin(userrequest);	
	}

}
