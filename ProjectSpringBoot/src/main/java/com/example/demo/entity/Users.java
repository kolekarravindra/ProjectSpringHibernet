package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String username;
	private String password;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="roleid",nullable = false)
	private Role role;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="trid",nullable = false)
	private Terminal terminial;

	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Users(int uid, String username, String password, Role role, Terminal terminial) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.role = role;
		this.terminial = terminial;
	}



	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Terminal getTerminial() {
		return terminial;
	}

	public void setTerminial(Terminal terminial) {
		this.terminial = terminial;
	}
	
	
	
}
