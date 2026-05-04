package Boletin_posible_examen.Gestor_Rutas;

import java.util.List;

public class GestorRutas_test {
    static void main() {

        GestorRutas gestor = new GestorRutas();

        // 1. Creamos las paradas
        Parada p1 = new Parada("Plaza Mayor");
        Parada p2 = new Parada("Puerta del Sol");
        Parada p3 = new Parada("Atocha");
        Parada p4 = new Parada("Retiro");

        // 2. Creamos las rutas
        Ruta r1 = new Ruta("Línea Roja");
        Ruta r2 = new Ruta("Línea Azul");
        Ruta r3 = new Ruta("Línea Verde");

        // 3. Asociamos paradas a rutas
        // Línea Roja tiene 3 paradas
        gestor.registrarParadasRuta(r1, p1);
        gestor.registrarParadasRuta(r1, p2);
        gestor.registrarParadasRuta(r1, p3);

        // Línea Azul tiene 2 paradas (comparte Atocha)
        gestor.registrarParadasRuta(r2, p3);
        gestor.registrarParadasRuta(r2, p4);

        // Línea Verde tiene 1 parada (comparte Puerta del Sol)
        gestor.registrarParadasRuta(r3, p2);

        System.out.println("--- PRUEBAS DE GESTIÓN DE RUTAS ---");

        // Consultar rutas por parada específica (Atocha p3 está en Roja y Azul)
        System.out.println("Rutas que pasan por Atocha:");
        List<Ruta> rutasAtocha = gestor.consultarRutasPorParadas(p3);
        for (Ruta r : rutasAtocha) System.out.println("- " + r.getNombre());

        // Calcular número de paradas
        System.out.println("\nNúmero de paradas de la Línea Roja: " + gestor.numParadasRuta(r1)); // Esperado: 3

        // Ranking de rutas por longitud (Roja > Azul > Verde)
        System.out.println("\nRanking de rutas (más largas primero):");
        List<Ruta> ranking = gestor.rankingRutasLongitud();
        for (Ruta r : ranking) {
            System.out.println("- " + r.getNombre() + " (" + gestor.numParadasRuta(r) + " paradas)");
        }

        // Paradas en más de una ruta (Atocha y Puerta del Sol)
        System.out.println("\nParadas que aparecen en más de una ruta:");
        List<Parada> repetidas = gestor.paradasMas1Ruta();
        for (Parada p : repetidas) {
            System.out.println("- " + p.getNombreParada());
        }

    }
}
