package com.binarapps.codechallenge.repository;

import java.util.List;

import com.binarapps.codechallenge.model.Rental;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends CrudRepository<Rental, Long>{

    public List<Rental> findByUserId(Long idUser);
}