package com.haus.screens;

import com.haus.domain.Owner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

abstract class pageController {
    private Owner user;
    @FXML
    private Button account;

    @FXML
    private Button home;


    @FXML
    public void goHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("list.fxml"));
        Parent root = loader.load();
        ListController listController = loader.getController();
        listController.setUser(this.getUser());
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.home.getScene().getWindow();
        myStage.close();
    }
    @FXML
    public void goAccount(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("total.fxml"));
        Parent root = loader.load();
        TotalController totalController = loader.getController();
        totalController.setUser(this.getUser());
        totalController.setAccountText();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.account.getScene().getWindow();
        myStage.close();
    }

    public void  setUser(Owner u){
        this.user = u;
    }

    protected Owner getUser(){
        Owner a = this.user;
        if(a != null)
            a.setPassword("Unathorized");
        return a;
    }

    protected String getUserName(){
        return this.user.getNombre();
    }
    protected String getUserApellido(){
        return this.user.getApellido();
    }
    protected String getUserEmail(){
        return this.user.getCorreo();
    }
}
