package com.ecommerceclone.shopping.application.service;

import org.springframework.http.ResponseEntity;

import com.ecommerceclone.shopping.application.requestdto.UserRequest;
import com.ecommerceclone.shopping.application.responsedto.UserResponse;
import com.ecommerceclone.shopping.application.utility.ResponseStructure;

public interface AuthService {

	ResponseEntity<ResponseStructure<UserResponse>> registerAdmin(UserRequest userrequest);

}
