package com.beer.beer.Entities;

import javax.persistence.*;

@Entity
@Table(name = "beerType")
public class BeerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int beerId;
    private String name;

    public BeerType() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBeerId() {
        return beerId;
    }

    public void setBeerId(int beerId) {
        this.beerId = beerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
