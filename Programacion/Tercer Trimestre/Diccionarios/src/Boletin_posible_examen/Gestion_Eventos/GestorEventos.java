package Boletin_posible_examen.Gestion_Eventos;

//EXAMEN – Ejercicio 1 (60 min)
//Plataforma de eventos
//Se desea desarrollar una aplicación para gestionar eventos (conciertos, charlas, talleres, etc.) y la asistencia de personas a los mismos.
//
//Cada evento puede tener múltiples asistentes, y una persona puede asistir a varios eventos.
//Requisitos
//
//
//Registrar eventos en el sistema.
//
//
//Registrar personas asistentes a eventos.
//
//
//Evitar registros duplicados de personas según un criterio lógico.
//
//
//Permitir consultar cuántos eventos ha atendido cada persona.
//
//
//Obtener un listado de personas ordenadas según su nivel de participación.
//
//
//Mostrar los eventos que superen un determinado número de asistentes.
//
//
//Permitir comprobar si una persona está inscrita en un evento concreto.
//
//
//Consideraciones
//
//El diseño de las clases forma parte del ejercicio.
//
//El alumno debe decidir cómo representar la relación entre eventos y personas.
//
//Se valorará el uso adecuado de estructuras de datos.
//
//La definición de igualdad entre objetos es clave.

import Boletin_posible_examen.Gestor_Contenido.ParticipacionComparator;

import java.util.*;
import java.util.Map.Entry;

public class GestorEventos {

    private Map<Evento, Set<Asistente>> registro = new HashMap<>();
    private Set<Asistente> asistentes = new HashSet<>();

    public GestorEventos() {
    }

    public GestorEventos(Map<Evento, Set<Asistente>> registro) {
        this.registro = registro;
    }

    public void registrarEvento(Evento evento){
        registro.putIfAbsent(evento, new HashSet<>());
    }

    public void registrarPersonaEvento(Evento evento, Asistente asistente){
        registro.putIfAbsent(evento, new HashSet<>());
        registro.get(evento).add(asistente);
        asistentes.add(asistente);
    }

    public int numEventosPersona(Asistente asistente){
        int res = 0;
        Set<Entry<Evento, Set<Asistente>>> claveValor = registro.entrySet();
        for (Entry<Evento, Set<Asistente>> tupla:claveValor){
            if (tupla.getValue().contains(asistente)){
                res++;
            }
        }
        return res;
    }

    public List<Asistente> rankingParticipacion(){
        List<Asistente> res = new ArrayList<>();
        Map<Asistente, Integer> aux = new HashMap<>();
        for (Asistente persona:asistentes){
            aux.put(persona, numEventosPersona(persona));
        }
        List<Entry<Asistente, Integer>> ord = new ArrayList<>(aux.entrySet());
        ord.sort(new ParticipacionComparator());
        for (Entry<Asistente, Integer> entrada:ord){
            res.add(entrada.getKey());
        }
        return res;
    }

    public List<Evento> eventosSupUmbral(int umbral){
        List<Evento> res = new ArrayList<>();
        Set<Evento> claves = registro.keySet();
        for (Evento clave:claves){
            if (registro.get(clave).size()>umbral){
                res.add(clave);
            }
        }
        return res;
    }

    public boolean personaInscrita(Evento evento, Asistente asistente){
        return registro.get(evento).contains(asistente);
    }

}
