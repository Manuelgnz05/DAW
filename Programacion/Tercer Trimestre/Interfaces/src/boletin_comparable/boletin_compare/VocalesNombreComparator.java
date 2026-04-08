package boletin_comparable.boletin_compare;

import boletin_comparable.Persona;

import java.util.Comparator;

public class VocalesNombreComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int vocales1 = contarVocales(o1.getNombre());
        int vocales2 = contarVocales(o2.getNombre());
        return Integer.compare(vocales1, vocales2);
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }

    private int contarVocales(String nombre){
        nombre = nombre.toLowerCase();
        int vocales = 0;
        for (int i = 0; i < nombre.length()-1; i++) {
            if (nombre.charAt(i) == 'a' || nombre.charAt(i) == 'e' || nombre.charAt(i) == 'i' || nombre.charAt(i) == 'o' || nombre.charAt(i) == 'u');
            vocales++;
        }
        return vocales;
    }

}
