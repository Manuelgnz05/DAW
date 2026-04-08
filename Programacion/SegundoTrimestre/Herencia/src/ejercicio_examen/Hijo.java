package ejercicio_examen;

import java.sql.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Hijo extends Persona{

    protected Padre[] padres = new Padre[2];
    protected Abuelo[] abuelos = new Abuelo[4];

    public Hijo(String nombre, String apellido, LocalDate nacimiento, Genero sexo, Padre[] padres, Abuelo[] abuelos) throws DatoInvalidoException {
        super(nombre, apellido, nacimiento, sexo);
        this.padres = padres;
        this.abuelos = abuelos;
    }

    public void hacer_el_vago(){
        System.out.println("Mama quedan actimels.");
    }

    @Override
    public String toString() {
        return "Hijo{" +
                "padres=" + Arrays.toString(padres) +
                ", abuelos=" + Arrays.toString(abuelos) +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacimiento=" + nacimiento +
                ", sexo=" + sexo +
                '}';
    }
}
