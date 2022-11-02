package com.example.experisimedelashoes1.model;

public class Gavekort {

    private int uttlopsdato;

    private int datoGenerert;

    private int decimal;

    public Gavekort(int uttlopsdato, int datoGenerert, int decimal) {
        this.uttlopsdato = uttlopsdato;
        this.datoGenerert = datoGenerert;
        this.decimal = decimal;
    }

    public int getUttlopsdato() {
        return uttlopsdato;
    }

    public void setUttlopsdato(int uttlopsdato) {
        this.uttlopsdato = uttlopsdato;
    }

    public int getDatoGenerert() {
        return datoGenerert;
    }

    public void setDatoGenerert(int datoGenerert) {
        this.datoGenerert = datoGenerert;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }
}
