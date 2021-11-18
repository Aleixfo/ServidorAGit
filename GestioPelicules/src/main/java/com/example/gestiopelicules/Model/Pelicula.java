package com.example.gestiopelicules.Model;

public class Pelicula {

    //Atributs pelicula
    private int id;
    private String titol;
    private String any;
    private String director;
    private String genere;

    //CONSTRUCTORS
    public Pelicula(int id, String titol, String any, String director, String genere) {
        this.id = id;
        this.titol = titol;
        this.any = any;
        this.director = director;
        this.genere = genere;
    }

    public Pelicula(String titol, String any, String director, String genere) {
        this.titol = titol;
        this.any = any;
        this.director = director;
        this.genere = genere;
    }

    public Pelicula(){}

    //GETTERS
    public int getId(){return this.id;}
    public String getTitol(){return this.titol;}
    public String getAny(){return this.any;}
    public String getDirector(){return this.director;}
    public String getGenere(){return this.genere;}

    //SETTERS
    public void setId(int id){this.id = id;}
    public void setTitol(String titol){this.titol = titol;}
    public void setAny(String any){this.any = any;}
    public void setDirector(String director){this.director = director;}
    public void setGenere(String genere){this.genere = genere;}

    //METODE ToString
    /*public String toString(){
        return "\n\nPELICULA\n----------\nId -> "+this.id+"\nTítol -> "+this.titol+"\nAny -> "+this.any+"\nDirector -> "+"\nGenere -> "+this.genere;
    }*/
    public String toString(){
        return this.id+" "+this.titol+" "+this.any+" "+" "+this.genere+"\n";
    }

}//FI DE CLASSE PELICULA
