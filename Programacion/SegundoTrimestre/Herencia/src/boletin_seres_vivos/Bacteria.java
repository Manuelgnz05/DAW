package boletin_seres_vivos;

/*
Cree una clase para los seres vivos unicelulares y otra para los pluricelulares. Cree la
clase Bacteria y haga que cuelgue donde corresponda. Se podrán crear instancias de
bacterias pero no de las clases unicelulares y pluricelulares. Tampoco de la clase
SerVivo.
 */

import boletin_poligonos.NumeroInvalidoException;

public final class Bacteria extends Unicelular{

    public Bacteria(float alto, float ancho, float largo) throws NumeroInvalidoException {
        super(alto, ancho, largo);
    }

}
