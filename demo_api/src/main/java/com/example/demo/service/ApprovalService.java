package com.example.demo.service;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class ApprovalService {
	
    // BRONZE / SILVER / GOLD
	private int client_member_grade;
	
	
	public String clientGrade(int client_number) {
		
		if (client_number == 1) {
			return "APRROVED";
		} else {
			return "REJECTED";
		}
		
	}
 

}
