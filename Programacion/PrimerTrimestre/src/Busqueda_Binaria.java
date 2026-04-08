import java.util.Scanner;

public class Busqueda_Binaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Partiendo de un array de enteros ordenado, implemente un algoritmo de búsqueda binaria
        //utilizando la plantilla que se le proporciona. El funcionamiento de este algoritmo es el siguiente:
        //Aprovechando que el array se encuentra ordenado ascendentemente, la idea de la búsqueda
        //binaria es comprobar si el elemento que estamos buscando se encuentra en la posición central
        //del array (a diferencia de la búsqueda lineal, que comienza en la posición inicial). En caso de estar
        //ahí, hemos terminado. En caso de no estar ahí, puede estar en la primera mitad (los elementos a
        //la izquierda de la posición central) o en la segunda mitad (los elementos a la derecha de la
        //posición central):

        //- Si el número que estamos buscando tiene un valor inferior a lo que hay en la posición
        //central, entonces nos quedaremos con la primera mitad del array y repetiremos el
        //proceso con ella, descartando el resto. En este caso la nueva posición final sería la
        //posición central que hemos comprobado menos una unidad.

        //- Si el número que buscamos tiene un valor superior a lo que hay en la posición central,
        //entonces nos quedaremos con la segunda mitad del array y repetiremos el proceso con
        //ella, descartando el resto. En este caso la nueva posición inicial sería la posición central
        //que hemos comprobado más una unidad.

        //Recuerde que en todo momento debe tener declaradas tres variables: inicio (que apunta al
        //primer elemento de la parte del array que se está examinando), fin (que apunta al último
        //elemento de la parte del array que se está examinando) y central (que es el punto medio de los
        //dos anteriores).

//        int[] array = {1, 3, 3, 3, 4, 7, 9, 10, 12, 12, 16, 23};
//        System.out.println("Introduce el numero que quiere buscar: ");
//        int elemento = scan.nextInt();
//        int pos = -1;
//        int inicio = 0;
//        int fin = array.length - 1;
//        int centro = array.length/2;
//        //while (inicio<=fin){
//        while(fin != inicio || array[centro] == elemento){
//            if (array[centro] == elemento){
//                pos = centro;
//                break;
//            }else if (array[centro] > elemento){
//                fin = centro - 1;
//                centro = (fin + inicio)/2;
//            }else {
//                inicio = centro + 1;
//                centro = (fin + inicio)/2;
//            }
//        }
//        if (pos >= 0){
//            System.out.println("El numero " + elemento + " esta en la posicion " + pos + ".");
//        }else {
//            System.out.println("EL numero " + elemento + " no esta en el array.");
//        }

        int[] array = {1, 3, 3, 3, 4, 7, 9, 10, 12, 12, 16, 23, 25, 49};
        System.out.println("Introduce el numero que quiere buscar: ");
        int elemento = scan.nextInt();
        int posicion = busquedaBinaria(array, elemento);
        System.out.println(posicion);
    }
    public static int busquedaBinaria(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin)/2;

            if (arr[medio] == objetivo) {
                return medio; // encontrado
            }

            if (arr[medio] < objetivo) {
                inicio = medio + 1; // buscar en la mitad derecha
            } else {
                fin = medio - 1; // buscar en la mitad izquierda
            }
        }

        return -1;
    }
}
