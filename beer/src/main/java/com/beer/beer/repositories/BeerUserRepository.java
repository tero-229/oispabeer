package com.beer.beer.repositories;

import com.beer.beer.Entities.BeerUser;
import org.springframework.data.repository.CrudRepository;

public interface BeerUserRepository extends CrudRepository<BeerUser, Long> {  }
