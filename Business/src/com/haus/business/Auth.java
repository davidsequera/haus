package com.haus.business;

import java.util.Objects;

public class Auth {
    public boolean logIn(String user,String password){
        return Objects.equals(user, "isa") && Objects.equals(password, "amoasebastian");
    }
    public boolean signUp(String name,String user,String password){
        return !Objects.equals(user, "isa");
    }
}
