package com.haus.domain;

public class Rent {
    private String nombre;
    private String lugar;
    private int precio;

    public Rent(String nombre, String lugar, int precio) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
