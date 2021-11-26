package com.haus.domain;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Payment {
    private String correo;
    private String titular;
    private String tipo;
    private String tarjeta;
    private Date vencimiento;

    public Payment(String correo, String titular, String tipo, String tarjeta, LocalDate vencimiento){
        this.correo = correo;
        this.titular = titular;
        this.tipo = tipo;
        this.tarjeta = tarjeta;

        ZoneId defaultZoneId = ZoneId.systemDefault();
        //creating the instance of LocalDate using the day, month, year info
        LocalDate localDate = vencimiento;

        //local date + atStartOfDay() + default time zone + toInstant() = Date
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        this.vencimiento = date;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }
}
