package examen_recu;

//Ejercicio 2:
//Crear un método estático que reciba un array de enteros y lo divida en dos arrays de
// igual tamaño o casi iguales (esto se explica más adelante). De los dos arrays generados,
// el método devolverá uno solo. El array que devolverá es especificado con un segundo argumento
//  junto al array de entrada. El otro array (que llamaremos 'descartado') será imprimido por
//  pantalla dentro del mismo metodo.
//
//Por ejemplo, si el array de entrada es [2,0,3,4,6,7] y el segundo argumento tiene
// el valor 1, el método lo dividirá en los arrays [2,0,3] y [4,6,7] pero devolverá
//  el [2,0,3], imprimiendo antes el descartado.
//
//Otro ejemplo, si el array de entrada es [3,4,7,9,8] y el segundo argumento tiene el
// valor 2, entonces el método lo dividirá en los arrays [3,4,7] y [9,8] pero devolverá
//  el [9,8], imprimiendo antes el descartado.
//
//Importante:
//
//Dependiendo de la cantidad de elementos que tenga el array de entrada:
//- los dos arrays en que se dividirá tendrán la misma cantidad de elementos.
//- o bien uno de los dos arrays en que se dividirá tendrá un elemento más que el otro.
// Elija para esto el que desee.
//- recuerde que el método estático debe imprimir por pantalla el array descartado
// antes de terminar.

import java.util.Arrays;

public class Ejercicio3 {

    public static int[] dividirArray(int[] arr, int num) throws NumeroInvalidoException {
        validarNumero(num);
        int[] arr1;
        int[] arr2;
        int cont = 0;
        if (arr.length%2 == 0){
            arr1 = new int[arr.length/2];
            arr2 = new int[arr.length/2];
        }else {
            arr1 = new int[arr.length/2 + 1];
            arr2 = new int[(arr.length/2)];
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = arr1.length; i < arr.length; i++, cont++) {
            arr2[cont] = arr[i];
        }

        if (num == 1){
            return arr1;
        }else {
            return arr2;
        }

    }

    private static void validarNumero(int num) throws NumeroInvalidoException {
        if (num != 1 && num != 2){
            throw new NumeroInvalidoException("El numero tiene que ser 1 o 2.");
        }
    }

    static void main() {
        int[] arrayB = {3,5,5,3,1,1,1,1};
        int[] res;
        try {
            res = dividirArray(arrayB, 2);
        } catch (NumeroInvalidoException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(res));
    }

}
