package com.westlund.animalownerbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private long addressId;
    @Column(name = "street")
    private String street;
    @Column(name = "street_num")
    private int streetNum;
    @Column(name = "postal_code")
    private int postalCode;
    @Column(name = "city")
    private String city;

    public Address() {
    }

    public long getAddressId() {
        return addressId;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNum() {
        return streetNum;
    }
    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public int getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
