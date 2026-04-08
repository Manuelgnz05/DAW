package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class OrdenarCiudadComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getCiudad().compareTo(o2.getCiudad());
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
