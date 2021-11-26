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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController{
    @FXML
    private PasswordField TextPassword;

    @FXML
    private TextField TextUsuario;

    @FXML
    private Button signInButton;

    @FXML
    private Button toRegister;


    IAuth auth = new Auth();

    @FXML
    void goSignUp(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
        Parent root = loader.load();
        SignUpController signUpController = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.toRegister.getScene().getWindow();
        myStage.close();
    }
    @FXML
    void LogIn(ActionEvent event) throws IOException {
        Owner u = auth.logIn(TextUsuario.getText(),TextPassword.getText());
        if(u != null ) {
            this.goIn(u);
        }
    }
    @FXML
    protected void goIn(Owner o) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("list.fxml"));
        Parent root = loader.load();
        ListController listController = loader.getController();
        listController.setUser(o);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.signInButton.getScene().getWindow();
        myStage.close();
    }

}
