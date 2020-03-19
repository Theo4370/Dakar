package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Carrera unaCarrera = new Carrera(100, 150.0, "carrera1", 2);
        unaCarrera.darDeAltaAuto(12.2, 50.0, 32.2, "4370");
        unaCarrera.darDeAltaMoto(15.6, 20.3, 50.0, "Algo");
        System.out.println("Agregue: " + unaCarrera.getListaDeVehiculos());
        unaCarrera.eliminarVehiculo("4370");
        unaCarrera.eliminarVehiculo();
        System.out.println("Agregue: " + unaCarrera.getListaDeVehiculos());
    }

}