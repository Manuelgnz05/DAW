package clase1;

public class Alumno extends Persona{

    private int curso;

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    public Alumno(String nombre, int edad, int curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public void imprimirEdad(){
        System.out.println(edad);
    }

    @Override
    public void andar(){
        System.out.println("Soy muy cool...");
    }

    @Override
    public String toString() {
        return "Alumno[" + nombre + ", " + edad + ", " + curso + "]";
    }
}
