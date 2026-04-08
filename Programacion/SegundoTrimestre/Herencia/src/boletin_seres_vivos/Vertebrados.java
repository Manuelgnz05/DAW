package boletin_seres_vivos;

import boletin_poligonos.NumeroInvalidoException;

public abstract class Vertebrados extends Pluricelular{

    protected int numeroVertebras;

    public Vertebrados(float alto, float ancho, float largo, int numeroCelulas, int numeroVertebras) throws NumeroInvalidoException {
        super(alto, ancho, largo, numeroCelulas);
        this.numeroVertebras = numeroVertebras;
    }
}
