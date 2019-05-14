package com.binarapps.codechallenge.controller;

import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.Penyewa;
import com.binarapps.codechallenge.model.User;
import com.binarapps.codechallenge.service.PenyewaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PenyewaController {


    @Autowired
    private PenyewaService penyewaService;

    public List<Penyewa> getAllPenyewa(@PathVariable Long idPenyewa){
        return penyewaService.getAllPenyewa(idPenyewa);
    }

    public Optional<Penyewa> getPenyewaId(@PathVariable Long idPenyewa){
        return penyewaService.getPenyewaId(idPenyewa);
    }

    public void addPenyewa(@RequestBody Penyewa penyewa, @PathVariable Long idUser){
        penyewa.setUser(new User(idUser, "", "", ""));
        penyewaService.addPenyewa(penyewa);
    }

    public void updatePenyewa(@RequestBody Penyewa penyewa, @PathVariable Long idUser, @PathVariable Long idPenyewa){
        penyewa.setUser(new User(idUser, "", "", ""));
        penyewaService.addPenyewa(penyewa);
    }

    public void deletePenyewa(@PathVariable Long idPenyewa){
        penyewaService.deletePenyewa(idPenyewa);
    }
}