package com.beer.beer.controllers;


import com.beer.beer.Entities.PackageType;
import com.beer.beer.repositories.PackageTypeRepository;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/package")
public class PackageTypeController {

    @Autowired
    PackageTypeRepository packageTypeRepository;

    @GetMapping("")
    List<PackageType> listAllPackageTypes() {
        return (List<PackageType>) packageTypeRepository.findAll();
    }

    @PostMapping("")
    void addPackageType(@RequestBody PackageType packageType) {
        packageTypeRepository.save(packageType);
    }
}
