package com.binarapps.codechallenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Driver;
import com.binarapps.codechallenge.repository.DriverRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public List<Driver> getAllDriver(Long idUser){
        List<Driver> drivers = new ArrayList<>();
        driverRepository.findByUserId(idUser)
        .forEach(drivers::add);
        return drivers;
    }

    public Optional<Driver> getDriverId(Long id){
        return driverRepository.findById(id);
    }

    public void addDriver(Driver driver){
        driverRepository.save(driver);
    }

    public void updateDriver(Driver driver){
        driverRepository.save(driver);
    }

    public void deleteDriver(Long id){
        driverRepository.deleteById(id);
    }


}