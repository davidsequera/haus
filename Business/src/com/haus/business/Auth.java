package com.haus.business;

import com.haus.domain.Owner;
import com.haus.interfaces.IAuth;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Auth implements IAuth {
    public boolean logIn(String user,String password) throws IOException {
        List<Owner> users = Integrador.getUsers();
        for (Owner o: users) {
            if(Objects.equals(user, o.getCorreo())){
                return Objects.equals(user, o.getCorreo()) && Objects.equals(password, o.getPassword());
            }
        }
        return false;
    }
    public boolean signUp(String name,String user,String password){
        return !Objects.equals(user, "isa");
    }
}
