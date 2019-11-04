package com.beer.beer.controllers;

import com.beer.beer.Entities.BeerType;
import com.beer.beer.repositories.BeerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This Controller handles all request regarding different beertypes.
 */

@RestController
@RequestMapping("/beertype")
public class BeerTypeController {

    @Autowired
    BeerTypeRepository beerTypeRepository;

    @GetMapping
    List<BeerType> listAllBeerTypes() {
        return (List<BeerType>) beerTypeRepository.findAll();
    }

    @PostMapping("")
    void addBeerType(@RequestBody BeerType beerType) {
        beerTypeRepository.save(beerType);
    }

}
