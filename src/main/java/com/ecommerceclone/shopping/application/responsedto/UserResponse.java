package com.ecommerceclone.shopping.application.responsedto;

import com.ecommerceclone.shopping.application.enums.UserRole;
import com.ecommerceclone.shopping.application.requestdto.UserRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
	private int userId;
	private String username;
	private String email;
	private UserRole userRole;
	private boolean isEmailVerified;
	private boolean isDeleted;

}
