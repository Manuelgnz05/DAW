package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class LongitudNombreComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o2.getNombre().length() - o1.getNombre().length();
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
