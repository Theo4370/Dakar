package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Carrera unaCarrera = new Carrera(100, 150.0, "carrera1", 3);
        unaCarrera.darDeAltaAuto(12, 50, 32, "4370");
        unaCarrera.darDeAltaMoto(32,45,23,"Algo mas");
        unaCarrera.darDeAltaMoto(15, 20, 50, "Algo");
        System.out.println("Agregue: " + unaCarrera.getListaDeVehiculos());
        //unaCarrera.eliminarVehiculo("4370");
        //unaCarrera.eliminarVehiculo();
        //System.out.println("Agregue: " + unaCarrera.getListaDeVehiculos());
    unaCarrera.definirGanador();

    }

}