package com.binarapps.codechallenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Rental;
import com.binarapps.codechallenge.repository.RentalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> getAllRental(Long idUser){
        List<Rental> rentals = new ArrayList<>();
        rentalRepository.findByUserId(idUser)
        .forEach(rentals::add);
        return rentals;
    }

    public Optional<Rental> getRentalId(Long id){
        return rentalRepository.findById(id);
    }

    public void addRental(Rental rental){
        rentalRepository.save(rental);
    }

    public void updateRental(Rental rental){
        rentalRepository.save(rental);
    }

    public void deleteRental(Long id){
        rentalRepository.deleteById(id);
    }
}