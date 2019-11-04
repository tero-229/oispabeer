package com.beer.beer.Entities;

import javax.persistence.*;

@Entity
@Table(name = "popularity")
public class Popularity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long beerId;
    private int searched;

    public Popularity() { }

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

    public int getSearched() {
        return searched;
    }

    public void setSearched(int searched) {
        this.searched = searched;
    }
}
