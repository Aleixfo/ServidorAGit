package com.example.gestiopelicules.Dades;

import com.example.gestiopelicules.Model.Usuari;

public interface iCRUDUsuaris {

    Usuari read(String username) throws Exception;

}
