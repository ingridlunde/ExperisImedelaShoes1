package com.example.experisimedelashoes1.model;


//Får varenr fra varetabell og kundenr fra kundetabell
public class Ordre {
        private int varenr;
        private int antall;
        private float totalpris;
        private boolean pakkeSendt;

        public Ordre(int varenr, int antall, float totalpris, boolean pakkeSendt) {

                this.varenr = varenr;
                this.antall = antall;
                this.totalpris = totalpris;
                this.pakkeSendt = pakkeSendt;
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

        public float getTotalpris() {
                return totalpris;
        }

        public void setTotalpris(float totalpris) {
                this.totalpris = totalpris;
        }

        public boolean isPakkeSendt() {
                return pakkeSendt;
        }

        public void setPakkeSendt(boolean pakkeSendt) {
                this.pakkeSendt = pakkeSendt;
        }
}


