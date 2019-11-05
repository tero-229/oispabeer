package com.beer.beer.Entities;

import javax.persistence.*;

@Entity
@Table(name = "beer")
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double alcohol;
    private double pricePerLiter;
    private int calories;
    private int likes;

    @ManyToOne
    @JoinColumn(name = "brewery_id")
    private Brewery brewery;

    public Beer() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Brewery getBrewery() {
        return brewery;
    }

    public void setBrewery(Brewery brewery) {
        this.brewery = brewery;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void addLike() {
        likes = likes + 1;
    }
}
