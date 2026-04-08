package boletin_tierra_media;

/*
Ejercicio 5: los orcos fueron creados a partir de los elfos, mediante técnicas de tortura y
corrupción. Cree la clase Orco y añádala a la jerarquía como estime conveniente. Los orcos,
además de disparar con arco y hacer encantamientos, saben envenenar flechas.
Implemente dicho método como los anteriores.
 */

public final class Orco extends Elfo{

    public Orco(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    public void envenenarFlecha(){
        System.out.println("Has envenenado una flecha.");
    }

}
