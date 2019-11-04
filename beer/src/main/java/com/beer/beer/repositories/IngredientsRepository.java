package com.beer.beer.repositories;

import com.beer.beer.Entities.Ingredients;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends CrudRepository<Ingredients, Long> {
}
