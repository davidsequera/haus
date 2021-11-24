package com.haus.screens;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class SignUpController extends  pageController{
    @FXML
    private Label welcomeText;

    @FXML
    public void singUp(ActionEvent event) throws IOException {
        super.goHome(event);
    }
}