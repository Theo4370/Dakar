package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //     SocorristaAuto socorristaAuto = new SocorristaAuto();
        //Auto unAuto = new Auto(2,3,4,"hola");
        Auto unAuto = new Auto(20,50,40,"4370");
        SocorristaAuto socorristaAuto = new SocorristaAuto();
        SocorristaMoto socorristaMoto = new SocorristaMoto();
        Carrera unaCarrera = new Carrera(100, 150.0, "carrera1", 4, socorristaAuto, socorristaMoto);
        unaCarrera.darDeAltaAuto(20, 50, 40, "4370");
        unaCarrera.darDeAltaMoto(30, 40, 20, "Algo mas");
        unaCarrera.darDeAltaAuto(10, 20, 50, "Algo");
        unaCarrera.darDeAltaMoto(100, 100, 100, "Cosa");
        System.out.println("Agregue: " + unaCarrera.getListaDeVehiculos());
                socorristaAuto.socorrer(unAuto);

        unaCarrera.definirGanador();
        //System.out.println("Agregue: " + unaCarrera.getListaDeVehiculos());
        //unaCarrera.eliminarVehiculo("4370");
        //unaCarrera.eliminarVehiculo();
    }

}