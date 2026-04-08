package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class UltimaLetraNombreComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().charAt(o1.getNombre().length()-1) - o2.getNombre().charAt(o2.getNombre().length()-1);
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
