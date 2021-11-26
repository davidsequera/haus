package com.haus.business;

import com.haus.domain.Rent;
import com.haus.domain.Service;
import com.haus.interfaces.IMangeService;

import java.io.IOException;
import java.util.List;

public class ManageService implements IMangeService {
    public int agregarServicio() {
        return super.hashCode();
    }
    public int modificarServicio() {
        return super.hashCode();
    }
    public int eliminarServicio() {
        return super.hashCode();
    }
    public List<Service> listarServcicios() throws IOException {
        return Integrador.getServices();
    }
}
