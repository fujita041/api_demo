package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ApprovalRequestForm;
import com.example.demo.entity.ApprovalRequestResponse;
import com.example.demo.service.ApprovalService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/")
public class ApprovalRequest {

	private ApprovalService approvalService;
	
	@Autowired
	public ApprovalRequest(ApprovalService approvalService) {
		this.approvalService = approvalService;
	}
	
	
	@PostMapping(path = "")
	@ApiOperation(value = "Get Approval")
	public ResponseEntity<ApprovalRequestResponse> getApproval(@RequestBody ApprovalRequestForm request) {
		
		ApprovalRequestResponse response = new ApprovalRequestResponse();
		response.setStatus(approvalService.clientGrade(request.getClient_number()));
		return ResponseEntity.ok(response);
		
	}
	
}
