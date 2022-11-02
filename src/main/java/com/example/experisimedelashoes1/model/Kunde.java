package com.example.experisimedelashoes1.model;

public class Kunde {

        private String fornavn;
        private String etternavn;
        private String epost;
        private String telefonnr;
        private Integer antallkjop;

        //Konstruktør
        public Kunde(String fornavn, String etternavn, String epost, String telefonnr, Integer antallkjop) {
                this.fornavn = fornavn;
                this.etternavn = etternavn;
                this.epost = epost;
                this.telefonnr = telefonnr;
                this.antallkjop = antallkjop;
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

        public Integer getAntallkjop() {
                return antallkjop;
        }

        public void setAntallkjop(Integer antallkjop) {
                this.antallkjop = antallkjop;
        }
}

