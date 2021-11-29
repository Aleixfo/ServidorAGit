package com.example.gestiopelicules.Model;

public class Producte {

    //Atributs pelicula
    private int id;
    private String nom;
    private String descripcio;
    private float preu;

    //CONSTRUCTORS
    public Producte(int id, String nom, String descripcio, float preu) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.preu = preu;
    }

    public Producte(String nom, String descripcio, float preu) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.preu = preu;
    }

    public Producte(){}

    //GETTERS
    public int getId(){return this.id;}
    public String getNom(){return this.nom;}
    public String getDescripcio(){return this.descripcio;}
    public float getPreu(){return this.preu;}

    //SETTERS
    public void setId(int id){this.id = id;}
    public void setNom(String nom){this.nom = nom;}
    public void setDescripcio(String descripcio){this.descripcio = descripcio;}
    public void setPreu(float preu){this.preu = preu;}

    //METODE ToString
    public String toString(){
        return this.id+" "+this.nom+" "+this.descripcio+" "+" "+this.preu+"\n";
    }

}//FI DE CLASSE PELICULA
