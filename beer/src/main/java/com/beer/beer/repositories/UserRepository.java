package com.beer.beer.repositories;

import com.beer.beer.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {  }
