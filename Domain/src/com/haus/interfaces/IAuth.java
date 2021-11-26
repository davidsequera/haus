package com.haus.interfaces;

import com.haus.domain.Owner;

import java.io.IOException;

public interface IAuth {
    Owner logIn(String user, String password) throws IOException;
    Owner signUp(String correo,String password,String nombre,String apellido) throws IOException;
}
