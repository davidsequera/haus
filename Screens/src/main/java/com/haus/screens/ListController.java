package com.haus.screens;

import com.haus.business.Integrador;
import com.haus.domain.Rent;
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
    private Button account;

    @FXML
    private Button btRentar;

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
                Objects.requireNonNull(Integrador.leerDeArchivoTexto())
        );
        ColumnName.setCellValueFactory(new PropertyValueFactory<Rent,String>("name"));
        ColumnLocation.setCellValueFactory(new PropertyValueFactory<Rent, String>("location"));
        ColumnPrice.setCellValueFactory(new PropertyValueFactory<Rent,Integer>("price"));
        PropertyList.setItems(list);

    }



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
        Stage myStage = (Stage) this.btRentar.getScene().getWindow();
        myStage.close();
    }


}
