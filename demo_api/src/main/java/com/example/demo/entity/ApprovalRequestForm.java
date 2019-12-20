package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class ApprovalRequestForm {
	
	@ApiModelProperty(value = "Integer")
	private int client_number;
	
	@ApiModelProperty(value = "NORMAL / SPECIAL")
	private String member_class;
	
}
