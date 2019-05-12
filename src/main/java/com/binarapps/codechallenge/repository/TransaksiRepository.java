package com.binarapps.codechallenge.repository;

import com.binarapps.codechallenge.model.Transaksi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaksiRepository extends CrudRepository <Transaksi, Long>{

}