package Boletin_posible_examen.Gestor_Contenido;

import Boletin_posible_examen.Gestion_Eventos.Asistente;

import java.util.Comparator;
import java.util.Map;

public class ParticipacionComparator implements Comparator<Map.Entry<Asistente, Integer>> {

    @Override
    public int compare(Map.Entry<Asistente, Integer> o1, Map.Entry<Asistente, Integer> o2) {
        return Integer.compare(o2.getValue(), o1.getValue());
    }
}
