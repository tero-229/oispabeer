package com.beer.beer.Entities;

import javax.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long BeerId;
    private String name;

    public Ingredients() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBeerId() {
        return BeerId;
    }

    public void setBeerId(long beerId) {
        BeerId = beerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
