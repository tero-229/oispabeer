package com.beer.beer.Entities;

import javax.persistence.*;

@Entity
@Table(name = "beer")
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long BreweryId;
    private String name;
    private double alcohol;
    private double pricePerLiter;
    private int calories;

    public Beer() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBreweryId() {
        return BreweryId;
    }

    public void setBreweryId(long breweryId) {
        BreweryId = breweryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLiter = pricePerLitre;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
