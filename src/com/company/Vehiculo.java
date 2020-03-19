package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Vehiculo {

    private Integer velocidad;
    private Integer aceleracion;
    private Integer anguloDeGiro;
    private String patente;
    private Integer peso;
    private Integer ruedas;


    public Vehiculo(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente, Integer peso, Integer ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }


    public Integer getVelocidad() {
        return velocidad;
    }

    public Integer getAceleracion() {
        return aceleracion;
    }

    public Integer getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public Integer getPeso() {
        return peso;
    }

    public String getPatente() {
        return patente;
    }

    public Integer getResultado() {
        //Le agrego el *1000 porque sino me tira un decimal y me devuelve 0
        return 1000*(getVelocidad() * getAceleracion()) / (2 * getAnguloDeGiro() * (getPeso() - (getRuedas() * 100)));
    }

    @Override
    public boolean equals(Object vehiculoAComparar) {
        if (!(vehiculoAComparar instanceof Vehiculo)) {
            return false;
        }

        Vehiculo otroVehiculo = (Vehiculo) vehiculoAComparar;
        return otroVehiculo.getPatente().equals(this.patente);
    }
}
