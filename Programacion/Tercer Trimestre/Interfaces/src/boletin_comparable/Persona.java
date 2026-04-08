package boletin_comparable;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private LocalDate fechaNacimiento;
    private String dni;
    private double sueldo;
    private String ciudad;
    private double notaMedia;
    private boolean activo;
    private String telefono;
    private int prioridad;

    public Persona(String nombre, int edad, double altura, double peso, LocalDate fechaNacimiento, String dni, double sueldo, String ciudad, double notaMedia, boolean activo, String telefono, int prioridad) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sueldo = sueldo;
        this.ciudad = ciudad;
        this.notaMedia = notaMedia;
        this.activo = activo;
        this.telefono = telefono;
        this.prioridad = new Random().nextInt(1, 101);
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /*
    Ejercicio 1 – Ordenar por edad (ascendente)
    Implementa Comparable para ordenar las personas por edad de menor a mayor.

    @Override
    public int compareTo(Persona otra) {
        return this.edad - otra.edad;
    }
     */

    //Ejercicio 2 – Ordenar por edad (descendente)
    //Ordena por edad de mayor a menor.
//    @Override
//    public int compareTo(Persona otra) {
//        return otra.edad - this.edad;
//    }

    //Ejercicio 3 – Ordenar por nombre alfabéticamente
    //Ordena por nombre en orden alfabético.
//    @Override
//    public int compareTo(Persona otra) {
//        return this.nombre.compareTo(otra.nombre);
//    }

    //Ejercicio 4 – Ordenar por nombre y en caso de empate
    //por edad
    //Criterio:
    //1. Primero por nombre
    //2. Si el nombre es igual, por edad

//    @Override
//    public int compareTo(Persona otra) {
//        int res = this.nombre.compareTo(otra.nombre);
//        if (res == 0){
//            res = this.edad - otra.edad;
//        }
//        return res;
//    }

    //Ejercicio 5 – Añadir atributo altura y ordenar por
    //altura
    //Añade:
    //private double altura;
    //Ordenar por altura de menor a mayor.

//    @Override
//    public int compareTo(Persona otra) {
//        return (int) ((this.altura - otra.altura)*100);
//    }

    //Ejercicio 6 – Añadir atributo peso y ordenar por IMC
    //Añade:
    //private double peso;
    //private double altura;
    //Ordenar por Índice de Masa Corporal (IMC)
    //IMC = peso / (altura * altura)
    //✔ Debes calcular dentro de compareTo.

//    @Override
//    public int compareTo(Persona otra) {
//        double imc1 = this.peso/(this.altura*this.altura);
//        double imc2 = otra.peso/(otra.altura*otra.altura);
//        return (int) (imc1 - imc2);
//    }

    //Ejercicio 7 – Añadir atributo fechaNacimiento y
    //ordenar por fecha
    //Añade:
    //private LocalDate fechaNacimiento;
    //Ordenar por fecha de nacimiento (más viejo primero).
    //✔ Debes usar compareTo de LocalDate.

//    @Override
//    public int compareTo(Persona otra) {
//        return this.fechaNacimiento.compareTo(otra.fechaNacimiento);
//    }

    //Ejercicio 8 – Añadir atributo DNI y ordenar por DNI
    //Añade:
    //private String dni;
    //Ordenar por DNI alfabéticamente.

//    @Override
//    public int compareTo(Persona otra) {
//        return this.dni.charAt(this.dni.length()-1) - otra.dni.charAt(otra.dni.length()-1);
//    }

    //Ejercicio 9 – Añadir atributo sueldo y ordenar por
    //sueldo descendente
    //Añade:
    //private double sueldo;
    //Ordenar por:
    //1. Mayor sueldo primero
    //2. En empate, menor edad primero

//    @Override
//    public int compareTo(Persona otra) {
//        int res = (int) (otra.sueldo - this.sueldo);
//        if (res == 0){
//            res = this.edad - otra.edad;
//        }
//        return res;
//    }

    //Ejercicio 10 – Orden complejo (nombre, edad, altura)
    //Añade:
    //private double altura;
    //Ordenar por:
    //1. Nombre alfabético
    //2. Edad ascendente
    //3. Altura descendente

//    @Override
//    public int compareTo(Persona otra) {
//       int res = this.nombre.compareTo(otra.nombre);
//       if (res == 0){
//           res = this.edad - otra.edad;
//           if (res == 0){
//               res = Double.compare(otra.altura, this.altura);
//           }
//       }
//       return res;
//    }

    //Ordenar por longitud del nombre, y si empatan, por edad.
    //Ejemplo:
    // Ana (3)
    // Luis (4)
    // Pedro (5)

    @Override
    public int compareTo(Persona otra) {
        int res = this.nombre.length() - otra.nombre.length();
        if (res == 0){
            res = this.edad - otra.edad;
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Double.compare(altura, persona.altura) == 0 && Double.compare(peso, persona.peso) == 0 && Double.compare(sueldo, persona.sueldo) == 0 && Objects.equals(nombre, persona.nombre) && Objects.equals(fechaNacimiento, persona.fechaNacimiento) && Objects.equals(dni, persona.dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", ciudad='" + ciudad + '\'' +
                ", notaMedia=" + notaMedia +
                ", activo=" + activo +
                ", telefono='" + telefono + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}