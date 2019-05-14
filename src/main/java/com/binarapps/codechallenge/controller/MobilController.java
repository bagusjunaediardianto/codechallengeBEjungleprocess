package com.binarapps.codechallenge.controller;

import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Mobil;
import com.binarapps.codechallenge.model.Rental;
import com.binarapps.codechallenge.model.User;
import com.binarapps.codechallenge.service.MobilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobilController {

    @Autowired
    private MobilService mobilService;

    public List<Mobil> getAllMobil(@PathVariable Long idMobil){
        return mobilService.getAllMobil(idMobil);
    }

    public Optional<Mobil> getMobilId(@PathVariable Long idMobil){
        return mobilService.getMobilId(idMobil);
    }

    public void addMobil(@RequestBody Mobil mobil, @RequestBody User user, @PathVariable Long idRental){
        mobil.setRental(new Rental(idRental, "", "", "", "", user));
        mobilService.addMobil(mobil);
    }

    public void updateMobil(@RequestBody Mobil mobil, @RequestBody User user, @PathVariable Long idRental, @PathVariable Long idMobil){
        mobil.setRental(new Rental(idRental, "", "", "", "", user));
        mobilService.updateMobil(mobil);
    }

    public void deleteMobil(@PathVariable Long idMobil){
        mobilService.deleteMobil(idMobil);
    }
}