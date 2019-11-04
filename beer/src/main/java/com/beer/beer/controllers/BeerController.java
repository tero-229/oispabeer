package com.beer.beer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * This Controller handles all request regarding different beers.
 */

@RestController
@RequestMapping("/beer")
public class BeerController {
    
    @GetMapping("")
    List<String> getAllBeers() {
        //TODO toteuta metodi
        List<String> palauta = new ArrayList<>();
        return palauta;
    }

}
