package boletin_comparable;

import java.util.Comparator;

public class LongevidadComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getLongevidad() - o2.getLongevidad();
    }

    @Override
    public Comparator<Animal> reversed() {
        return Comparator.super.reversed();
    }
}
