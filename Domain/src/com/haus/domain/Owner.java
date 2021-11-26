package com.haus.domain;

public class Owner {
    private String correo;
    private String password;
    private String nombre;
    private String apellido;

    public Owner(String correo,String password,String nombre,String apellido){
        this.correo = correo;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Owner() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
