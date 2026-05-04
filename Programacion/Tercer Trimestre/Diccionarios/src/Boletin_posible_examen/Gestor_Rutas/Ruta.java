package Boletin_posible_examen.Gestor_Rutas;

public class Ruta {

    private String nombre;

    public Ruta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
