package com.beer.beer.repositories;

import com.beer.beer.Entities.Popularity;
import org.springframework.data.repository.CrudRepository;

public interface PopularityRepository extends CrudRepository <Popularity, Long> {
}
