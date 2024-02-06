package com.ecommerceclone.shopping.application.utility;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseStructure<T> {
	
		private int status;
		private String message;
		private T data;
	
}