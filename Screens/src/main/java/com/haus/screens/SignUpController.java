package com.haus.screens;

import com.haus.business.Auth;
import com.haus.domain.Owner;
import com.haus.interfaces.IAuth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController{

    @FXML
    private TextField TextApellido;

    @FXML
    private TextField TextEmail;

    @FXML
    private TextField TextNombre;

    @FXML
    private TextField TextPassword;

    @FXML
    private Button singUpButton;

    @FXML
    private Button toRegister;

    IAuth auth = new Auth();


    @FXML
    void goLogIn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("logIn.fxml"));
        Parent root = loader.load();
        LogInController logInController = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.singUpButton.getScene().getWindow();
        myStage.close();
    }
    @FXML
    void signIn(ActionEvent event) throws IOException {
        Owner user = auth.signUp(TextEmail.getText(),TextPassword.getText(),TextNombre.getText(),TextApellido.getText());
        if(user != null) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("list.fxml"));
            Parent root = loader.load();
            ListController listController = loader.getController();
            listController.setUser(user);
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            Stage myStage = (Stage) this.singUpButton.getScene().getWindow();
            myStage.close();
        }
    }

}
