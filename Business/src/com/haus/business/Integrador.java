package com.haus.business;

import com.haus.domain.Rent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Integrador {
    public static ObservableList<Rent> leerDeArchivoTexto() throws IOException {

        ObservableList<Rent> properties = FXCollections.observableArrayList();
        String SEPARATOR=",";
        BufferedReader br = null;
        String archCSV = "E:\\codes\\haus\\Business\\db\\rent.csv";
        try {
            br = new BufferedReader(new FileReader(archCSV));
            br.readLine();
            String cad = br.readLine();
            while (!cad.equalsIgnoreCase("#FIN")){
                String [] fields = cad.split(SEPARATOR);
                int precio = Integer.parseInt(fields[2]);
                Rent property = new Rent(fields[0],fields[1],precio);
                properties.add(property);
                cad = br.readLine();
            }
            br.close();
            return properties;
        } catch (FileNotFoundException e) {
            System.out.println("El archivo de texto no ha sido encontrado" + e);
        }
        return null;
    }
}
