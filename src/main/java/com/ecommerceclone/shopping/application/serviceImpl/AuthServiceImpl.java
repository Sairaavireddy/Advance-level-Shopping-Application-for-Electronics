package com.ecommerceclone.shopping.application.serviceImpl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerceclone.shopping.application.entity.User;
import com.ecommerceclone.shopping.application.requestdto.UserRequest;
import com.ecommerceclone.shopping.application.responsedto.UserResponse;
import com.ecommerceclone.shopping.application.service.AuthService;
import com.ecommerceclone.shopping.application.utility.ResponseStructure;
@Service
public class AuthServiceImpl implements AuthService {

	private <T extends User> T mapToUser(UserRequest request) {
		return (T)User.builder()
				.email(request.getEmail())
				.password(request.getPassword())
				.userRole(request.getUserRole())
				.build();
	}
	public UserResponse mapToUserResponse(User user, boolean isDeleted,boolean isEmailVerified) {
		return UserResponse.builder()
				.userId(user.getUserId())
				.username(user.getUsername())
				.email(user.getEmail())
				.userRole(user.getUserRole())
				.isDeleted(isDeleted) 
				.isEmailVerified(isEmailVerified)
				.build();
	}
	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> registerAdmin(UserRequest userrequest) {
		
	}

}
