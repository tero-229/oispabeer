package com.beer.beer.controllers;


import com.beer.beer.Entities.PackageType;
import com.beer.beer.repositories.PackageTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
