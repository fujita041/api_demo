package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class ApprovalRequestResponse {
	
	@ApiModelProperty(value = "APPROVED/REJECTED")
	private String status;

}
