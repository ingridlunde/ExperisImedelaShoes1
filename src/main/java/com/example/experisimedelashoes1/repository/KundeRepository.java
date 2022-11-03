package com.example.experisimedelashoes1.repository;

import com.example.experisimedelashoes1.model.Kunde;
import com.example.experisimedelashoes1.model.Ordre;
import com.example.experisimedelashoes1.model.Varelager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KundeRepository {

    @Autowired
    private JdbcTemplate db;

    public void registrerKunde(Kunde registrerKunde) {
        String sql = "INSERT INTO Kunde (fornavn, etternavn, epost, adresse, telefonnr) VALUES(?,?,?,?,?)";
        db.update(sql, registrerKunde.getFornavn(), registrerKunde.getEtternavn(), registrerKunde.getEpost(), registrerKunde.getTelefonnr(), registrerKunde.getAdresse());
    }

    public List<Kunde> Kundeoversikt() {
        String sql = "SELECT * FROM Kunde";
        List<Kunde> alleKunder = db.query(sql, new BeanPropertyRowMapper<>(Kunde.class));
        return alleKunder;

    }
}



