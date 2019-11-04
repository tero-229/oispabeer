package com.beer.beer.controllers;

import com.beer.beer.Entities.Ingredients;
import com.beer.beer.repositories.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController {

    @Autowired
    IngredientsRepository ingredientsRepository;

    List<Ingredients> getAllIngredients() {
        return (List<Ingredients>) ingredientsRepository.findAll();
    }
}
