package com.beer.beer.repositories;

import com.beer.beer.Entities.BeerType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerTypeRepository extends CrudRepository<BeerType, Long> {
}
