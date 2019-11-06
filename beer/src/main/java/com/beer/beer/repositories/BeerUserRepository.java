package com.beer.beer.repositories;

import com.beer.beer.Entities.BeerUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerUserRepository extends CrudRepository<BeerUser, Long> {  }
