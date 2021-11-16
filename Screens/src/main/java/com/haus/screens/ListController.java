package com.haus.screens;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ListController {

    @FXML
    private Button bt1;

    @FXML
    void changeServices(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("services.fxml"));
        Parent root = loader.load();
        ServicesController servicesController = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
//        stage.setOnCloseRequest(e-> {
//            try {
//                servicesController.goHome(event);
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });
        Stage myStage = (Stage) this.bt1.getScene().getWindow();
        myStage.close();
    }

}
