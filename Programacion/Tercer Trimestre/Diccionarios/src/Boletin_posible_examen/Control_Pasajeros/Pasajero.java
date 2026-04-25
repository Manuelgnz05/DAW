package Boletin_posible_examen.Control_Pasajeros;

public class Pasajero {

    private String nombre;

    public Pasajero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
