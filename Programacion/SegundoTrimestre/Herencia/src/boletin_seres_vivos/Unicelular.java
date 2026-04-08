package boletin_seres_vivos;

import boletin_poligonos.NumeroInvalidoException;

public abstract class Unicelular extends SerVivo{

    public Unicelular(float alto, float ancho, float largo) throws NumeroInvalidoException {
        super(alto, ancho, largo);
    }

}
