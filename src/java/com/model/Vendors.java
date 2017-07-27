/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Vineet
 */
@Entity(name = "vendors")
@Table(name = "vendors")
public class Vendors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "stock")
    private Set<Customer> vendorCustomerRecords = new HashSet<Customer>(0);

    public Set<Customer> getVendorCustomerRecords() {
        return this.vendorCustomerRecords;
    }

    public void setVendorCustomerRecords(Set<Customer> vendorCustomerRecords) {
        this.vendorCustomerRecords = vendorCustomerRecords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vendors(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vendors() {
    }

}
