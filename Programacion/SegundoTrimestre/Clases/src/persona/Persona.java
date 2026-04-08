package persona;

//Ejercicio 9: PersonaClase Persona
//Atributos privados:
//String nombre
//String dni
//int edad
//Validaciones:
//El DNI debe tener 8 números y una letra.
//La edad debe ser mayor o igual que 0.
//Excepción: PersonaInvalidaException
//toString(): Formato obligatorio:"NOMBRE (DNI) - edad: EDAD años"
//
//Ejemplo:Laura Gómez (12345678Z) - edad: 32 años
//equals(Object o)
//Dos personas son iguales si:
//Tienen el
// (alternativamente) mismo nombre misma edad

public class Persona {

    private String nombre;
    private String dni;
    private int edad;

    public Persona(){
        this.nombre = "DEFAULT-Name";
        this.dni = "DEFAULT-DNI";
        this.edad = 0;
    }

    public Persona(String nombre, String dni, int edad) throws PersonaInvalidaException {
        this();
        validarNombre(nombre);
        validarDni(dni);
        validarEdad(edad);
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    private void validarNombre(String nombre) throws PersonaInvalidaException {
        if (nombre == null || nombre.isEmpty()) {
            throw new PersonaInvalidaException("El nombre no puede ser nulo ni estar vacio");
        }
    }

    private void validarDni(String dni) throws PersonaInvalidaException {
        if (!(dni.matches("^[0-9]{8}[A-Z]$"))){
            throw new PersonaInvalidaException("El DNI tiene que seguir este formato: 12345678Z");
        }
    }

    private void validarEdad(int edad) throws PersonaInvalidaException {
        if (edad < 0) {
            throw new PersonaInvalidaException("La edad no puede ser negativa");
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) throws PersonaInvalidaException {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws PersonaInvalidaException {
        validarDni(dni);
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws PersonaInvalidaException {
        validarEdad(edad);
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ") - edad: " + edad + " años";
    }

    public boolean equals(Object obj){
        Persona otro = (Persona) obj;
        return this.dni.equals(otro.dni) || (this.nombre.equals(otro.nombre) && this.edad == otro.edad);
    }
}
