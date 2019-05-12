package com.binarapps.codechallenge.repository;

import java.util.List;

import com.binarapps.codechallenge.model.Driver;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {

    public List <Driver> findByUserId(Long IdUser);
}