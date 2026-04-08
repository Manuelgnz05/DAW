package boletin_seres_vivos;

import boletin_poligonos.NumeroInvalidoException;

public abstract class Invertebrado extends Pluricelular{
    public Invertebrado(float alto, float ancho, float largo, int numeroCelulas) throws NumeroInvalidoException {
        super(alto, ancho, largo, numeroCelulas);
    }

}
