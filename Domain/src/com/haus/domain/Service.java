package com.haus.domain;

public class Service {
    private String nombre;
    private int precio;
    private int cantidad;

    public Service(String nombre,int precio){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return (this.getNombre()+": "+this.getPrecio());
    }
}
