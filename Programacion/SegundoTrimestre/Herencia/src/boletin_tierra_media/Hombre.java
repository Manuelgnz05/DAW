package boletin_tierra_media;

/*
Ejercicio 4: los siguientes fueron los hombres mortales, raza hermana de los elfos y
enanos. Cree la clase Hombre y añádala a la jerarquía como estime conveniente. Los
hombres fueron bendecidos por el creador con el don de la mortalidad (muchas gracias,
máquina). Se caracterizan por tanto por el método morir, que no devuelve nada ni recibe
nada, e imprime por pantalla una frase indicando que el personaje muere. También saben
usar la espada.
 */

public class Hombre extends SerTierraMedia{

    public Hombre(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    public void morir(){
        System.out.println("Has muerto.");
    }

    public void usarEspada(String objetivo) throws AccionInvalidaException {
        System.out.println("Has usado la espada contra " + objetivo);
    }
}
