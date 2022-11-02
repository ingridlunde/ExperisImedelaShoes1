package com.example.experisimedelashoes1.model;


//Får varenr fra varetabell og kundenr fra kundetabell
public class Varebestilling {

        private int varenr;
        private int antall;
        private String modell;
        private String størrelse;
        private String pris;

        public Varebestilling(int varenr, int antall, String modell, String størrelse, String pris) {
                this.varenr = varenr;
                this.antall = antall;
                this.modell = modell;
                this.størrelse = størrelse;
                this.pris = pris;

        }

        public int getVarenr() {
                return varenr;
        }

        public void setVarenr(int varenr) {
                this.varenr = varenr;
        }

        public int getAntall() {
                return antall;
        }

        public void setAntall(int antall) {
                this.antall = antall;
        }

        public String getModell() {
                return modell;
        }

        public void setModell(String modell) {
                this.modell = modell;
        }

        public String getStørrelse() {
                return størrelse;
        }

        public void setStørrelse(String størrelse) {
                this.størrelse = størrelse;
        }

        public String getPris() {
                return pris;
        }

        public void setPris(String pris) {
                this.pris = pris;
        }
}
