package com.beer.beer.repositories;

import com.beer.beer.Entities.Brewery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreweryRepository extends CrudRepository<Brewery, Long> {
}
