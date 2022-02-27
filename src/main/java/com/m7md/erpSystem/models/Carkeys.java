package com.m7md.erpSystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class Carkeys implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long id;
	@Column(nullable = false, updatable = true)
	private String brand;
	@Column(nullable = true, updatable = true)
	private String car;

	public Carkeys(long id, String brand, String car) {
		super();
		this.id = id;
		this.brand = brand;
		this.car = car;
	}

	public Carkeys(long id) {
		super();
		this.id = id;
	}

	public Carkeys() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarKeys [id=" + id + ", brand=" + brand + ", car=" + car + "]";
	}

}
