package Boletin_posible_examen.Gestion_Eventos;

import java.util.List;

public class GestorEventos_test {
    static void main() {

        GestorEventos plataforma = new GestorEventos();

        // 1. Creamos algunos eventos
        Evento e1 = new Evento("Concierto Rock");
        Evento e2 = new Evento("Taller Java");
        Evento e3 = new Evento("Charla IA");

        plataforma.registrarEvento(e1);
        plataforma.registrarEvento(e2);
        plataforma.registrarEvento(e3);

        // 2. Creamos algunos asistentes
        Asistente a1 = new Asistente("Ana");
        Asistente a2 = new Asistente("Pepito");
        Asistente a3 = new Asistente("Juan");

        // 3. Registramos personas en eventos
        plataforma.registrarPersonaEvento(e1, a1); // Ana a Concierto
        plataforma.registrarPersonaEvento(e2, a1); // Ana a Taller
        plataforma.registrarPersonaEvento(e3, a1); // Ana a Charla (Total: 3)

        plataforma.registrarPersonaEvento(e1, a2); // Pepito a Concierto
        plataforma.registrarPersonaEvento(e2, a2); // Pepito a Taller (Total: 2)

        plataforma.registrarPersonaEvento(e1, a3); // Juan a Concierto (Total: 1)

        // 4. Probar evitar duplicados (Ana no debería contarse dos veces en el Concierto)
        plataforma.registrarPersonaEvento(e1, a1);

        System.out.println("--- PRUEBAS DE CONSULTA ---");

        // Consultar eventos de una persona
        System.out.println("Ana ha asistido a: " + plataforma.numEventosPersona(a1) + " eventos (Esperado: 3)");
        System.out.println("Juan ha asistido a: " + plataforma.numEventosPersona(a3) + " eventos (Esperado: 1)");

        // Consultar si está inscrita
        System.out.println("¿Está Juan en el Taller? " + plataforma.personaInscrita(e2, a3)); // False
        System.out.println("¿Está Ana en la Charla? " + plataforma.personaInscrita(e3, a1)); // True

        // Eventos que superan umbral (más de 2 asistentes -> solo el Concierto)
        System.out.println("\nEventos con más de 2 asistentes:");
        List<Evento> populares = plataforma.eventosSupUmbral(2);
        for(Evento e : populares) {
            System.out.println("- " + e);
        }

        // Ranking de participación
        System.out.println("\nRanking de participación (de más a menos):");
        List<Asistente> ranking = plataforma.rankingParticipacion();
        for(Asistente a : ranking) {
            System.out.println(a.getNombre() + " asistió a " + plataforma.numEventosPersona(a) + " eventos");
        }
    }
}
