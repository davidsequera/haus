package com.example.tablalista.controller;

import com.example.tablalista.model.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class TableController implements Initializable {


    @FXML
    private TableView<Property> TablaTest = new TableView<>();
    @FXML
    private TableColumn<Property, String> ColumnLocation;

    @FXML
    private TableColumn<Property, String> ColumnName;

    @FXML
    private TableColumn<Property, Double> ColumnPrice;
    @FXML
    private TextArea Screen;
    @FXML
    private Button btRentar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            LoadData();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private void LoadData() throws IOException {
        ObservableList<Property> list = FXCollections.observableArrayList(
                Objects.requireNonNull(Integrador.leerDeArchivoTexto())
        );
        ColumnName.setCellValueFactory(new PropertyValueFactory<Property,String>("name"));
        ColumnPrice.setCellValueFactory(new PropertyValueFactory<Property,Double>("Price"));
        ColumnLocation.setCellValueFactory(new PropertyValueFactory<Property, String>("Location"));
        TablaTest.setItems(list);

    }
    @FXML
    void DisplaySelected(ActionEvent event){
        Property property =TablaTest.getSelectionModel().getSelectedItem();
        if (property == null){
            Screen.setText("No Property selected");
        }else
            Screen.setText("La propiedad : "+
                    property.getName() +" Ubicada en "+ property.getLocation() +"\n con un precio de renta de :" +
                    property.getPrice());

    }


}
