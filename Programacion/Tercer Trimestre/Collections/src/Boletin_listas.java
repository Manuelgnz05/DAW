import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Boletin_listas {

    //Ejercicio 1: ¿Qué diferencias hay entre un List y un ArrayList?

    //La diferencia es que List es una interfaz y ArrayList es una clase que implementa esa interfaz.

    //Ejercicio 2: ¿Y entre un objeto de tipo List y otro de tipo LinkedList?

    // List establece los metodos y LinkedList los implementa.

    //Ejercicio 3: ¿qué ventajas ofrece ArrayList sobre LinkedList? ¿Y LinkedList sobre
    //ArrayList?

    //La ventaja de ArrayList es que tiene velocidad de lectura al contrario que LinkedList
    //La ventaja de LinkedList es su velocidad a la hora de añadir o eliminar elementos al contrario que ArrayList

    //Ejercicio 4: va a implementar un sistema que controle el número de usuarios que
    //inician sesión en un juego online masivo. Por cada sala, debe crear una lista que
    //contenga los jugadores que están presente en dicha sala. Conforme los jugadores
    //entran, la lista se va haciendo más y más grande. Los jugadores también pueden salirse
    //de la sala en cualquier momento. Teniendo en cuenta que la longitud de la lista sufrirá
    //muchos cambios, puesto que habrá muchas operaciones de inserción y borrado, elija
    //que clase utilizará para crear una instancia de List: ArrayList o LinkedList. Razone y
    //argumente su elección.

    //Usaria LinkedList sin ninguna duda ya que al haber que añadir y eliminar usuarios constantemente
    //lo mas conveniente es LinkedList por su velocidad.

    //Ejercicio 5: desarrolle un programa demo que demuestre la utilidad de los métodos
    //más importantes de la interfaz List, utilizando una instancia de la clase ArrayList de la
    //siguiente forma:
    //List<Persona> listaPersonas = new ArrayList<>();;
    //Puede utilizar la clase Persona de boletines anteriores como objetos que almacenar y
    //borrar en la lista. Demuestre varias formas de iterar sobre la misma. Tras finalizar y
    //comprobar su demo, pruebe a sustituir la instancia de la clase ArrayList por la clase
    //LinkedList, de forma que la línea anterior quedaría así:
    //List<Persona> listaPersonas = new LinkedList<>();
    //¿El comportamiento de su demo cambia al cambiar la clase que implementa la interfaz
    //List? ¿Por qué? ¿Qué ventaja cree que aporta el uso de interfaces en programación?

    public static void main(String[] args) {

//        List<Persona> listaPersonas = new ArrayList<>();
//        Persona p2 = new Persona("12345678A", "Pepe", 30);
//        Persona p3 = new Persona("87654321B", "Maria", 25);
//        listaPersonas.add(p2);
//        listaPersonas.add(p3);
//        Persona p1 = new Persona("87654321B", "Maria", 25);
//        for (Persona p : listaPersonas) {
//            System.out.println(p);
//        }
//        listaPersonas.add(new Persona("11223344C", "Juan", 40));
//        listaPersonas.add(1, new Persona("55667788D", "Ana", 22));
//
//        for (int i = 0; i < listaPersonas.size(); i++) {
//            System.out.println("Índice " + i + ": " + listaPersonas.get(i));
//        }
//
//        Persona buscar = new Persona("12345678A", "Pepe", 30);
//        System.out.println(listaPersonas.contains(buscar));
//
//        System.out.println(listaPersonas.size());
//        System.out.println(listaPersonas);
//
//
//        List<Persona> listaPersonas2 = new LinkedList<>();
//        listaPersonas2.add(new Persona("12345678A", "Pepe", 30));
//        listaPersonas2.add(new Persona("87654321B", "Maria", 25));
//        for (Persona p : listaPersonas2) {
//            System.out.println(p);
//        }
//        listaPersonas2.add(new Persona("11223344C", "Juan", 40));
//        listaPersonas2.add(1, new Persona("55667788D", "Ana", 22));
//
//        for (int i = 0; i < listaPersonas2.size(); i++) {
//            System.out.println("Índice " + i + ": " + listaPersonas2.get(i));
//        }
//
//        System.out.println(listaPersonas2.contains(buscar));
//
//        System.out.println(listaPersonas2.size());
//        System.out.println(listaPersonas2);
//        System.out.println(listaPersonas.contains(p1));
//        System.out.println(p2);
//        System.out.println(p1);

        List<Persona> listaPersonas = new ArrayList<>();
        Persona p1 = new Persona("87654321B", "Maria", 25);
        Persona p2 = new Persona("12345678A", "Pepe", 30);
        Persona p3 = new Persona("87654321B", "Maria", 25);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        System.out.println(listaPersonas.contains(p1));
        System.out.println(p3);
        System.out.println(p1);
        System.out.println(p1.equals(p3));
        System.out.println(p1==p3);

        //No, el comportamiento no cambia.
        //Porque ambas clases, ArrayList y LinkedList, implementan la interfaz List.
        //Flexibilidad, polimorfismo, seguridad

        //Ejercicio 6: cree un programa que permita leer por pantalla los nombres de los
        //jugadores de fútbol favoritos de un usuario. El programa leerá nombres que el usuario
        //introducirá por teclado, uno a uno. En cuanto se lea la cadena “STOP” se dejarán de
        //leer nombres, y se imprimirán por pantalla en una misma línea y separados por comas
        //todos los nombres que se hayan introducido. ¿Es recomendable usar un array de String
        //para hacer este ejercicio? ¿Por qué?

//        Scanner scan = new Scanner(System.in);
//        List<String> jugadores = new LinkedList<>();
//        boolean parar = false;
//        do {
//            System.out.println("Introduce el nombre de un jugador: ");
//            String jugador = scan.nextLine();
//            if (!jugador.equalsIgnoreCase("STOP")) {
//                jugadores.add(jugador);
//            } else {
//                parar = true;
//                System.out.println(jugadores);
//            }
//        } while (!parar);
   }
    //No porque al estar añadiendo jugadores constantemente tendrias que crear un array nuevo por
    //cada jugador que añada por eso es mejor usar List.
}
