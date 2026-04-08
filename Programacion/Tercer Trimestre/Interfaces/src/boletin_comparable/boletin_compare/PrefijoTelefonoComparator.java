package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class PrefijoTelefonoComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int dato1 = Integer.parseInt(o1.getTelefono().substring(0, 2));
        int dato2 = Integer.parseInt(o2.getTelefono().substring(0, 2));
        return Integer.compare(dato2, dato1);
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
