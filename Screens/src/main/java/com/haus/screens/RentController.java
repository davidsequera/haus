package com.haus.screens;

import com.haus.business.ManageService;
import com.haus.domain.Rent;
import com.haus.domain.Service;
import com.haus.interfaces.IMangeService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class RentController extends pageController implements Initializable {

    @FXML
    private Button PagarButton;

    @FXML
    private Button ServicesButton;

    @FXML
    private TextField PayCorreo;

    @FXML
    private TextField PayNumer;

    @FXML
    private ComboBox<String> PayTipo;

    @FXML
    private TextField PayTitular;

    @FXML
    private DatePicker PayVenciminteo;

    @FXML
    private Label PropertyLocation;

    @FXML
    private Label PropertyName;

    @FXML
    private Label PropertyPrice;

    public Rent rent;

    IMangeService mangeService = new ManageService();

    @FXML
    void buy(ActionEvent event) {
    }

    public void setRent(Rent r){
        this.PropertyName.setText(r.getNombre());
        this.PropertyLocation.setText(r.getLugar());
        this.PropertyPrice.setText("Precio: "+r.getPrecio());
        this.rent = r;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            LoadData();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void LoadData() throws IOException{
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Visa", "MasterCard");
        this.PayTipo.setItems(list);
    }
    @FXML
    void goServices(ActionEvent event) throws IOException {
        Rent property = this.rent;
        if(property != null){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("services.fxml"));
            Parent root = loader.load();
            ServicesController servicesController = loader.getController();
            servicesController.setUser(this.getUser());
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            servicesController.setRent(property);
            stage.show();
            Stage myStage = (Stage) this.ServicesButton.getScene().getWindow();
            myStage.close();
        }

    }
}
