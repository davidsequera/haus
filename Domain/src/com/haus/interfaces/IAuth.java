package com.haus.interfaces;

import java.io.IOException;

public interface IAuth {
    boolean logIn(String user, String password) throws IOException;
}
