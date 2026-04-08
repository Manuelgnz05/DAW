package boletin_tierra_media;

/*
Ejercicio 2: los elfos fueron los primeros en llegar, de entre todas las razas conocidas. Cree
la clase Elfo y añádala a la jerarquía como estime conveniente. Los elfos se caracterizan
porque pueden disparar con el arco (dispararArco) y hacer encantamientos (encantar).
Éstos métodos no devuelven nada, y reciben una cadena con el objetivo al que se quiere
disparar y el objetivo que se quiere encantar.
 */

public class Elfo extends SerTierraMedia{

    public Elfo(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    public void dispararArco(String objetivo){
        System.out.println("Has disparado una flecha a " + objetivo);
    }

    public void encantar(String objetivo){
        System.out.println("Has encantado a " + objetivo);
    }
}
