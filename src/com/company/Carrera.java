package com.company;

import java.util.*;

public class Carrera {
    private Integer distancia;
    private Double premio;
    private String nombre;
    private Integer cantidadDeVheiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;


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

    public Carrera(Integer distancia, Double premio, String nombre, Integer cantidadDeVheiculosPermitidos) {
        this.distancia = distancia;
        this.premio = premio;
        this.nombre = nombre;
        this.cantidadDeVheiculosPermitidos = cantidadDeVheiculosPermitidos;
        this.listaDeVehiculos = new ArrayList<>();


    }

    public void darDeAltaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        Vehiculo unAuto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (getCantidadDeVheiculosPermitidos() > listaDeVehiculos.size()) {
            listaDeVehiculos.add(unAuto);

        } else {
            System.out.println("Los cupos estan cerrados, no puedes agregar este auto");
        }
    }

    public void darDeAltaMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        Vehiculo unaMoto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (getCantidadDeVheiculosPermitidos() > listaDeVehiculos.size()) {
            listaDeVehiculos.add(unaMoto);
        } else {
            System.out.println("Los cupos estan cerrados, no puedes agregar esta moto");
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
//        Vehiculo vehiculo1 = null;
        listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculo(String patente) {
        for (Vehiculo vehiculo : listaDeVehiculos) {
            if (patente.equals(vehiculo.getPatente())) {
                listaDeVehiculos.remove(vehiculo);
            }
        }
    }

    public void definirGanador() {
        for (Vehiculo vehiculo : listaDeVehiculos) {
            System.out.println("El resultado de este vehiculo fue: " + vehiculo.getResultado());
            //todo falta comparar resultados y deifnir el mayor
        }
    }

    SocorristaAuto socorristaAuto = new SocorristaAuto();
    SocorristaMoto socorristaMoto = new SocorristaMoto();

     public void socorrerAuto(String patente) {
     for (Vehiculo vehiculo : listaDeVehiculos) {
     if (patente.equals(vehiculo.getPatente())) {

     socorristaAuto.socorrer();
     }
     }
     }
}

