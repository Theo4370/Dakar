package com.company;

import java.util.*;

public class Carrera {
    private Integer distancia;
    private Double premio;
    private String nombre;
    private Integer cantidadDeVheiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;


    public Integer getDistancia() {
        return distancia;
    }

    public Double getPremio() {
        return premio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidadDeVheiculosPermitidos() {
        return cantidadDeVheiculosPermitidos;
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public Carrera(Integer distancia, Double premio, String nombre, Integer cantidadDeVheiculosPermitidos, SocorristaAuto socorristaAuto, SocorristaMoto socorristaMoto) {
        this.distancia = distancia;
        this.premio = premio;
        this.nombre = nombre;
        this.cantidadDeVheiculosPermitidos = cantidadDeVheiculosPermitidos;
        this.listaDeVehiculos = new ArrayList<>();
        this.socorristaAuto = socorristaAuto;
        this.socorristaMoto = socorristaMoto;

    }

    public void darDeAltaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        Vehiculo unAuto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (getCantidadDeVheiculosPermitidos() > listaDeVehiculos.size()) {
            listaDeVehiculos.add(unAuto);
            System.out.println("Auto dado de alta");
        } else {
            System.out.println("Los cupos estan cerrados, no puedes agregar este auto");
        }
    }

    public void darDeAltaMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        Vehiculo unaMoto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (getCantidadDeVheiculosPermitidos() > listaDeVehiculos.size()) {
            listaDeVehiculos.add(unaMoto);
            System.out.println("Moto dada de alta");
        } else {
            System.out.println("Los cupos estan cerrados, no puedes agregar esta moto");
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
//        Vehiculo vehiculo1 = null;
        listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculo(String patente) {
        //USO Vehiculo vehiculoAEliminar=null PARA NO USAR EL REMOVE, LUEGO SACO EL .remove
        //LUEGO AGREGO FUERA DEL FOR this.listaDeVehiculos.remove(vehiculoAEliminar)
        for (Vehiculo vehiculo : listaDeVehiculos) {
            //if (vehiculo.getPatente().equals(patente)) ME AHORRO REDEFINIR EL EQUALS
            if (patente.equals(vehiculo.getPatente())) {
                listaDeVehiculos.remove(vehiculo);
                break;
                //El break corta el for una vez que encuentra el resultado
            }
        }
    }

    public void definirGanador(){
        //todo
        Vehiculo vehiculoGanador = null;
        Integer puntajeMaximoTemporal = 0; //100

        for (Vehiculo vehiculo : listaDeVehiculos) {
            Integer puntajeDeVehiculo = vehiculo.getResultado();
            if (puntajeDeVehiculo > puntajeMaximoTemporal){
                vehiculoGanador = vehiculo;
                puntajeMaximoTemporal = puntajeDeVehiculo;
            }
        }

        System.out.println("El ganador, de patente "+vehiculoGanador.getPatente() + ", gano con un puntaje de "+puntajeMaximoTemporal );
    }

   /** public void definirGanador() {
        Integer ganador = 0;

        for (Vehiculo vehiculo : listaDeVehiculos) {
            if (ganador < vehiculo.getResultado()) {
                ganador = vehiculo.getResultado();
            }
        }
        System.out.println("El ganador fue: " + ganador);
    }
    /**
     SocorristaAuto socorristaAuto = new SocorristaAuto();
     SocorristaMoto socorristaMoto = new SocorristaMoto();

     public void socorrerAuto(String patente) {
     for (Vehiculo vehiculo : listaDeVehiculos) {
     if (patente.equals(vehiculo.getPatente())) {

     socorristaAuto.socorrer();
     }
     }
     } */


}