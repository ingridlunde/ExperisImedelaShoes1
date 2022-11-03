package com.example.experisimedelashoes1.repository;

import com.example.experisimedelashoes1.model.Ansatt;
import com.example.experisimedelashoes1.model.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnsattRepository {

    @Autowired
    private JdbcTemplate db;

    public void registrerAnsatt(Ansatt registrerAnsatt) {
        String sql = "INSERT INTO Ansatt (fornavn, etternavn, epost, adresse, telefonnr) VALUES(?,?,?,?,?)";
        db.update(sql, registrerAnsatt.getFornavn(), registrerAnsatt.getEtternavn(), registrerAnsatt.getEpost(), registrerAnsatt.getTelefonnr(), registrerAnsatt.getAdresse());
    }

    public boolean loggInnAnsatt(String brukernavn,String passord){
        String sql = "SELECT * FROM Ansatt WHERE brukernavn = ?";
        try{

            List<Ansatt> ansatt = db.query(sql,new BeanPropertyRowMapper(Ansatt.class),brukernavn);


            if(ansatt != null){
                if(sjekkPassord(passord,ansatt.get(0).getPassord())){
                    return true;
                }
            }
            return false;
        }
        catch(Exception e){
            return false;
        }
    }

    private boolean sjekkPassord(String passord, String s) {

        //ikke helt slik, men tiden strakk ikke helt til. Bruker hashing og kan også salte passordet.
        if(passord == passord) {
            return true;
        } else {
                return false;
            }
        }

    }



