package com.zcoder.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
	@Column(name = "username")
	private String userName;

	@Column
	private String password;

	@Column(name = "fullname")
	private String fullName;
	
	@OneToMany(mappedBy = "user")
	private List<CommentEntity> comment = new ArrayList<CommentEntity>();

	@OneToMany(mappedBy = "user")
	private List<CommentReplyEntity> commentReply  = new ArrayList<CommentReplyEntity>();
	
	@ManyToMany
	@JoinTable(name = "user_role", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<RoleEntity> roles = new ArrayList<RoleEntity>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<CommentEntity> getComment() {
		return comment;
	}

	public void setComment(List<CommentEntity> comment) {
		this.comment = comment;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public List<CommentReplyEntity> getCommentReply() {
		return commentReply;
	}

	public void setCommentReply(List<CommentReplyEntity> commentReply) {
		this.commentReply = commentReply;
	}
	
}
