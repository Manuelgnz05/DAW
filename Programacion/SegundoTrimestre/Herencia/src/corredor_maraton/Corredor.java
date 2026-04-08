package corredor_maraton;

import examen_recu.NumeroInvalidoException;

import java.time.LocalDate;

public final class Corredor {

    private String nombre;
    private String apellidos;
    private final String dni;
    private final LocalDate nacimiento;
    private float velocidadMax;
    private int dorsal;
    private float peso;
    private float altura;


    public Corredor(String dni) {
        this.dni = dni;
        this.nacimiento = LocalDate.of(1900, 1, 1);
    }

    public Corredor(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.nacimiento = LocalDate.of(1900, 1, 1);
    }

    public Corredor(String nombre, String apellidos, String dni, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.nacimiento = nacimiento;
    }

    public Corredor(String nombre, String apellidos, String dni, LocalDate nacimiento, float velocidadMax, int dorsal, float peso, float altura) throws DniIncorrectoException, NumeroInvalidoException, FechaInvalidaException {
        validarCadena(nombre);
        validarCadena(apellidos);
        validarDni(dni);
        validarFloat(velocidadMax);
        validarDorsal(dorsal);
        validarFloat(peso);
        validarFloat(altura);
        validarFecha(nacimiento);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.velocidadMax = velocidadMax;
        this.dorsal = dorsal;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public float getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(float velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad(){
        return  LocalDate.now().getYear() - nacimiento.getYear();
    }

    private void validarCadena(String cadena){
        if (cadena.isEmpty() || cadena.equals(null)){
            throw new NullPointerException();
        }
    }

    public void validarDni(String dni) {

        if(dni.length() != 9) {
            throw new IllegalArgumentException("El dni debe tener 9 caracteres");
        }

        if(!Character.isLetter(dni.charAt(8))) {
            throw new IllegalArgumentException("El dni debe acabar en letra");
        }

        int num = 0;
        try {
            num = Integer.parseInt(dni.substring(0, 8));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El dni debe contener un numero de 8 digitos");
        }

        int resto = num % 23;
        char letra = dni.charAt(8);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (!(letra == letras.charAt(resto))) {
            throw new IllegalArgumentException("El DNI introducido no es válido.");
        }

    }

    private void validarDorsal(int num) throws NumeroInvalidoException {
        if (num <= 0){
            throw new NumeroInvalidoException("El numero no puede ser ni 0 ni negativo");
        }
    }

    private void validarFloat(float num) throws NumeroInvalidoException {
        if (num <= 0){
            throw new NumeroInvalidoException("El numero no puede ser ni 0 ni negativo");
        }
    }

    private void validarFecha(LocalDate fecha) throws FechaInvalidaException {
        if (fecha.getDayOfMonth() > 31 || fecha.getDayOfMonth() < 1){
            throw new FechaInvalidaException("El dia del mes tiene que ser 28, 30 o 31.");
        }
        if (fecha.getMonthValue() > 12 || fecha.getMonthValue() < 1){
            throw new FechaInvalidaException("El mes tiene que estar entre 1 y 12");
        }
        if (fecha.getYear() < 1900 || fecha.getYear() > LocalDate.now().getYear()){
            throw new FechaInvalidaException("El mes tiene que estar entre 1 y 12");
        }
    }

}
