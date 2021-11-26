package com.haus.business;

import com.haus.domain.Owner;
import com.haus.domain.Payment;
import com.haus.domain.Rent;
import com.haus.domain.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Integrador {
    public  static String base = "E:\\codes\\haus\\Business\\";
    public  static String rentCSV = base+"db\\rent.csv";
    public  static String ownerCSV = base+"db\\owner.csv";
    public  static String requestCSV = base+"db\\request.csv";
    public  static String serviceCSV = base+"db\\service.csv";
    public  static String SEPARATOR = ",";

    public static List<Rent> getProperties() throws IOException {

        List<Rent> properties = new ArrayList<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(rentCSV));
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
    public static List<Owner> getUsers() throws IOException {
        List<Owner> list = new ArrayList<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(ownerCSV));
            br.readLine();
            String cad = br.readLine();
            while (!cad.equalsIgnoreCase("#FIN")){
                String [] fields = cad.split(SEPARATOR);
                Owner user = new Owner(fields[0],fields[1],fields[2],fields[3]);
                list.add(user);
                cad = br.readLine();
            }
            br.close();
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("El archivo de texto no ha sido encontrado" + e);
        }
        return null;
    }
    public static List<Service> getServices() throws IOException {
        List<Service> list = new ArrayList<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(ownerCSV));
            br.readLine();
            String cad = br.readLine();
            while (!cad.equalsIgnoreCase("#FIN")){
                String [] fields = cad.split(SEPARATOR);
                int precio = Integer.parseInt(fields[1]);
                Service service = new Service(fields[0],precio);
                list.add(service);
                cad = br.readLine();
            }
            br.close();
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("El archivo de texto no ha sido encontrado" + e);
        }
        return null;
    }
    public static void saveUser(Owner usuario) {
        //guardar en la base de datos el usuario;
        try {
            FileWriter csvWriter = new FileWriter(ownerCSV);
            csvWriter.append(usuario.getCorreo()).append(",").append(usuario.getPassword()).
                    append(",").append(usuario.getNombre()).append(",").
                    append(usuario.getApellido());
            csvWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void savePayment(Payment pago) throws IOException {
        //guardar en la base de datos el pago;
        pago.getTitular();
    }

}
