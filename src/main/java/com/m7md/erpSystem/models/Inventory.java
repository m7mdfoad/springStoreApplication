package com.m7md.erpSystem.models;

import com.m7md.erpSystem.enums.Category;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Inventory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, unique = true)
    private long product_id;
    @Column(nullable = false, updatable = true)
    private String name;
    @Column(nullable = false, updatable = true)
    private String brand;
    @Column(nullable = false, updatable = true)
    private String type;
    @Column(nullable = false, updatable = true)
    private String shelf;
    @Column(nullable = false, updatable = true)
    private double price;
    @Column(nullable = false, updatable = true)
    private int quantity;
    @Column(nullable = false, updatable = true)
    private Category category;

    public Inventory() {
    }

    public Inventory(long id) {
        this.product_id = id;
    }

    public Inventory(long id, String name, String brand, String type, String shelf, double price, int quantity, Category category) {
        this.product_id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.shelf = shelf;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public long getId() {
        return product_id;
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

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + product_id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", shelf='" + shelf + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category=" + category +
                '}';
    }
}

