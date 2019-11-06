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

    public String getBestBeersAsString() {
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
        bestBeers += enitenPidetty.getName() + ", alkoholipitoisuus: " + enitenPidetty.getAlcohol() + "%, tästä on tykätty: " + enitenPidetty.getLikes() + "\n"
                + toiseksiPidetty.getName() + ", alkoholipitoisuus: " + toiseksiPidetty.getAlcohol() + "%, tästä on tykätty: " + toiseksiPidetty.getLikes() + "\n"
                + kolmanneksiPidetty.getName() + ", alkoholipitoisuus: " + kolmanneksiPidetty.getAlcohol() + "%, tästä on tykätty: " + kolmanneksiPidetty.getLikes() + "\n\n" +
                "Mukavaa ja oluttäyteistä viikonloppua!";

        // TODO poista ennen tuotantoa
        System.out.println(bestBeers);
        return bestBeers;
    }
}

