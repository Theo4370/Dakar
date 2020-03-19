package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Vehiculo {

    private Double velocidad;
    private Double aceleracion;
    private Double anguloDeGiro;
    private String patente;
    private Integer peso;
    private Integer ruedas;


    public Vehiculo(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente, Integer peso, Integer ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }


    public Double getVelocidad() {
        return velocidad;
    }

    public Double getAceleracion() {
        return aceleracion;
    }

    public Double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPatente() {
        return patente;
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
