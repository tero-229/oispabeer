package com.beer.beer.services;

import com.beer.beer.Entities.Beer;
import com.beer.beer.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BeerService {
    @Autowired
    BeerRepository beerRepository;

    public String getBestBeersAsString() {
        String bestBeers = "Moikka! \nViikonloppu lähestyy, ja nyt on oiva hetki miettiä " +
                "viikonlopun juomavalikoimaa\nTällä viikolla haetuimmat oluet ovat:\n\n";

        List<Beer> beerList = (List<Beer>) beerRepository.findAll();

        if (beerList.size() < 3) {
            return "No beers for you!";
        }

        // Sortataan lista parhausjärjestykseen
        List<Beer> beerListSorted =  beerList.stream()
                .sorted((b1, b2) -> {return b2.getLikes() - b1.getLikes();})
                .collect(Collectors.toList());

        // otetaan talteen kolme parasta
        Beer enitenPidetty = beerListSorted.get(0);
        Beer toiseksiPidetty = beerListSorted.get(1);
        Beer kolmanneksiPidetty = beerListSorted.get(2);

        bestBeers += enitenPidetty.getName() + ", alkoholipitoisuus: " + enitenPidetty.getAlcohol() + "%, tästä on tykätty: " + enitenPidetty.getLikes() + "\n"
                + toiseksiPidetty.getName() + ", alkoholipitoisuus: " + toiseksiPidetty.getAlcohol() + "%, tästä on tykätty: " + toiseksiPidetty.getLikes() + "\n"
                + kolmanneksiPidetty.getName() + ", alkoholipitoisuus: " + kolmanneksiPidetty.getAlcohol() + "%, tästä on tykätty: " + kolmanneksiPidetty.getLikes() + "\n\n" +
                "Mukavaa ja oluttäyteistä viikonloppua!";

        return bestBeers;
    }
}

