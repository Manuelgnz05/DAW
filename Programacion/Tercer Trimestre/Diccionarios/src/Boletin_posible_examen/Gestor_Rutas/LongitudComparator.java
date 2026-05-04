package Boletin_posible_examen.Gestor_Rutas;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class LongitudComparator implements Comparator<Map.Entry<Ruta, Set<Parada>>> {

    @Override
    public int compare(Map.Entry<Ruta, Set<Parada>> o1, Map.Entry<Ruta, Set<Parada>> o2) {
        return Integer.compare(o2.getValue().size(), o1.getValue().size());
    }

}
