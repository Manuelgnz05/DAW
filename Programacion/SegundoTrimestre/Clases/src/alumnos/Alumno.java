package alumnos;

public class Alumno {

    private String nombre;
    private int edad;
    private double notaMedia;

    public Alumno(){
        nombre = "DEFAULT-Name";
        edad = 0;
        notaMedia = 0;
    }

    public Alumno(String nombre, int edad, double notaMedia) throws DatosAlumnoInvalidosException {
        this();
        validarEdad(edad);
        validarNota(notaMedia);
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public void validarEdad(int edad) throws DatosAlumnoInvalidosException {
        if(edad <= 0){
            throw new DatosAlumnoInvalidosException();
        }
    }

    public void validarNota(double notaMedia) throws DatosAlumnoInvalidosException {
        if (notaMedia > 10 || notaMedia < 0){
            throw new DatosAlumnoInvalidosException();
        }
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    public boolean tieneAprobado(){
        return notaMedia >=5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatosAlumnoInvalidosException {
        validarEdad(edad);
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) throws DatosAlumnoInvalidosException {
        validarNota(notaMedia);
        this.notaMedia = notaMedia;
    }

    public boolean equals(Object obj){
        Alumno otro = (Alumno)obj;
        if (this.nombre.equals(otro.nombre) && this.edad == otro.edad && this.notaMedia == otro.notaMedia){
            return true;
        }
        return false;
    }

    public String toString(){
        return this.nombre + "," + this.edad + "," + this.notaMedia;
    }
}
