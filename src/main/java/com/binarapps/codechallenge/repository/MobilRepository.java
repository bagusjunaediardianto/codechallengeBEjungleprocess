package com.binarapps.codechallenge.repository;

import com.binarapps.codechallenge.model.Mobil;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilRepository extends CrudRepository<Mobil, Long>{

}