package Boletin_posible_examen.Gestor_Contenido;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;

public class VisualizacionesComparator implements Comparator<Entry<Contenido, Set<Usuario>>> {

    @Override
    public int compare(Entry<Contenido, Set<Usuario>> o1, Entry<Contenido, Set<Usuario>> o2) {
        return Integer.compare(o2.getValue().size(), o1.getValue().size());
    }
}
