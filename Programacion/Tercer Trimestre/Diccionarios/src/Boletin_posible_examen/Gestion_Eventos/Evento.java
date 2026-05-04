package Boletin_posible_examen.Gestion_Eventos;

import java.util.Objects;

public class Evento {

    private String nombreEvento;

    public Evento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombreEvento='" + nombreEvento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(nombreEvento, evento.nombreEvento);
    }

}
