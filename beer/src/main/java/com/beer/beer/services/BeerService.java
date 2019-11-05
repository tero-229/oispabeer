package com.beer.beer.services;

import com.beer.beer.Entities.Beer;
import com.beer.beer.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {
    @Autowired
    BeerRepository beerRepository;

    public String getBestBeers() {
        String bestBeers = "Moikka! \nViikonloppu lähestyy, ja nyt on oiva hetki miettiä " +
                "viikonlopun juomavalikoimaa\nTällä viikolla haetuimmat oluet ovat:\n\n";

        List<Beer> beerList = (List<Beer>) beerRepository.findAll();

        if (beerList.size() < 3) {
            return "No beers for you!";
        }

        // Käydään kaikki oluet läpi ja otetaan talteen kolme eniten haettua olutta
        Beer enitenPidetty = beerList.get(0);
        Beer toiseksiPidetty = beerList.get(1);
        Beer kolmanneksiPidetty = beerList.get(2);

        for (int i = 0; i < beerList.size(); i++) {
            if (beerList.get(i).getLikes() > enitenPidetty.getLikes()) {
                kolmanneksiPidetty = toiseksiPidetty;
                toiseksiPidetty = enitenPidetty;
                enitenPidetty = beerList.get(i);
            } else if (beerList.get(i).getLikes() > toiseksiPidetty.getLikes()) {
                kolmanneksiPidetty = toiseksiPidetty;
                toiseksiPidetty = beerList.get(i);
            } else if (beerList.get(i).getLikes() > kolmanneksiPidetty.getLikes()) {
                kolmanneksiPidetty = beerList.get(i);
            }
        }
        bestBeers += enitenPidetty.getName() + ", alkoholipitoisuus: " + enitenPidetty.getAlcohol() + "%\n"
                + toiseksiPidetty.getName() + ", alkoholipitoisuus: " + toiseksiPidetty.getAlcohol() + "%\n"
                + kolmanneksiPidetty.getName() + ", alkoholipitoisuus: " + kolmanneksiPidetty.getAlcohol() + "%\n\n" +
                "Mukavaa ja oluttäyteistä viikonloppua!";

        return bestBeers;
    }
}

