package boletin_tierra_media;

/*
Ejercicio 6: finalmente llegaron los hobbits. Los sabios creen que esta raza proviene de los
humanos, puesto que en sus comienzos hablaban la lengua común y no tenían idioma
propio. Cree la clase Hobbit y añádala a la jerarquía como estime conveniente. Los hobbits
se caracterizan por dos cosas: fumar hierba para pipa y comer como si no hubiera mañana.
Saben disparar el arco, tirar piedras pero no usar la espada.
 */

public final class Hobbit extends Hombre{

    public Hobbit(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    public void fumarHierba(){
        System.out.println("Has fumado hierba para pipa.");
    }

    public void comer(){
        System.out.println("Te has comido una vaca entera.");
    }

    public void dispararArco(String objetivo){
        System.out.println("Has disparado una flecha a " + objetivo);
    }

    public void tirarPiedra(String objetivo){
        System.out.println("Has tirado una piedra a " + objetivo);
    }

    @Override
    public void usarEspada(String objetivo) throws AccionInvalidaException {
        throw new AccionInvalidaException("No puedes hacer esta acción.");
    }
}
