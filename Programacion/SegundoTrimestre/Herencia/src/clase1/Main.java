package clase1;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Manuel", 21);
        Alumno a1 = new Alumno("Samuel", 19, 1);
        Persona p2 = new Alumno("Samuel", 19, 1);
        Alumno alOriginal = (Alumno) p2;
    }
}
