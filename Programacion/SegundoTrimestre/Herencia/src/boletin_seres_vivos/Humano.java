package boletin_seres_vivos;

import boletin_poligonos.NumeroInvalidoException;

public final class Humano extends Animal{

    public Humano(float alto, float ancho, float largo, int numeroCelulas, int numeroVertebras) throws NumeroInvalidoException {
        super(alto, ancho, largo, numeroCelulas, numeroVertebras);
    }

    public void hablar(String mensaje){
        System.out.println(mensaje);
    }

}
