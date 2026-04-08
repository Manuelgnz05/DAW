package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class EdadParImparComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        boolean dato1 = o1.getEdad()%2 == 0;
        boolean dato2 = o2.getEdad()%2 == 0;
        if (dato1 && !dato2){
            return -1;
        } else if (!dato1 && dato2) {
            return 1;
        }else {
            return o1.getEdad() - o2.getEdad();
        }
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
