package com.jsp.hospital.branch;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private int id;
	private String name;
	private String GSt_number;
	
	
	@OneToMany
	private List<Branch> branches;
	
	
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGSt_number() {
		return GSt_number;
	}
	public void setGSt_number(String gSt_number) {
		GSt_number = gSt_number;
	}
	

}
