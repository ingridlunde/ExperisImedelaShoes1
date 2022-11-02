package com.example.experisimedelashoes1.repository;

import com.example.experisimedelashoes1.model.Kunde;
import com.example.experisimedelashoes1.model.Ordre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class VareRepository {

    @Autowired
    private JdbcTemplate db;


    //pakkesendt blir satt som boolean false og endret til true når pakken blir sendt.
    //VArenr på varen som blir lagt i kurven blir lagt inn.
    public void registrerOrdre (Ordre innBestilling) {
        String sql = "INSERT INTO Ordre ( antall, totalpris, pakkeSendt) VALUES(?,?,?,?)";
        db.update (sql, innBestilling.getAntall(), innBestilling.getTotalpris(), innBestilling.isPakkeSendt());
    }

    public void registrerKunde (Kunde registrerKunde) {
        String sql = "INSERT INTO Kunde (fornavn, etternavn, epost, adresse, telefonnr) VALUES(?,?,?,?,?)";
        db.update (sql, registrerKunde.getFornavn(), registrerKunde.getEtternavn(), registrerKunde.getEpost(), registrerKunde.getTelefonnr(), registrerKunde.getAdresse());
    }

    public List<Ordre> visOrdre() {
        String sql = "SELECT * FROM Ordre";
        List <Ordre> alleVarer = db.query(sql, new BeanPropertyRowMapper<>(Ordre.class));
        return alleVarer;

    }

    //Handlekurv lagres i cache lokalt
    public void tømHandlekurv() {
        String sql = "DELETE FROM Ordre";
        db.update(sql);
    }
}
