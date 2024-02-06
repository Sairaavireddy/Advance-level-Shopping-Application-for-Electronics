package com.ecommerceclone.shopping.application.requestdto;

import com.ecommerceclone.shopping.application.enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

	private String email;
	private String  password;
	private UserRole userRole;
	
}
