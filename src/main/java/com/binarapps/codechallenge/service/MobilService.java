package com.binarapps.codechallenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Mobil;
import com.binarapps.codechallenge.repository.MobilRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobilService {

    @Autowired
    MobilRepository mobilRepository;

    public List<Mobil> getAllMobil(Long idRental){
        List<Mobil> mobils = new ArrayList<>();
        mobilRepository.findByRentalId(idRental)
        .forEach(mobils::add);
        return mobils;
    }

    public Optional<Mobil> getMobilId(Long id){
        return mobilRepository.findById(id);
    }

    public void addMobil(Mobil mobil){
        mobilRepository.save(mobil);
    }

    public void updateMobil(Mobil mobil){
        mobilRepository.save(mobil);
    }

    public void deleteMobil(Long id){
        mobilRepository.deleteById(id);
    }
}