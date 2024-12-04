package com.project;

/*Clase Padre (Agua)*/ 
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

    /*Método para describir el estado común de todos los objetos que derivan de agua*/ 
    public void estado() {
        System.out.println("El agua está en estado líquido.");
    }
}
 
/*Main */ 
public class Main {
    public static void main(String[] args) {
        /*Crear un objeto de la clase Agua
        * Agua con volumen de 10 litros
        */ 
        Agua agua = new Agua(10.0);
        /*Llamar a los métodos
         * Mostrar el volumen
         * Mostrar el estado del agua
         */
        agua.getVolumen();
        agua.estado();  
    }
}