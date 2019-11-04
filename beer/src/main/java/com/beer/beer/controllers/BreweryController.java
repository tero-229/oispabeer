package com.beer.beer.controllers;

import com.beer.beer.Entities.Brewery;
import com.beer.beer.repositories.BreweryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This controller handles all request regarding different breweries.
 */

@RestController
@RequestMapping("/brewery")
public class BreweryController {

    @Autowired
    BreweryRepository breweryRepository;

    @GetMapping("")
    List<Brewery> listAllBrewerys() {
        return (List<Brewery>) breweryRepository.findAll();
    }
}
