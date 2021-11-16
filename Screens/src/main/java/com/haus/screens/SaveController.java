package com.haus.screens;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SaveController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}