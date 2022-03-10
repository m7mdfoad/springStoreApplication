package com.m7md.erpSystem.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Invoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    @Column(nullable = true, updatable = true)
    private String address;
    @Column(nullable = true, updatable = true)
    private String invoiceOwner;
    @Column(nullable = false, updatable = true)
    private long invoiceNumber;
    @Column(nullable = false, updatable = true)
    private Date invoiceDate;
    @Column(nullable = false, updatable = true)
    private int quantity;
    @Column(nullable = true, updatable = true)
    private String description;
    @Column(nullable = false, updatable = true)
    private float unitPrice;
    @Column(nullable = false, updatable = true)
    private float totalProductPrice;
    @Column(nullable = false, updatable = true)
    private float subTotal;
    @Column(nullable = false, updatable = true)
    private float tax;
    @Column(nullable = false, updatable = true)
    private float totalToPay;
    @Column(nullable = false, updatable = false)
    private String invoiceCode;

    public Invoice() {
    }

    public Invoice(long id) {
        this.id = id;
    }

    public Invoice(long id, String address, String invoiceOwner, long invoiceNumber, Date invoiceDate, int quantity, String description, float unitPrice, float totalProductPrice, float subTotal, float tax, float totalToPay) {
        this.id = id;
        this.address = address;
        this.invoiceOwner = invoiceOwner;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.quantity = quantity;
        this.description = description;
        this.unitPrice = unitPrice;
        this.totalProductPrice = totalProductPrice;
        this.subTotal = subTotal;
        this.tax = tax;
        this.totalToPay = totalToPay;
    }

    public Invoice(long id, String address, String invoiceOwner, long invoiceNumber, Date invoiceDate, int quantity, String description, float unitPrice, float totalProductPrice, float subTotal, float tax, float totalToPay, String invoiceCode) {
        this.id = id;
        this.address = address;
        this.invoiceOwner = invoiceOwner;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.quantity = quantity;
        this.description = description;
        this.unitPrice = unitPrice;
        this.totalProductPrice = totalProductPrice;
        this.subTotal = subTotal;
        this.tax = tax;
        this.totalToPay = totalToPay;
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInvoiceOwner() {
        return invoiceOwner;
    }

    public void setInvoiceOwner(String invoiceOwner) {
        this.invoiceOwner = invoiceOwner;
    }

    public long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setTotalProductPrice(float totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(float totalToPay) {
        this.totalToPay = totalToPay;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", invoiceOwner='" + invoiceOwner + '\'' +
                ", invoiceNumber=" + invoiceNumber +
                ", invoiceDate=" + invoiceDate +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", totalProductPrice=" + totalProductPrice +
                ", subTotal=" + subTotal +
                ", tax=" + tax +
                ", totalToPay=" + totalToPay +
                '}';
    }
}
