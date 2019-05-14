package com.binarapps.codechallenge.controller;

import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Rental;
import com.binarapps.codechallenge.model.User;
import com.binarapps.codechallenge.service.RentalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalController{

    @Autowired
    private RentalService rentalService;

    public List<Rental> getAllRental(@PathVariable Long idRental){
        return rentalService.getAllRental(idRental);
    }

    public Optional<Rental> getRentalId(@PathVariable Long idRental){
        return rentalService.getRentalId(idRental);
    }

    public void addRental(@RequestBody Rental rental, @PathVariable Long idUser){
        rental.setUser(new User(idUser, "", "", ""));
        rentalService.addRental(rental);
    }

    public void updateRental(@RequestBody Rental rental, @PathVariable Long idUser, @PathVariable Long idRental){
        rental.setUser(new User(idUser, "", "",""));
        rentalService.updateRental(rental);
    }

    public void deleteRental(@PathVariable Long idRental){
        rentalService.deleteRental(idRental);
    }
}