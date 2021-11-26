package com.haus.interfaces;

import com.haus.domain.Rent;

import java.io.IOException;
import java.util.List;

public interface IListProperties {
     List<Rent> listarPropiedades() throws IOException;
}
