package boletin_comparable;

import java.util.Arrays;
import java.util.Comparator;

public class PesoComparator implements Comparator<Persona> {


    @Override
    public int compare(Persona o1, Persona o2) {
        return (int) (o1.getPeso() - o2.getPeso());
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
