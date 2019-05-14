package com.binarapps.codechallenge.controller;

import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Driver;
import com.binarapps.codechallenge.model.User;
import com.binarapps.codechallenge.service.DriverService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    public List<Driver> getAllDriver(@PathVariable Long idDriver){
        return driverService.getAllDriver(idDriver);
    }

    public Optional<Driver> getDriverId(@PathVariable Long idDriver){
        return driverService.getDriverId(idDriver);
    }

    public void addDriver(@RequestBody Driver driver, @PathVariable Long idUser) {
        driver.setUser(new User(idUser, "", "",""));
        driverService.addDriver(driver);
    }

    public void updateDriver(@RequestBody Driver driver, @PathVariable Long idUser, @PathVariable Long idDriver){
        driver.setUser(new User(idUser, "", "",""));
        driverService.updateDriver(driver);
    }

    public void deleteDriver(@PathVariable Long idDriver){
        driverService.deleteDriver(idDriver);
    }
}