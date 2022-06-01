package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Terminal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trid;
	private String trname;
	private String trtype;
	
	@ManyToOne
	//@JoinColumn(name="orgidfk",nullable = false)
    private Organization cdid;

	public Terminal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Terminal(int trid, String trname, String trtype, Organization cdid) {
		super();
		this.trid = trid;
		this.trname = trname;
		this.trtype = trtype;
		this.cdid = cdid;
	}

	public int getTrid() {
		return trid;
	}

	public void setTrid(int trid) {
		this.trid = trid;
	}

	public String getTrname() {
		return trname;
	}

	public void setTrname(String trname) {
		this.trname = trname;
	}

	public String getTrtype() {
		return trtype;
	}

	public void setTrtype(String trtype) {
		this.trtype = trtype;
	}

	public Organization getCdid() {
		return cdid;
	}

	public void setCdid(Organization cdid) {
		this.cdid = cdid;
	}
	
	
	

	
	
}
