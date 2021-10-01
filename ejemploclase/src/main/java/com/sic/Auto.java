package com.sic;
public class Auto {
    String modelo;
    int anio;

    Auto(String modelo, int anio){
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

  
}