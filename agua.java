package com.project;

import java.util.ArrayList;
import java.util.List;

/*Clase Agua*/ 
public class Agua {
    /*Volumen en litros*/
    private double volumen;

    /*Constructor*/
    public Agua(double volumen) {
        this.volumen = volumen;
    }

    /*Método para obtener el volumen*/ 
    public double getVolumen() {
        return volumen;
    }

    /*Método para describir el estado del agua*/ 
    public void estado() {
        System.out.println("El agua está en estado líquido.");
    }
}

/*Clase Principal*/ 
public class agua {
    public static void main(String[] args) {
        /*Crear una lista de objetos de Agua*/ 
        List<Agua> contenedores = new ArrayList<>();

        /*Agregar objetos de Agua a la lista*/ 
        contenedores.add(new Agua(10.0)); /*Contenedor 1*/ 
        contenedores.add(new Agua(20.0)); /*Contenedor 2*/ 

        /*try-catch para una excepción*/ 
        try {
            /*Intentar acceder a un contenedor fuera del rango*/
            System.out.println("Volumen del contenedor 3: " + contenedores.get(2).getVolumen() + " litros.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: El contenedor que intentaste acceder no existe.");
        }

        /*Mostrar volúmenes de los contenedores existentes */
        System.out.println("\nLista de volúmenes en los contenedores:");
        for (int i = 0; i < contenedores.size(); i++) {
            System.out.println("Contenedor " + (i + 1) + ": " + contenedores.get(i).getVolumen() + " litros.");
        }
    }
}
