package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class NotaMediaComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        int res = Double.compare(o2.getNotaMedia(), o1.getNotaMedia());
        if (res == 0){
            res = o1.getNombre().compareTo(o2.getNombre());
        }
        return res;
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
