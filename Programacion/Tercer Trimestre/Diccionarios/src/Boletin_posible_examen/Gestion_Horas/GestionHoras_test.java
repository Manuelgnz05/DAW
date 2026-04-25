package Boletin_posible_examen.Gestion_Horas;

import Boletin_posible_examen.Almacen_Inteligente.AlumnoException;
import Boletin_posible_examen.Almacen_Inteligente.GestionHoras;

import java.util.List;

public class GestionHoras_test {
    static void main() {
        GestionHoras gestor = new GestionHoras();
        String nia1 = "1";
        String nia2 = "2";
        System.out.println(gestor);
        gestor.registrarNota(nia1, 7.0);
        System.out.println(gestor);
        gestor.registrarNota(nia1, 4.0);
        System.out.println(gestor);
        gestor.registrarNota(nia2, 4.5);
        gestor.registrarNota(nia2, 4.5);
        System.out.println(gestor);
        try {
            System.out.println(gestor.obtenerPromedio(nia2));
        } catch (AlumnoException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(gestor.obtenerAlumnosConMediaSuperior(4.6));
            System.out.println(gestor.obtenerAlumnosConMediaSuperior(4.0));
            System.out.println(gestor.obtenerAlumnosConMediaSuperior(4.50001));
        } catch (AlumnoException e) {
            throw new RuntimeException(e);
        }

        try {
            gestor.limpiarExpedientesBajos();
        } catch (AlumnoException e) {
            throw new RuntimeException(e);
        }
        System.out.println(gestor);
        List<Double> notas = gestor.obtenerNotas(nia1);

    }
}
