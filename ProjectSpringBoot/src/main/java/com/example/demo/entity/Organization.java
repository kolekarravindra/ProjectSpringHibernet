package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orgid;
	private String orgname;
	private String orgtype;
	private String delid;
	
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Organization(int orgid, String orgname, String orgtype,String delid) {
		super();
		this.orgid = orgid;
		this.orgname = orgname;
		this.orgtype = orgtype;
		this.delid = delid;

	}



	public String getDelid() {
		return delid;
	}



	public void setDelid(String delid) {
		this.delid = delid;
	}



	public int getOrgid() {
		return orgid;
	}
	
	public void setOrgid(int orgid) {
		this.orgid = orgid;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getOrgtype() {
		return orgtype;
	}
	public void setOrgtype(String orgtype) {
		this.orgtype = orgtype;
	}
	

	

}
