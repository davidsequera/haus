package com.haus.business;

import com.haus.domain.Rent;
import com.haus.interfaces.IListProperties;

import java.io.IOException;
import java.util.List;

public class ListProperties implements IListProperties {
    public List<Rent> listarPropiedades() throws IOException {
        return Integrador.getProperties();
    }
}
