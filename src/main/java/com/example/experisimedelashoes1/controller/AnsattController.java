package com.example.experisimedelashoes1.controller;


import com.example.experisimedelashoes1.model.Ansatt;
import com.example.experisimedelashoes1.model.Kunde;
import com.example.experisimedelashoes1.repository.AnsattRepository;
import com.example.experisimedelashoes1.repository.KundeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnsattController {

    @Autowired
    AnsattRepository repo;

    @PostMapping("/registrerAnsatt")
    public void registrerAnsatt(Ansatt registrerAnsatt) {
        repo.registrerAnsatt(registrerAnsatt);
    }

   @GetMapping("/loggInnAnsatt")
    public boolean loggInnAnsatt (String brukernavn, String passord) {
       if (repo.loggInnAnsatt(brukernavn, passord)) {
           //session.setAttribute("logget inn", true)
           return true;
       } else {
           return false;
       }
   }

    @GetMapping("/loggUtAnsatt")
    public void loggUtAnsatt (){
        //session.setAtrributte("logget inn", false)

    }
}


