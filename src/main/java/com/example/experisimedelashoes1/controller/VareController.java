package com.example.experisimedelashoes1.controller;


import com.example.experisimedelashoes1.model.Varebestilling;
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

    @GetMapping("/hentAlle")
    public List<Varebestilling> sjekkHandlekurv() {
        return repo.visHandlekurv();
    }

    @PostMapping("/lagre")
    public void registrerHandel(Varebestilling innBestilling) {
        repo.registrerHandel(innBestilling);
    }

}
