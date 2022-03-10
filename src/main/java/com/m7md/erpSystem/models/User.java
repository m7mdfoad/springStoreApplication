package com.m7md.erpSystem.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    @Column(nullable = false, updatable = true)
    private String firstName;
    @Column(nullable = false, updatable = true)
    private String lastName;
    @Column(nullable = false, updatable = true)
    private String address;
    @Column(nullable = false, updatable = true)
    private String username;
    @Column(nullable = false, updatable = true)
    private String password;

}
