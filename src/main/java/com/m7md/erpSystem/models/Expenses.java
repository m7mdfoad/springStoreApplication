package com.m7md.erpSystem.models;

import com.m7md.erpSystem.enums.ProductCategory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Expenses implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    //fk
    @Column(nullable = false, updatable = true)
    private String name;
    //FK
    @Column(nullable = false, updatable = true)
    private String brand;
    //FK
    @Column(nullable = false, updatable = true)
    private String type;
    @Column(nullable = false, updatable = true)
    private String Description;
    @Column(nullable = false, updatable = true)
    private String agent;
    @Column(nullable = false, updatable = true)
    private double price;
    @Column(nullable = false, updatable = true)
    private Date PurchaseDate;
    @Column(nullable = false, updatable = true)
    private ProductCategory productCategory;

    public Expenses() {
    }

    public Expenses(long id) {
        this.id = id;
    }

    public Expenses(long id, String name, String brand, String type, String description, String agent, double price, Date purchaseDate, ProductCategory productCategory) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        Description = description;
        this.agent = agent;
        this.price = price;
        PurchaseDate = purchaseDate;
        this.productCategory = productCategory;
    }

    public long getId() {
        return id;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        PurchaseDate = purchaseDate;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", Description='" + Description + '\'' +
                ", agent='" + agent + '\'' +
                ", price=" + price +
                ", PurchaseDate=" + PurchaseDate +
                ", category=" + productCategory +
                '}';
    }
}
