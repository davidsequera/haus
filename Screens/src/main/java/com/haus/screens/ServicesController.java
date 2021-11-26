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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ServicesController extends pageController implements Initializable {

    @FXML
    private Label PropertyLocation;

    @FXML
    private Label PropertyName;

    @FXML
    private Label PropertyPrice;

    @FXML
    private ComboBox<Service> ServicesCombo;

    @FXML
    private TableView<Service> TableServices;

    @FXML
    private Button addServiceButton;

    @FXML
    private Button deleteServiceButton;

    @FXML
    private Button modifyServiceButton;

    @FXML
    private Button btnPagar;


    public Rent rent;

    IMangeService mangeService = new ManageService();


    public void setRent(Rent r){
        this.PropertyName.setText(r.getNombre());
        this.PropertyLocation.setText(r.getLugar());
        this.PropertyPrice.setText("Precio: "+r.getPrecio());
        this.rent = r;
    }
    @FXML
    void addService(ActionEvent event) {

    }
    @FXML
    void deleteService(ActionEvent event) {

    }
    @FXML
    void modifyService(ActionEvent event) {

    }

    @FXML
    void pickService(ActionEvent event) {

    }
    public void goRent(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("rent.fxml"));
        Parent root = loader.load();
        RentController rentController = loader.getController();
        rentController.setUser(this.getUser());
        rentController.setRent(this.rent);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage) this.btnPagar.getScene().getWindow();
        myStage.close();
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
        ObservableList<Service> list = FXCollections.observableArrayList(
                Objects.requireNonNull(mangeService.listarServcicios())
        );
        this.ServicesCombo.setItems(list);
    }

}
