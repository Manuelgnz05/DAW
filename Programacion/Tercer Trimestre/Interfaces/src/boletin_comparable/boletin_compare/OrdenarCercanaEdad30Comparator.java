package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class OrdenarCercanaEdad30Comparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int dato1 = Math.abs(o1.getEdad() - 30);
        int dato2 = Math.abs(o2.getEdad() - 30);
        return Integer.compare(dato1, dato2);
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
