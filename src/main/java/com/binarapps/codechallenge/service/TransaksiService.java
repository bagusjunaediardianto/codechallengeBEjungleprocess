package com.binarapps.codechallenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Transaksi;
import com.binarapps.codechallenge.repository.TransaksiRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransaksiService {

    @Autowired
    TransaksiRepository transaksiRepository;


    public List<Transaksi> getAllTransaksi(Long idDriver, Long idPenyewa, Long idMobil){
        List<Transaksi> transaksis = new ArrayList<>();
        transaksiRepository.findByOtherId(idDriver, idPenyewa, idMobil)
        .forEach(transaksis::add);
        return transaksis;
        
    }

    public Optional<Transaksi> getTransaksiId(Long id){
        return transaksiRepository.findById(id);
    }

    public void addTransaksi(Transaksi transaksi){
        transaksiRepository.save(transaksi);
    }

    public void updateTransaksi(Transaksi transaksi){
        transaksiRepository.save(transaksi);
    }

    public void deleteTransaksi(Long id){
        transaksiRepository.deleteById(id);
    }


}