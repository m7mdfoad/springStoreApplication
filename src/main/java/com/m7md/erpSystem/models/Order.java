package com.m7md.erpSystem.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private long id;
    @Column(nullable = false, updatable = true)
    private long productId;
    @Column(nullable = false, updatable = true)
    //FK
    private String productName;
    @Column(nullable = false, updatable = true)
    //FK
    private String productBrand;
    @Column(nullable = false, updatable = true)
    //FK
    private String ProductType;
    @Column(updatable = false, nullable = false)
    private Date orderDate;
    @Column(updatable = true, nullable = true)
    private String warranty;
    @Column(updatable = true, nullable = false)
    private int quantity;
    @Column(updatable = true, nullable = true)
    private float discount;
    @Column(updatable = true, nullable = false)
    private double price;
    @Column(updatable = true, nullable = false)
    private double afterDiscountPrice;
    @Column(updatable = true, nullable = false)
    private double installation;
    @Column(updatable = true, nullable = false)
    private double totalPrice;

    public Order() {
    }

    public Order(long id) {
        this.id = id;
    }

    public Order(long id, long productId, String productName, String productBrand, String productType, Date orderDate, String warranty, int quantity, float discount, double price, double afterDiscountPrice, double installation, double totalPrice) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.productBrand = productBrand;
        this.ProductType = productType;
        this.orderDate = orderDate;
        this.warranty = warranty;
        this.quantity = quantity;
        this.discount = discount;
        this.price = price;
        this.afterDiscountPrice = afterDiscountPrice;
        this.installation = installation;
        this.totalPrice = totalPrice;
    }

    public long getId() {
        return id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAfterDiscountPrice() {
        return afterDiscountPrice;
    }

    public void setAfterDiscountPrice(double afterDiscountPrice) {
        this.afterDiscountPrice = afterDiscountPrice;
    }

    public double getInstallation() {
        return installation;
    }

    public void setInstallation(double installation) {
        this.installation = installation;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productId=" + productId +
                ", productName=" + productName +
                ", productBrand=" + productBrand +
                ", ProductType=" + ProductType +
                ", orderDate=" + orderDate +
                ", warranty='" + warranty + '\'' +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", price=" + price +
                ", afterDiscountPrice=" + afterDiscountPrice +
                ", installation=" + installation +
                ", totalPrice=" + totalPrice +
                '}';
    }
}