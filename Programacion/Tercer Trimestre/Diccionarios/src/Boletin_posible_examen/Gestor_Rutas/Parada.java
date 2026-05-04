package Boletin_posible_examen.Gestor_Rutas;

public class Parada {

    private String nombreParada;

    public Parada(String nombreParada) {
        this.nombreParada = nombreParada;
    }

    public String getNombreParada() {
        return nombreParada;
    }

    public void setNombreParada(String nombreParada) {
        this.nombreParada = nombreParada;
    }

    @Override
    public String toString() {
        return "Parada{" +
                "nombreParada='" + nombreParada + '\'' +
                '}';
    }
}
