package boletin_comparable;

import boletin_comparable.boletin_compare.LongitudNombreComparator;
import boletin_comparable.boletin_compare.OrdenarCercanaEdad30Comparator;
import boletin_comparable.boletin_compare.PrefijoTelefonoComparator;
import boletin_comparable.boletin_compare.VocalesNombreComparator;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Manuel", 102, 1.82, 82.2, LocalDate.of(2005, 2, 2), "235433890A", 1200, "Sevilla", 10.0, true, "34342675098", 10);
        Persona p2 = new Persona("Eren", 50, 0.82, 182.2, LocalDate.of(1005, 12, 20), "2387888890A", 200, "Madrid", 1.0, false, "01344535098", 0);
        Persona p3 = new Persona("Jorge", 50, 0.82, 182.2, LocalDate.of(1005, 12, 20), "2387888890A", 200, "Madrid", 1.0, false, "87344535098", 0);
        Persona[] personas = {p1, p2, p3};
        Arrays.sort(personas, new PrefijoTelefonoComparator());
        System.out.println(Arrays.toString(personas));
    }

}
