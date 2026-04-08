package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class AleatorioPrioridadComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return Integer.compare(o1.getPrioridad(), o2.getPrioridad());
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
