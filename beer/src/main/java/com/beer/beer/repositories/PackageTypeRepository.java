package com.beer.beer.repositories;

import com.beer.beer.Entities.PackageType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageTypeRepository extends CrudRepository<PackageType, Long> {
}
