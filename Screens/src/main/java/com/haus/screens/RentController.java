package com.haus.screens;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class RentController extends pageController{

    @FXML
    private Button PagarButton;

    @FXML
    private TextField PayCorreo;

    @FXML
    private TextField PayNumer;

    @FXML
    private ComboBox<?> PayTipo;

    @FXML
    private TextField PayTitular;

    @FXML
    private DatePicker PayVenciminteo;


    @FXML
    void buy(ActionEvent event) {
    }


}
