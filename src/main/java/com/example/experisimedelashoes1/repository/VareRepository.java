package com.example.experisimedelashoes1.repository;

import com.example.experisimedelashoes1.model.Kunde;
import com.example.experisimedelashoes1.model.Varebestilling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class VareRepository {

    @Autowired
    private JdbcTemplate db;

    public void registrerHandel(Varebestilling innBestilling) {
        String sql = "INSERT INTO Varebestilling(vare, antall, fornavn, etternavn, telefonnr, epost) VALUES(?,?,?,?,?,?)";
        db.update (sql, innBestilling.getVarenr(), innBestilling.getAntall(), innBestilling.getModell(), innBestilling.getStørrelse(), innBestilling.getPris());
    }

    public void registrerKunde (Kunde registrerKunde) {
        String sql = "INSERT INTO Kunde (fornavn, etternavnm epost, telefonnr, antallkjop) VALUES(?,?,?,?,?)";
        db.update (sql, registrerKunde.getFornavn(), registrerKunde.getEtternavn(), registrerKunde.getEpost(), registrerKunde.getTelefonnr(), registrerKunde.getAntallkjop());
    }

    public List<Varebestilling> visHandlekurv() {
        String sql = "SELECT * FROM VareBestilling";
        List <Varebestilling> alleVarer = db.query(sql, new BeanPropertyRowMapper<>(Varebestilling.class));
        return alleVarer;

    }

    public void tømHandlekurv() {
        String sql = "DELETE FROM Varebestilling";
        db.update(sql);
    }
}
