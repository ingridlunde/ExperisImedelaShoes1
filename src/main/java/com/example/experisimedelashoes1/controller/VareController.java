package com.example.experisimedelashoes1.controller;


import com.example.experisimedelashoes1.model.Kunde;
import com.example.experisimedelashoes1.model.Ordre;
import com.example.experisimedelashoes1.model.Varelager;
import com.example.experisimedelashoes1.repository.VareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VareController {

    @Autowired
    VareRepository repo;

    //vis ordre. Bare tilgjengelig som ansatt
    @GetMapping("/visOrdre")
    public List<Ordre> visOrdre() {
        return repo.visOrdre();
    }

    @PostMapping("/lagre")
    public void registrerOrdre(Ordre innBestilling) {
        repo.registrerOrdre(innBestilling);
    }

    //getkall for å hente inn varer til nettside?
    @GetMapping("/hentVarer")
    public List<Varelager> visVarer() {
        return repo.visVarer();
    }

    @GetMapping("/antallOrdre")
    public List<Ordre> sjekkAntallOrdre () {
        return repo.sjekkAntallOrdre();
    }
}


