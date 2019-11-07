package com.beer.beer;

import com.beer.beer.Entities.Beer;
import com.beer.beer.controllers.BeerController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Field;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BeerControllerTests {
    @Autowired
    BeerController beerController;

    @Test
    public void testGetBeerShouldReturnAllBeers() {
        List<Beer> beerListInBeerController = null;

        try {
            Field f = beerController.getClass().getDeclaredField("beer"); //NoSuchFieldException
            f.setAccessible(true);
            beerListInBeerController = (List<Beer>) f.get(beerController);
            beerListInBeerController.clear();
        } catch (Exception e) {
            Assert.fail("Could not access beer container");
        }
        // Create reference beers and send them
        Beer reference1 = new Beer();
        reference1.setName("Karhu");

        Beer reference2 = new Beer();
        reference2.setName("Karjala");

        beerController.addBeer(reference1);
        beerController.addBeer(reference2);

        // Get beers from getAllBeers() -method
        List<Beer> retval = beerController.getAllBeers();

        // First beer send should be the first beer in list
        Beer beer1 = retval.get(0);

        // Second beer send should be the second beer in list
        Beer beer2 = retval.get(1);

        // Remember to override equals -method in Beer class

        Assert.assertEquals(reference1, beer1);
        Assert.assertEquals(reference2, beer2);
    }

}
