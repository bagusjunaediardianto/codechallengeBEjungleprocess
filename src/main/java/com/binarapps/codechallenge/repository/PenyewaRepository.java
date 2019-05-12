package com.binarapps.codechallenge.repository;

import java.util.List;

import com.binarapps.codechallenge.model.Penyewa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenyewaRepository extends CrudRepository <Penyewa, Long>{

    public List<Penyewa> findByUserId(Long idUser);
}