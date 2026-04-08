package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class CiudadLetrasNombreCerca18Comparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        int res = o1.getCiudad().compareTo(o2.getCiudad());
        if (res == 0) {
            int longitud1 = o1.getNombre().length();
            int longitud2 = o2.getNombre().length();
            res = Integer.compare(longitud1, longitud2);
            if (res == 0) {
                int distancia1 = Math.abs(o1.getEdad() - 18);
                int distancia2 = Math.abs(o2.getEdad() - 18);
                res = Integer.compare(distancia1, distancia2);
            }
        }
        return res;
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
