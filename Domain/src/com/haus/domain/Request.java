package com.haus.domain;


public class Request {
    private Rent rent;
    private String datosPago;

    public Request(Rent rent, String datosPago) {
        this.rent = rent;
        this.datosPago = datosPago;
    }
}
