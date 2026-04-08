package boletin_seres_vivos;

import boletin_poligonos.NumeroInvalidoException;

public final class Perro extends Animal{

    public Perro(float alto, float ancho, float largo, int numeroCelulas, int numeroVertebras) throws NumeroInvalidoException {
        super(alto, ancho, largo, numeroCelulas, numeroVertebras);
    }

    public void ladrar(){
        System.out.println("Guau Guau Guau");
    }

}
