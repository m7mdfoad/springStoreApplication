package com.m7md.erpSystem.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long id;
	@Column(nullable = false, updatable = false)
	private String name;
	@Column(nullable = false, updatable = true)
	private String email;
	@Column(nullable = false, updatable = true)
	private String telephone;
	@Column(nullable = true, updatable = true)
	private String jobTitle;
	@Column(nullable = true, updatable = true)
	private String imageUrl;
	@Column(nullable = false, updatable = true)
	private String employeeCode;

	public Employee() {
	}

	public Employee(long id) {
		this.id = id;
	}

	public Employee(long id, String name, String email, String telephone, String jobTitle, String imageUrl, String employeeCode) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.jobTitle = jobTitle;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", telephone='" + telephone + '\'' +
				", jobTitle='" + jobTitle + '\'' +
				", imageUrl='" + imageUrl + '\'' +
				", employeeCode='" + employeeCode + '\'' +
				'}';
	}
}