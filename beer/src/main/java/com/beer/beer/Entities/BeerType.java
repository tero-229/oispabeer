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



}
