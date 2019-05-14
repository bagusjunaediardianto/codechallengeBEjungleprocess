package com.binarapps.codechallenge.controller;

import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Driver;
import com.binarapps.codechallenge.model.Mobil;
import com.binarapps.codechallenge.model.Penyewa;
import com.binarapps.codechallenge.model.Rental;
import com.binarapps.codechallenge.model.Transaksi;
import com.binarapps.codechallenge.model.User;
import com.binarapps.codechallenge.service.TransaksiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransaksiController{

    @Autowired
    private TransaksiService transaksiService;

    public List<Transaksi> getAllTransaksi(@PathVariable Long idTransaksi, @PathVariable Long idDriver, @PathVariable Long idPenyewa, @PathVariable Long idMobil){
       return transaksiService.getAllTransaksi(idDriver, idPenyewa, idMobil); 
    }

    public Optional<Transaksi> getTransaksiId(@PathVariable Long idTransaksi){
        return transaksiService.getTransaksiId(idTransaksi);
    }

    public void addTransaksi(@RequestBody Transaksi transaksi, @RequestBody User user, @RequestBody Rental rental ,@PathVariable Long idDriver, @PathVariable Long idMobil, @PathVariable Long idPenyewa){
        transaksi.setDriver(new Driver(idDriver, "", "", "", "", "", user));
        transaksi.setMobil(new Mobil(idMobil, "", "", "", "", "", "", rental));
        transaksi.setPenyewa(new Penyewa(idPenyewa, "", "", "", "", user));
        transaksiService.addTransaksi(transaksi);
    }

    public void updateTransaksi(@RequestBody Transaksi transaksi, @RequestBody User user, @RequestBody Rental rental ,@PathVariable Long idDriver, @PathVariable Long idMobil, @PathVariable Long idPenyewa, @PathVariable Long idTransaksi){
        transaksi.setDriver(new Driver(idDriver, "", "", "", "", "", user));
        transaksi.setMobil(new Mobil(idMobil, "", "", "", "", "", "", rental));
        transaksi.setPenyewa(new Penyewa(idPenyewa, "", "", "", "", user));
        transaksiService.updateTransaksi(transaksi);
    }

    public void deleteTransaksi(@PathVariable Long idTransaksi){
        transaksiService.deleteTransaksi(idTransaksi);
    }
}