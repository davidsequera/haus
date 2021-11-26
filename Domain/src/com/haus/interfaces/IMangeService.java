package com.haus.interfaces;

import com.haus.domain.Service;

import java.io.IOException;
import java.util.List;

public interface IMangeService {
    int agregarServicio();
    int modificarServicio();
    int eliminarServicio();
    List<Service> listarServcicios() throws IOException;
}
