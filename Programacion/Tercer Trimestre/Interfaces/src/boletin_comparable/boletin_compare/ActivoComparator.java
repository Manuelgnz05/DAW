package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class ActivoComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.isActivo() && !o2.isActivo()){
            return -1;
        } else if (!o1.isActivo() && o2.isActivo()) {
            return 1;
        }
        return o1.getNombre().compareTo(o2.getNombre());
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
