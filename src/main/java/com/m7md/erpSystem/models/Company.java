package com.m7md.erpSystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long id;
	@Column(nullable = false, updatable = true)
	private String name;
	@Column(nullable = false, updatable = true)
	private String email;
	@Column(nullable = false, updatable = true)
	private long telephone;
	@Column(nullable = true, updatable = true)
	private String address;

	public Company() {
	}

	public Company(long id) {
		this.id = id;
	}

	public Company(long id, String name, String email, long telephone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.address = address;
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

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", telephone="
				+ telephone + ", address='" + address + '\'' + '}';
	}
}
