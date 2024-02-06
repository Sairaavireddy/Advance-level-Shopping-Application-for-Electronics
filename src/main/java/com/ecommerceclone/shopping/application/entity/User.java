package com.ecommerceclone.shopping.application.entity;

import com.ecommerceclone.shopping.application.enums.UserRole;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Builder
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int userId;
	private String username;
	private String email;
	private String  password;
	private UserRole userRole;
	private boolean isEmailVerified;
	private boolean isDeleted;

}
