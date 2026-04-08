package alumnos;

public class AlumnoTest {
    public static void main(String[] args) {
        try {
            Alumno al1 = new Alumno("Juanma Lopez", 80, 8);
            Alumno al2 = new Alumno("Pepita Jimenez", 110, 1);
        } catch (DatosAlumnoInvalidosException e) {
            throw new RuntimeException(e);
        }
    }
}
