import java.util.ArrayList;
import java.util.Collection;

public class Boletin_Collections {
    public static void main(String[] args) {
        //1. Crear una nueva colección sin especificar el tipo de elementos que va a
        //almacenar:
        //Collection coleccion = new ArrayList();
        //Introducir los siguientes tipos de elementos y en el siguiente orden:
        //Un String con el valor “Primero”, un Integer con el valor 2, un Float con el valor
        //3, un Double con el valor 4, un Character con la primera letra de tu nombre, un
        //Boolean con el valor false, y finalmente un array de 10 enteros del 0 al 9.
        //Imprimir por pantalla la colección anterior sin usar bucles, es decir, imprima
        //solo su referencia. ¿Se ve la referencia al usar println?

        Collection coleccion = new ArrayList();
        coleccion.add("Primero");
        coleccion.add(2);
        coleccion.add(3f);
        Double dou = 4.0;
        coleccion.add(dou);
        coleccion.add('M');
        coleccion.add(false);
        int[] enteros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        coleccion.add(enteros);
        System.out.println(coleccion);
        //No

        //2. Crear una nueva colección que acepte únicamente Strings:
        //Collection;String; coleccion = new ArrayList&lt;&gt;();
        //Llenarla con diez nombres e imprimirla por pantalla sin usar bucles.

        Collection<String> colec = new ArrayList<>();
        colec.add("Manuel");
        colec.add("Manel");
        colec.add("Manuel");
        colec.add("Manuel");
        colec.add("Manuel");
        colec.add("Manel");
        colec.add("Manuel");
        colec.add("Manuel");
        colec.add("Manuel");
        colec.add("Manuel");
        System.out.println(colec);

        //3. Pedir a un compañero su colección de nombres (copie en su código las
        //instrucciones de su compañero necesarias, o cree una nueva usando esos
        //nombres) y utilizarla llamando al método retainAll sobre su propia colección.
        //Imprima por pantalla la colección resultante. ¿Qué utilidad tiene retainAll?

        Collection<String> coleccion2 = new ArrayList<>();
        coleccion2.add("Marcos");
        coleccion2.add("Manel");
        coleccion2.add("Ocaña");
        coleccion2.add("Sammy");
        coleccion2.add("Juan");
        coleccion2.add("Pepe");
        coleccion2.add("Felipe");
        coleccion2.add("Angel");
        coleccion2.add("Sebastian");
        coleccion2.add("Pedro");
        colec.retainAll(coleccion2);
        System.out.println(colec);
        //mantener únicamente los elementos de una colección
        //que también están contenidos en otra colección especificada

        //4. Repita el ejercicio anterior con el método removeAll, y explique qué utilidad
        //tiene.

        colec.removeAll(coleccion2);
        System.out.println(colec);
        //Los que tienen en comun los borra

        //5. Repita el ejercicio con el método containsAll, y explique qué utilidad tiene.
        colec.containsAll(coleccion2);
        System.out.println(colec);
        //Devuelve true si todos los elementos de coleccion2 estan en colec y false si no lo estan

        //6. Obtener un array de la colección del ejercicio 3, recorrerlo e imprimir por
        //pantalla cada elemento, seguido del índice donde se encuentra. Tras la
        //impresión de cada elemento, borre dicho elemento de la colección. Finalice el
        //ejercicio imprimiendo la colección.

        String[] array = coleccion2.toArray(new String[0]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " + array[i]);
            coleccion2.remove(array[i]);
        }
        System.out.println(coleccion2);

        //7. Imprima el resultado de llamar al método isEmpty sobre la colección del
        //ejercicio anterior.

        System.out.println(coleccion2.isEmpty());

        //8. Imprima el resultado de llamar al método size sobre la colección del ejercicio
        //anterior.

        System.out.println(coleccion2.size());

    }
}
