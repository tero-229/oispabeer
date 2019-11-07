package com.beer.beer.repositories;

import com.beer.beer.Entities.Beer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface BeerRepository extends CrudRepository<Beer,Long> {
    public Beer findByName(String name);
}
