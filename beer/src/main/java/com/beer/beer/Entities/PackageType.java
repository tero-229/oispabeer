package com.beer.beer.Entities;

import javax.persistence.*;

@Entity
@Table(name = "PackageType")
public class PackageType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long beerId;
    private String type;
    private int size;
    private double price;


}
