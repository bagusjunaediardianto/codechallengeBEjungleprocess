package com.binarapps.codechallenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Penyewa;
import com.binarapps.codechallenge.repository.PenyewaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenyewaService {

    @Autowired
    PenyewaRepository penyewaRepository;

    public List<Penyewa> getAllPenyewa(Long idUser){
        List<Penyewa> penyewas = new ArrayList<>();
        penyewaRepository.findByUserId(idUser)
        .forEach(penyewas::add);
        return penyewas;
    }

    public Optional<Penyewa> getPenyewaId(Long id){
        return penyewaRepository.findById(id);
    }

    public void addPenyewa(Penyewa penyewa){
        penyewaRepository.save(penyewa);
    }

    public void updatePenyewa(Penyewa penyewa){
        penyewaRepository.save(penyewa);
    }

    public void deletePenyewa(Long id){
        penyewaRepository.deleteById(id);
    }

}