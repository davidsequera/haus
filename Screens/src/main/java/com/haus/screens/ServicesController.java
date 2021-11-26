package com.haus.screens;

import com.haus.domain.Rent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ServicesController extends pageController{

    @FXML
    private Label PropertyLocation;

    @FXML
    private Label PropertyName;

    @FXML
    private Label PropertyPrice;

    @FXML
    private Label TextLocation;

    @FXML
    private Label TextName;


    @FXML
    private Button btnPagar;
    public void setRent(Rent r){
        this.PropertyName.setText(r.getNombre());
        this.PropertyLocation.setText(r.getLugar());
        this.PropertyPrice.setText("Precio: "+r.getPrecio());
    }

    public void goRent(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("rent.fxml"));
        Parent root = loader.load();
        RentController rentController = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage) this.btnPagar.getScene().getWindow();
        myStage.close();
    }


}
