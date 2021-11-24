package com.haus.screens;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class LogInController extends pageController {

    @FXML
    private Button singInButton;

    @FXML
    private Button toRegister;

    @FXML
    void LogIn(ActionEvent event) throws IOException {
        this.goHome(event);
    }

}
