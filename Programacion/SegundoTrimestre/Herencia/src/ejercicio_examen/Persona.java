package ejercicio_examen;

import java.time.LocalDate;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected LocalDate nacimiento;
    protected Genero sexo;

    private Persona(){
        this.nombre = "DEFAULT-NAME";
        this.apellido = "DEFAULT-SURNAME";
        this.nacimiento = LocalDate.of(1970, 1, 1);
        this.sexo = Genero.MASCULINO;
    }

    public Persona(String nombre, String apellido, LocalDate nacimiento, Genero sexo) throws DatoInvalidoException {
        this();
        validarNombre(nombre);
        validarApellido(apellido);
        validarNacimiento(nacimiento);
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws DatoInvalidoException {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws DatoInvalidoException {
        validarApellido(apellido);
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) throws DatoInvalidoException {
        validarNacimiento(nacimiento);
        this.nacimiento = nacimiento;
    }

    public Genero getSexo() {
        return sexo;
    }

    public void setSexo(Genero sexo) {
        this.sexo = sexo;
    }


    public boolean equals(Object o){
        Persona obj = (Persona) o;
        return nombre.equals(obj.nombre) && apellido.equals(obj.apellido) && nacimiento.equals(obj.nacimiento);
    }

    private void validarNombre(String nombre) throws DatoInvalidoException {
        if (nombre.isEmpty() || nombre == null){
            throw new DatoInvalidoException("El nombre no puede estar vacío ni ser null.");
        }
    }

    private void validarApellido(String apellido) throws DatoInvalidoException {
        if (apellido.isEmpty() || apellido == null){
            throw new DatoInvalidoException("El apellido no puede estar vacío ni ser null.");
        }
    }

    private void validarNacimiento(LocalDate nacimiento) throws DatoInvalidoException {
        if (nacimiento == null){
            throw new DatoInvalidoException("La fecha de nacimiento no puede ser null.");
        }
    }

}
