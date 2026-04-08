package ejercicio_examen;

import java.time.LocalDate;
import java.util.Arrays;

public final class Abuelo extends Padre{

    public Abuelo(String nombre, String apellido, LocalDate nacimiento, Genero sexo, Padre[] padres, Abuelo[] abuelos) throws DatoInvalidoException {
        super(nombre, apellido, nacimiento, sexo, padres, abuelos);
    }

    public void contar_batallitas(){
        System.out.println("Cuando yo era joven...");
    }

    @Override
    public String toString() {
        return "Abuelo{" +
                "padres=" + Arrays.toString(padres) +
                ", abuelos=" + Arrays.toString(abuelos) +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacimiento=" + nacimiento +
                ", sexo=" + sexo +
                '}';
    }
}
