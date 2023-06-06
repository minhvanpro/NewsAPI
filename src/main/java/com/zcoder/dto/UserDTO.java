package com.zcoder.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
	private String fullName;
	private List<CommentDTO> comment = new ArrayList<CommentDTO>();
	private List<String> roles = new ArrayList<String>();
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public List<CommentDTO> getComment() {
		return comment;
	}
	public void setComment(List<CommentDTO> comment) {
		this.comment = comment;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
}
