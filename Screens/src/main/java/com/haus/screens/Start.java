package com.haus.screens;

import com.haus.business.Integrador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Start.class.getResource("logIn.fxml"));
            // Cargo la ventana
            Pane ventana = loader.load();
            // Cargo el scene
            Scene scene = new Scene(ventana);
            // Seteo la scene y la muestro
            primaryStage.setScene(scene);
            primaryStage.setTitle("Haus");
            primaryStage.show();
            Integrador.getServices();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}