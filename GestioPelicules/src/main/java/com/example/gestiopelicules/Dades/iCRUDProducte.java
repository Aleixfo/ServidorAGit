package com.example.gestiopelicules.Dades;

import com.example.gestiopelicules.Model.Producte;

import java.util.ArrayList;

public interface iCRUDProducte {

    ArrayList<Producte> readAll() throws Exception;
    Producte read(int id) throws Exception;
    Boolean create(String nom, String descripcio, float preu) throws Exception;
    Boolean update(int id, String nom, String descripcio, float preu) throws Exception;
    Boolean delete(int id) throws Exception;
}