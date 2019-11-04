package com.beer.beer.controllers;


import com.beer.beer.Entities.PackageType;
import com.beer.beer.Entities.Popularity;
import com.beer.beer.repositories.PopularityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/popularity")
public class PopularityController {
    @Autowired
    PopularityRepository popularityRepository;

    @GetMapping("")
    List<Popularity> listByPopularity() {
        return (List<Popularity>) popularityRepository.findAll();
    }

    @PostMapping("")
    void addPopularity(@RequestBody Popularity popularity) {
        popularity.setSearched(0);
        popularityRepository.save(popularity);
    }
}
