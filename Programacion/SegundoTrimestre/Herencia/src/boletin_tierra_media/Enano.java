package boletin_tierra_media;

/*
Ejercicio 3: los siguientes fueron los enanos, raza hermana de los elfos. Cree la clase
Enano y añádala a la jerarquía como estime conveniente. Los enanos se caracterizan
porque pueden golpear con el hacha (usarHacha) y hacer armaduras (crearArmadura).
Éstos métodos no devuelven nada, y reciben una cadena.
 */

public final class Enano extends SerTierraMedia{
    public Enano(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    public void usarHacha(String objetivo){
        System.out.println("Has golpeado con el hacha a " + objetivo);
    }

    public void crearArmadura(String objetivo){
        System.out.println("Le has creado una armadura a " + objetivo);
    }

}
