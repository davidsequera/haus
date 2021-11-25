package com.haus.screens;

import com.haus.business.Auth;
import com.haus.interfaces.IAuth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class LogInController extends pageController {

    @FXML
    private Button singInButton;

    @FXML
    private Button toRegister;


    IAuth auth = new Auth();

    @FXML
    void LogIn(ActionEvent event) throws IOException {
        String user = "isa";
        String password = "amoasebastian";
        if(auth.logIn(user,password)) this.goHome(event);
        else super.goAccount(event);
    }

}
