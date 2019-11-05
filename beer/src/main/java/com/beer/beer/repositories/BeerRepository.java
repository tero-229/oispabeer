package com.beer.beer.repositories;

import com.beer.beer.Entities.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends CrudRepository<Beer,Long> {
    public Beer findByName(String name);
}
