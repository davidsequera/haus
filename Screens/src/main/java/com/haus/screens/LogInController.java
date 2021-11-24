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

    Iauth auth = new Auth;
    @FXML
    void LogIn(ActionEvent event) throws IOException {
        String user = "isa";
        String password = "amoasebastian";

        if(true) super.goHome(event);
    }

}
