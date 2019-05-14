package com.binarapps.codechallenge.repository;

import java.util.List;

import com.binarapps.codechallenge.model.Transaksi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaksiRepository extends CrudRepository <Transaksi, Long>{

    public List<Transaksi> findByOtherId(Long idDriver, Long idPenyewa, Long idMobil);
   }