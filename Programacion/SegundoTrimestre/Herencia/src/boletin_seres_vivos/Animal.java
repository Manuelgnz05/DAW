package boletin_seres_vivos;

import boletin_poligonos.NumeroInvalidoException;

/*
Cree una clase Animal en la jerarquía, teniendo en cuenta que hay dos tipos de
animales: vertebrados e invertebrados. Implemente este ejercicio creando la cantidad
de clases que estime necesaria. Tenga en cuenta que, dentro de los vertebrados, estos
se distinguen por la cantidad de vértebras que tienen.
 */

public abstract class Animal extends Vertebrados{

    public Animal(float alto, float ancho, float largo, int numeroCelulas, int numeroVertebras) throws NumeroInvalidoException {
        super(alto, ancho, largo, numeroCelulas, numeroVertebras);
    }
}
