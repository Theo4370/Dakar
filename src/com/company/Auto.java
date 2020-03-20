package com.company;

public class Auto extends Vehiculo {

    private static final Integer PESO_AUTO=1000;
    private static final Integer CANTIDAD_RUEDAS_AUTO=4;
    public Auto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, PESO_AUTO, CANTIDAD_RUEDAS_AUTO);
    }
}
