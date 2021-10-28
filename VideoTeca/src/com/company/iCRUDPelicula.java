package com.company;

import java.util.ArrayList;

public interface iCRUDPelicula {

    ArrayList<Pelicula> readAll() throws Exception;
    Pelicula read(int id) throws Exception;
    Boolean create(String titol, String any, String director, String genere) throws Exception;
    Boolean update(int id, String titolP, String anyP, String directorP, String genereP) throws Exception;
    Boolean delete(int id) throws Exception;
}
