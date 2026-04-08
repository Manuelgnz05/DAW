package boletin_seres_vivos;

import boletin_poligonos.NumeroInvalidoException;

public abstract class Pluricelular extends SerVivo{

    protected int numeroCelulas;

    public Pluricelular(float alto, float ancho, float largo, int numeroCelulas) throws NumeroInvalidoException {
        super(alto, ancho, largo);
        this.numeroCelulas = numeroCelulas;
    }

}
