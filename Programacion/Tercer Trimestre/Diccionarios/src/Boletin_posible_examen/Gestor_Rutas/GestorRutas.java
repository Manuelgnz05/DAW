package Boletin_posible_examen.Gestor_Rutas;

import java.util.*;
import java.util.Map.Entry;

//EXAMEN – Ejercicio 2 (60 min)
//Sistema de rutas de transporte
//
//Se desea implementar una aplicación que gestione rutas de transporte entre distintas paradas.
//
//Cada ruta está formada por una secuencia de paradas, y diferentes rutas pueden compartir paradas.
//Requisitos
//
//
//Registrar rutas en el sistema.
//
//
//Asociar paradas a cada ruta.
//
//
//Permitir consultar todas las rutas que pasan por una parada concreta.
//
//
//Calcular el número de paradas de cada ruta.
//
//
//Obtener un listado de rutas ordenadas según su longitud.
//
//
//Mostrar las paradas que aparecen en más de una ruta.
//
//
//Evitar duplicidades de paradas según un criterio lógico.
//
//
//Consideraciones
//
//El alumno debe decidir cómo representar rutas y paradas.
//
//Se valorará la eficiencia en las consultas.
//
//Se espera el uso de mecanismos de ordenación.
//
//La igualdad entre paradas debe estar bien definida.
public class GestorRutas {

    private Map<Ruta, Set<Parada>> registro = new HashMap<>();
    private Set<Parada> paradas = new HashSet<>();

    public GestorRutas() {
    }

    public GestorRutas(Map<Ruta, Set<Parada>> registro) {
        this.registro = registro;
    }

    public void registrarRuta(Ruta ruta){
        registro.putIfAbsent(ruta, new HashSet<>());
    }

    public void registrarParadasRuta(Ruta ruta, Parada parada){
        registro.putIfAbsent(ruta, new HashSet<>());
        registro.get(ruta).add(parada);
        paradas.add(parada);
    }

    public List<Ruta> consultarRutasPorParadas(Parada parada){
        List<Ruta> res = new ArrayList<>();
        Set<Ruta> claves = registro.keySet();
        for (Ruta clave:claves){
            if (registro.get(clave).contains(parada)){
                res.add(clave);
            }
        }
        return res;
    }

    public int numParadasRuta(Ruta ruta){
        return registro.getOrDefault(ruta, new HashSet<>()).size();
    }

    public List<Ruta> rankingRutasLongitud(){
        List<Ruta> res = new ArrayList<>();
        List<Entry<Ruta, Set<Parada>>> claveValor = new ArrayList<>(registro.entrySet());
        claveValor.sort(new LongitudComparator());
        for (Entry<Ruta, Set<Parada>> tupla:claveValor){
            res.add(tupla.getKey());
        }
        return res;
    }

    public List<Parada> paradasMas1Ruta(){
        List<Parada> res = new ArrayList<>();
        Map<Parada, Integer> aux = vecesParadas();
        Set<Entry<Parada, Integer>> aux2 = aux.entrySet();
        for (Entry<Parada, Integer> tupla:aux2){
            if (tupla.getValue() > 1){
                res.add(tupla.getKey());
            }
        }
        return res;
    }

    private Map<Parada, Integer> vecesParadas(){
        Map<Parada, Integer> res = new HashMap<>();
        for (Parada p:paradas){
            res.put(p, contVecesParada(p));
        }
        return res;
    }

    private int contVecesParada(Parada parada){
        int res = 0;
        for (Set<Parada> valor:registro.values()){
            if (valor.contains(parada)){
                res++;
            }
        }
        return res;
    }

}
