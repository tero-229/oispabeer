package com.beer.beer.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PackageType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long beerId;
    private String type;
    private int size;
    private double price;

    public PackageType() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBeerId() {
        return beerId;
    }

    public void setBeerId(long beerId) {
        this.beerId = beerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
