package com.beer.beer.controllers;

import com.beer.beer.Entities.Beer;
import com.beer.beer.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This Controller handles all request regarding different beers.
 */

@RestController
@RequestMapping("/beer")
public class BeerController {

    @Autowired
    BeerRepository beerRepository;

    @GetMapping("")
    List<Beer> getAllBeers() {
        return (List<Beer>) beerRepository.findAll();
    }

    @PostMapping("")
    void addBeer(@RequestBody Beer beer) {
        beer.setLikes(0);
        beerRepository.save(beer);
    }

    @PostMapping("/vote/{name}")
    Beer plusVote(@PathVariable String name) {
        Beer beer = beerRepository.findByName(name);
        beer.addLike();
        beerRepository.save(beer);

        return beer;
    }

}
