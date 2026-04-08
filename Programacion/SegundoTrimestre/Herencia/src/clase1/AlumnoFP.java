package clase1;

public final class AlumnoFP extends Alumno{

    private String empresaPracticas;

    public AlumnoFP(String nombre, int edad) {
        super(nombre, edad);
    }

    public AlumnoFP(String nombre, int edad, int curso) {
        super(nombre, edad, curso);
    }

    public AlumnoFP(String nombre, int edad, int curso, String empresaPracticas) {
        super(nombre, edad, curso);
        this.empresaPracticas = empresaPracticas;
    }

    public String toString(){
        return super.toString() + empresaPracticas;
    }

}
