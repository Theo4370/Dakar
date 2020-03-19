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

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        Vehiculo unAuto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (getCantidadDeVheiculosPermitidos() > listaDeVehiculos.size()) {
            listaDeVehiculos.add(unAuto);

        }
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        Vehiculo unaMoto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (getCantidadDeVheiculosPermitidos() > listaDeVehiculos.size()) {
            listaDeVehiculos.add(unaMoto);
        }
    }
}

