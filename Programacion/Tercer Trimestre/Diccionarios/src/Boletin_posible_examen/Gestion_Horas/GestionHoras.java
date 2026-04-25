package Boletin_posible_examen.Almacen_Inteligente;
//Ejercicio 1: Gestión de Expedientes Académicos
//Contexto: Una universidad necesita un sistema para gestionar las notas de los alumnos.
//Cada alumno está identificado por su NIA (Número de Identificación Alumnado),
//que es único.
//Requerimientos:
//Desarrolla una clase GestionNotas que por cada NIA almacene la lista de
//calificaciones que le corresponde. Implementa los siguientes métodos:
//1. registrarNota(String nia, Double nota): Si el alumno no existe, debe crearlo
//con una lista vacía y añadir la nota. Si ya existe, añade la nota a su lista.
//2. obtenerPromedio(String nia): Devuelve la media del alumno. Si el alumno no
//existe, lanza una excepción personalizada o devuelve 0.0.
//3. obtenerAlumnosConMediaSuperior(Double umbral): Devuelve un Set<String>
//con los NIAs de los alumnos cuya media sea estrictamente mayor al umbral
//proporcionado.
//4. limpiarExpedientesBajos(): Elimina del mapa a todos los alumnos cuyo promedio
//sea inferior a 5.0.

import java.util.*;
import java.util.Map.Entry;

public class GestionHoras {

    private Map<String, List<Double>> registro;

    public GestionHoras() {
        this.registro = new HashMap<>();
    }

    public GestionHoras(Map<String, List<Double>> registro) {
        this.registro = registro;
    }

    public void registrarNota(String nia, Double nota){
        List<Double> notas = registro.getOrDefault(nia, new ArrayList<>());
        notas.add(nota);
        registro.put(nia, notas);
    }

    public double obtenerPromedio(String nia) throws AlumnoException {
        if (registro.get(nia) == null){
            throw new AlumnoException("No existe ese alumno");
        }else {
            List<Double> notas = registro.get(nia);
            double res = 0;
            for (double nota:notas){
                res += nota;
            }
            res = res/notas.size();
            return res;
        }
    }

    public Set<String> obtenerAlumnosConMediaSuperior(Double umbral) throws AlumnoException {
        Set<String> alumnos = new HashSet<>();
        Set<Entry<String, List<Double>>> dic = registro.entrySet();
        for (Entry<String, List<Double>> tupla:dic){
            String alumno = tupla.getKey();
            if (obtenerPromedio(alumno) > umbral){
                alumnos.add(alumno);
            }
        }
        return alumnos;
    }

    public void limpiarExpedientesBajos() throws AlumnoException {
        Set<Entry<String, List<Double>>> dic = registro.entrySet();
        for (Entry<String, List<Double>> tupla:dic){
            String alumno = tupla.getKey();
            if (obtenerPromedio(alumno) < 5.0){
                registro.remove(alumno);
            }
        }
    }

    public List<Double> obtenerNotas(String nia){
        return registro.get(nia);
    }

    @Override
    public String toString() {
        return "GestionHoras{" +
                "registro=" + registro +
                '}';
    }
}
