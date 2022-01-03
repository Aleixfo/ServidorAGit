package com.example.springproductes.Entitats;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data //Longbok afegeix setters, getters i el constructor buit.
@Entity //Entitat (se menejara amb una taula)
//@OneToMany - Per indicar una relació de un a molts
@Table(name = "productes") //Si la taula no s'escriu exactament igual a la classe s'ha de posar el nom de la taula (NO ES EL CAS)
public class Producte implements Serializable {

    @Id //Indicam quin es el camp identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Indicam com es genera l'identificador (En aquest cas AUTO_INCREMENT)
    //Atributs pelicula
    private int id;
    private String nom;
    private String descripcio;
    private float preu;



}
