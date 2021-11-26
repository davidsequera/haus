package com.haus.screens;

import com.haus.business.Integrador;
import com.haus.business.ListProperties;
import com.haus.domain.Rent;
import com.haus.interfaces.IListProperties;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ListController extends pageController implements Initializable {

    @FXML
    private TableColumn<Rent, String> ColumnLocation;

    @FXML
    private TableColumn<Rent, String> ColumnName;

    @FXML
    private TableColumn<Rent, Integer> ColumnPrice;

    @FXML
    private TableView<Rent> PropertyList;


    @FXML
    private Button btRentar;


    IListProperties listProperties = new ListProperties();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            LoadData();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private void LoadData() throws IOException {
        ObservableList<Rent> list = FXCollections.observableArrayList(
                Objects.requireNonNull(listProperties.listarPropiedades())
        );
        ColumnName.setCellValueFactory(new PropertyValueFactory<Rent,String>("nombre"));
        ColumnLocation.setCellValueFactory(new PropertyValueFactory<Rent, String>("lugar"));
        ColumnPrice.setCellValueFactory(new PropertyValueFactory<Rent,Integer>("precio"));
        PropertyList.setItems(list);

    }



    @FXML
    void goServices(ActionEvent event) throws IOException {
        Rent property =PropertyList.getSelectionModel().getSelectedItem();
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
            Stage myStage = (Stage) this.btRentar.getScene().getWindow();
            myStage.close();
        }

    }


}
