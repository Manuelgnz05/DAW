package Boletin_posible_examen.Gestion_Eventos;

import java.util.Objects;

public class Asistente {

    private String nombre;

    public Asistente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asistente asistente = (Asistente) o;
        return Objects.equals(nombre, asistente.nombre);
    }

    @Override
    public String toString() {
        return "Asistente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
