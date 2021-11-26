package com.haus.screens;

import com.haus.domain.Owner;
import com.haus.domain.Rent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class TotalController extends pageController{

    @FXML
    private TableColumn<?, ?> ColumnLocation;

    @FXML
    private TableColumn<?, ?> ColumnName;

    @FXML
    private TableColumn<?, ?> ColumnPrice;

    @FXML
    private TableView<?> accountPropertyList;

    @FXML
    private Label accountName;
    @FXML
    private Label accountUser;
    @FXML
    private Button logOutButton;

    public void setAccountText(){
        this.accountName.setText(super.getUserName()+" "+super.getUserApellido());
        this.accountUser.setText(super.getUserEmail());
    }
    @FXML
    public void LogOut(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("logIn.fxml"));
        Parent root = loader.load();
        LogInController logInController = loader.getController();
        this.setUser(null);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage myStage = (Stage) this.logOutButton.getScene().getWindow();
        myStage.close();
    }

}
