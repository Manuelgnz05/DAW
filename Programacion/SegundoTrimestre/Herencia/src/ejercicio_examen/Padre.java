package ejercicio_examen;

import java.time.LocalDate;
import java.util.Arrays;

public class Padre extends Hijo{

    public Padre(String nombre, String apellido, LocalDate nacimiento, Genero sexo, Padre[] padres, Abuelo[] abuelos) throws DatoInvalidoException {
        super(nombre, apellido, nacimiento, sexo, padres, abuelos);
    }

    public void sermon(){
        System.out.println("Yo a tu edad ya esta casao y divorciao 3 veces.");
    }

    @Override
    public String toString() {
        return "Padre{" +
                "padres=" + Arrays.toString(padres) +
                ", abuelos=" + Arrays.toString(abuelos) +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacimiento=" + nacimiento +
                ", sexo=" + sexo +
                '}';
    }
}
