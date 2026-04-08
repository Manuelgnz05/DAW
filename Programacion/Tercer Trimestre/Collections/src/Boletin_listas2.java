import java.util.*;

public class Boletin_listas2 {

    //Boletín – Listas en Java (15 ejercicios)
    //✅ Ejercicio 1 – Suma de números
    //Crea un ArrayList<Integer> con varios números y calcula la suma total.

    public static void main(String[] args) {
//        List<Integer> numeros = new ArrayList<>();
//        numeros.add(4);
//        numeros.add(2);
//        numeros.add(7);
//        numeros.add(10);
//        numeros.add(43);
//        numeros.add(0);
//        numeros.add(9);
//        numeros.add(7);
//        int suma = 0;
//        for (int num : numeros) {
//            suma += num;
//        }
//        System.out.println(suma);
//
//
//        //✅ Ejercicio 2 – Número mayor
//        //Dada una lista de enteros, muestra el número mayor.
//
//        int mayor = 0;
//        for(int num:numeros){
//            if (num > mayor){
//                mayor = num;
//            }
//        }
//        System.out.println(mayor);
//
//        //✅ Ejercicio 3 – Contar repetidos
//        //Dada una lista de enteros, cuenta cuántas veces aparece un número dado.
//        //Ejemplo:
//        //Lista → [1,2,3,2,2,5]
//        //Número → 2
//        //Resultado → 3
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Introduce el número que quiere buscar: ");
//        int buscar = scan.nextInt();
//        int cont = 0;
//        for (int num:numeros){
//            if (num == buscar){
//                cont++;
//            }
//        }
//        System.out.println("El numero se repite " + cont + " veces.");
//
//        //✅ Ejercicio 4 – Eliminar repetidos
//        //Dada una lista, crea otra lista sin elementos repetidos.
//        //No usar Set.
//
//        List<Integer> sinRepetidos = new LinkedList<>();
//        for (int num:numeros){
//            if (!sinRepetidos.contains(num)){
//                sinRepetidos.add(num);
//            }
//        }
//        System.out.println(sinRepetidos);
//
//        //✅ Ejercicio 5 – Invertir lista
//        //Dada una lista, crea otra con los elementos en orden inverso.
//
//        List<Integer> inverso = new ArrayList<>();
//        for (int i = numeros.size() - 1; i >= 0; i--) {
//            inverso.add(numeros.get(i));
//        }
//        System.out.println(inverso);
//
//        //✅ Ejercicio 6 – Clase Persona y equals
//        //Crea una clase Persona con:
//        //nombre
//        //edad
//        //Sobrescribe equals para que dos personas sean iguales si tienen el mismo nombre.
//        //
//        //Crea una lista y comprueba si contiene una persona dada.
//
//        Persona p1 = new Persona("Pepe", 30);
//        Persona p2 = new Persona("Juan", 50);
//        Persona p3 = new Persona("Juan", 10);
//        List<Persona> listaPersonas = new ArrayList<>();
//        listaPersonas.add(p1);
//        listaPersonas.add(p2);
//        System.out.println(listaPersonas.contains(p3));
//
//        //✅ Ejercicio 7 – Buscar objeto con equals
//        //Con la clase Persona, pide un nombre por teclado y muestra si existe en la lista.
//
//        System.out.println("Introduce un nombre: ");
//        scan.nextLine();
//        String nombre = scan.nextLine();
//        Persona p4 = new Persona(nombre, 0);
//        System.out.println(listaPersonas.contains(p4));
//
//        //✅ Ejercicio 8 – Ordenar enteros con Comparable
//        //Crea una lista de enteros y ordénala usando tres criterios distintos.
//
//        numeros.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o1, o2);
//            }
//        });
//        System.out.println(numeros);
//
//        numeros.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o2, o1);
//            }
//        });
//        System.out.println(numeros);
//
//        numeros.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int valor1 = Math.abs(10 - o1);
//                int valor2 = Math.abs(10 - o2);
//                return Integer.compare(valor1, valor2);
//            }
//        });
//        System.out.println(numeros);

        //✅ Ejercicio 9 – Clase Producto con Comparable
        //Crear clase Producto:
        //nombre
        //precio
        //Implementar Comparable<Producto> para ordenar por precio.
        //Ordenar la lista.

//        Producto pr1 = new Producto("lapiz", 1.5f);
//        Producto pr2 = new Producto("goma", 0.5f);
//        Producto pr3 = new Producto("Boli", 2.20f);
//        List<Producto> listaProductos = new ArrayList<>();
//        listaProductos.add(pr1);
//        listaProductos.add(pr2);
//        listaProductos.add(pr3);
//        Collections.sort(listaProductos);
//        System.out.println(listaProductos);

        //✅ Ejercicio 10 – Comparable por nombre
        //Modificar Producto para ordenar por nombre en vez de precio.

        Producto pr1 = new Producto("lapiz", 1.5f);
        Producto pr2 = new Producto("goma", 0.5f);
        Producto pr3 = new Producto("Boli", 2.20f);
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(pr1);
        listaProductos.add(pr2);
        listaProductos.add(pr3);
        Collections.sort(listaProductos);
        System.out.println(listaProductos);

        //✅ Ejercicio 11 – Comparator por edad
        //Con la clase Persona, crear un Comparator para ordenar por edad.
        //Ordenar usando:

        

        //✅ Ejercicio 12 – Varios Comparator
        //Crear 2 comparadores para Persona:
        // Por nombre
        //
        // Por edad descendente
        //Ordenar la misma lista con ambos.


        //✅ Ejercicio 13 – Sublista básica
        //Dada una lista de enteros, obtener una sublista con los elementos desde la posición 2 a
        //la 5.
        //Mostrar la sublista.


        //✅ Ejercicio 14 – Ordenar solo una sublista
        //Dada una lista de enteros:
        //[5,9,1,8,3,7,2,6]
        //Ordenar solo los elementos desde la posición 2 hasta la 6 usando subList.
        //Mostrar la lista completa después.


        //✅ Ejercicio 15 – Objetos + sublista + Comparator (final)
        //Crear clase Alumno:
        //nombre
        //nota
        //Pasos:
        //1. Crear lista con varios alumnos
        //2. Obtener una sublista con los 5 primeros
        //3. Ordenar la sublista por nota usando Comparator
        //4. Mostrar la lista completa
        //5. Comprobar cómo afecta subList a la lista original
        //Pregunta final:
        //¿La sublista es una copia?


    }
}
