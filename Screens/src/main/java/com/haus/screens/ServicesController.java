package com.haus.screens;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ServicesController {

    @FXML
    private Button btnPagar;

    @FXML
    private Button home;

    @FXML
    void goHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("list.fxml"));
        Parent root = loader.load();
        ListController listController = loader.getController();
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
        Stage myStage = (Stage) this.home.getScene().getWindow();
        myStage.close();
    }

}
