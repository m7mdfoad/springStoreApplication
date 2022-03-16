package com.m7md.erpSystem.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.Month;

@Entity
public class Income implements Serializable {

    @Id
    @Column(nullable = false, updatable = false)
    private long id;
    @Column(nullable = false, updatable = false)
    private Month month;
    @Column(nullable = false, updatable = false)
    private double income;
    @Column(nullable = false, updatable = false)
    private double tax;

    public Income() {
    }

    public Income(long id) {
        this.id = id;
    }

    public Income(long id, Month month, double income, double tax) {
        this.id = id;
        this.month = month;
        this.income = income;
        this.tax = tax;
    }

    public long getId() {
        return id;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", month=" + month +
                ", income=" + income +
                ", tax=" + tax +
                '}';
    }
}

