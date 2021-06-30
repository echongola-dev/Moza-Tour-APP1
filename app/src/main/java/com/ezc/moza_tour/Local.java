package com.ezc.moza_tour;

public class Local {
    String titulo, morada;
    double latitude , longitude;

    public Local() {
        titulo="";
        morada="";
        latitude=0;
        longitude=0;
    }

    public Local(String titulo, String morada, double latitude, double longitude) {
        this.titulo = titulo;
        this.morada = morada;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Local(Local local) {
        this.titulo = local.titulo;
        this.morada = local.morada;
        this.latitude = local.latitude;
        this.longitude = local.longitude;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatutude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return titulo+" ("  +  morada  +  ")";
    }
}
