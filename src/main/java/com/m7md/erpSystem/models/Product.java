package com.m7md.erpSystem.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    @Column(nullable = false, updatable = true)
    private String name;
    @Column(nullable = false, updatable = true)
    private String brand;
    @Column(nullable = true, updatable = true)
    private String description;
    @Column(nullable = true, updatable = true)
    private String type;
    @Column(nullable = true, updatable = true)
    private String forCar;
    @Column(nullable = false, updatable = true)
    private int quantity;
    @Column(nullable = true, updatable = true)
    private float purchasePrice;
    @Column(nullable = true, updatable = true)
    private float salePrice;

    public Product() {
    }

    public Product(long id) {
        this.id = id;
    }

    public Product(long id, String name, String brand, String description, String type, String forCar, int quantity, float purchasePrice, float salePrice) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.type = type;
        this.forCar = forCar;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getForCar() {
        return forCar;
    }

    public void setForCar(String forCar) {
        this.forCar = forCar;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", forCar='" + forCar + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void setProductCode(String toString) {
    }
}
