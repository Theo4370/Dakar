package com.company;

public class Moto extends Vehiculo {
    //Conviene asi, es mas declarativo, el static hace que se pueda hacer Moto.pesoMoto (aplicar a una clase)
    //El static hace que sea un atributo de la clase, no del objeto
    //El static se puede agregar a los metodos, ej: public static algo(){}
    //Todos lo objetos de moto van a tener los mismos atributos static
    //Por convencion se expresa private static final ALGO_ASI
    //Tambien podria ser public static final Integer, el final hace que lo puedas leer pero no modificar
    private static final Integer PESO_MOTO = 300;
    private static final Integer CANTIDAD_RUEDAS_MOTO = 2;

    public Moto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, PESO_MOTO, CANTIDAD_RUEDAS_MOTO);
    }
}
