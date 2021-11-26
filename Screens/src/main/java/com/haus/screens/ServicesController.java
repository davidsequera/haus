package com.haus.screens;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ServicesController extends pageController{
    @FXML
    private Button btnPagar;
    public void goRent(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("rent.fxml"));
        Parent root = loader.load();
        RentController rentController = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
//        stage.setOnCloseRequest(e-> {
//            try {
//                servicesController.regresarMenuProfe(event);
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });
        Stage myStage = (Stage) this.btnPagar.getScene().getWindow();
        myStage.close();
    }


}
