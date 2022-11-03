package com.example.experisimedelashoes1.controller;


import com.example.experisimedelashoes1.model.Kunde;
import com.example.experisimedelashoes1.model.Ordre;
import com.example.experisimedelashoes1.model.Varelager;
import com.example.experisimedelashoes1.repository.KundeRepository;
import com.example.experisimedelashoes1.repository.VareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KundeController {

    @Autowired
    KundeRepository repo;

    @PostMapping("/registrerKunde")
    public void registrerKunde(Kunde registrerKunde) {
        repo.registrerKunde(registrerKunde);
    }


}
