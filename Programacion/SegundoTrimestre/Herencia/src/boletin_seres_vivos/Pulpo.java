package boletin_seres_vivos;

import boletin_poligonos.NumeroInvalidoException;

public final class Pulpo extends Invertebrado{
    public Pulpo(float alto, float ancho, float largo, int numeroCelulas) throws NumeroInvalidoException {
        super(alto, ancho, largo, numeroCelulas);
    }
}
