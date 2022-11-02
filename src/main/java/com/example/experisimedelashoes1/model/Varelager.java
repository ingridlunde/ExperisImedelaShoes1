package com.example.experisimedelashoes1.model;

public class Varelager {
    private int skostorrelse;
    private int antall;
    private String beskrivelse;
    private float prisVare;

    public Varelager(int skostorrelse, int antall, String beskrivelse, float prisVare) {
        this.skostorrelse = skostorrelse;
        this.antall = antall;
        this.beskrivelse = beskrivelse;
        this.prisVare = prisVare;
    }

    public int getSkostorrelse() {
        return skostorrelse;
    }

    public void setSkostorrelse(int skostorrelse) {
        this.skostorrelse = skostorrelse;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public float getPrisVare() {
        return prisVare;
    }

    public void setPrisVare(float prisVare) {
        this.prisVare = prisVare;
    }
}
