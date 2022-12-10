package com.api.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compstaffdetails")
public class staffdetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="name")
	private String staffname;
	@Column(name="address")
	private String staffaddress;
	@Column(name="salary")
	private long staffsalary;
	@Column(name="age")
	private String staffage;
	
	public staffdetails() {
		
	}

	public staffdetails(String staffname, String staffaddress, long staffsalary, String staffage) {
		super();
		this.staffname = staffname;
		this.staffaddress = staffaddress;
		this.staffsalary = staffsalary;
		this.staffage = staffage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getStaffaddress() {
		return staffaddress;
	}

	public void setStaffaddress(String staffaddress) {
		this.staffaddress = staffaddress;
	}

	public long getStaffsalary() {
		return staffsalary;
	}

	public void setStaffsalary(long staffsalary) {
		this.staffsalary = staffsalary;
	}

	public String getStaffage() {
		return staffage;
	}

	public void setStaffage(String staffage) {
		this.staffage = staffage;
	}

	
	
	
	
	
}
