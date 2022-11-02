package com.example.experisimedelashoes1.model;

public class Kunde {

        private String fornavn;
        private String etternavn;
        private String epost;
        private String adresse;
        private String telefonnr;


        //Konstruktør
        public Kunde(String fornavn, String etternavn, String epost, String adresse, String telefonnr, Integer antallkjop) {
                this.fornavn = fornavn;
                this.etternavn = etternavn;
                this.epost = epost;
                this.adresse = adresse;
                this.telefonnr = telefonnr;
        }
        //Gettere og settere

        public String getFornavn() {
                return fornavn;
        }

        public void setFornavn(String fornavn) {
                this.fornavn = fornavn;
        }

        public String getEtternavn() {
                return etternavn;
        }

        public void setEtternavn(String etternavn) {
                this.etternavn = etternavn;
        }

        public String getEpost() {
                return epost;
        }

        public void setEpost(String epost) {
                this.epost = epost;
        }

        public String getTelefonnr() {
                return telefonnr;
        }

        public void setTelefonnr(String telefonnr) {
                this.telefonnr = telefonnr;
        }

        public String getAdresse() {
                return adresse;
        }

        public void setAdresse(String adresse) {
                this.adresse = adresse;
        }
}

