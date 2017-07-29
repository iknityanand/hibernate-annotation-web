/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Vineet
 */
@Entity(name = "customer")
@Table(name = "customer")
public class Customer {

    
    private int id;
    private String name;
    private Vendors vendor;

    public Customer() {
    }

    public Customer(int id, String name, Vendors vendor) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendorid", nullable = false)
    public Vendors getVendor() {
        return vendor;
    }

    public void setVendor(Vendors vendor) {
        this.vendor = vendor;
    }
        
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
