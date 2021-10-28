package com.company;

import java.util.Scanner;

public class Negoci{

    public Negoci(){}

    public static void menu() throws Exception {

        Scanner sc = new Scanner(System.in);
        CRUDPelicula crud = new CRUDPelicula();

        int resposta;
        int id;

        do{
            System.out.println("""
                    ****************MENU****************
                    * 1 -> Llistar totes les pelicules *
                    * 2 -> Llistar pelicula per id     *
                    * 3 -> Actualitzar pelicula        *
                    * 4 -> Borrar pelicula             *
                    * 5 -> Crear pelicula              *
                    * 0 -> Finalitzar programa         *
                    ************************************""");
            System.out.print("Opcio -> ");
            resposta = sc.nextInt();

            switch (resposta) {
                case 1 -> System.out.println(crud.readAll());
                case 2 -> {
                    System.out.print("Introdueix l'ID de la pelicula a llistar\nID -> ");
                    id = sc.nextInt();
                    System.out.println(crud.read(id));
                }
                case 3 -> {
                    System.out.print("Introdueix l'ID de la pelicula a actualitzar\nID -> ");
                    id = sc.nextInt();
                    //System.out.println(crud.update(id));
                }
                case 4 -> {
                    System.out.print("Introdueix l'ID de la pelicula que vols eliminar\nID -> ");
                    id = sc.nextInt();
                    System.out.println(crud.delete(id));
                }
                //case 5 -> System.out.println(crud.create());
                case 0 -> {
                    crud.desconectar();
                    System.out.println("HAS SORTIT DEL PROGRAMA, ADEU!");
                }
            }

        }while (resposta != 0);

    }

}
