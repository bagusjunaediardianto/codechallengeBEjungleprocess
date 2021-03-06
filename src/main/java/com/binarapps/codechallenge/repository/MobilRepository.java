package com.binarapps.codechallenge.repository;

import java.util.List;

import com.binarapps.codechallenge.model.Mobil;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilRepository extends CrudRepository<Mobil, Long>{

    public List<Mobil> findByRentalId(Long idRental);
}