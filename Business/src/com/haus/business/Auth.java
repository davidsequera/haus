package com.haus.business;

import com.haus.domain.Owner;
import com.haus.interfaces.IAuth;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Auth implements IAuth {
    public Owner logIn(String user,String password) throws IOException {
        List<Owner> users = Integrador.getUsers();
        for (Owner o: users) {
            if(Objects.equals(user, o.getCorreo())){
                if(Objects.equals(password, o.getPassword())){
                    return o;
                }
            }
        }
        return null;
    }
    public Owner signUp(String correo,String password,String nombre,String apellido) throws IOException {
        List<Owner> users = Integrador.getUsers();
        for (Owner o: users) {
            if(Objects.equals(correo, o.getCorreo())){
                return null;
            }
        }
        Owner o = new Owner(correo,password,nombre,apellido);
        Integrador.saveUser(o);
        return o;
    }
}
