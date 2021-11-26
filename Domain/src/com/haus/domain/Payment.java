package com.haus.domain;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Payment {
    private String correo;
    private String tituar;
    private String tipo;
    private String tarjeta;
    private Date vencimiento;

    public Payment(String correo, String tituar, String tipo, String tarjeta, LocalDate vencimiento){
        this.correo = correo;
        this.tituar = tituar;
        this.tipo = tipo;
        this.tarjeta = tarjeta;

        ZoneId defaultZoneId = ZoneId.systemDefault();
        //creating the instance of LocalDate using the day, month, year info
        LocalDate localDate = vencimiento;

        //local date + atStartOfDay() + default time zone + toInstant() = Date
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        this.vencimiento = date;
    }
}
