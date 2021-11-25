package com.haus.business;

import com.haus.interfaces.IAuth;

import java.util.Objects;

public class Auth implements IAuth {
    public boolean logIn(String user,String password){
        return Objects.equals(user, "isa") && Objects.equals(password, "amoasebastian");
    }
    public boolean signUp(String name,String user,String password){
        return !Objects.equals(user, "isa");
    }
}
