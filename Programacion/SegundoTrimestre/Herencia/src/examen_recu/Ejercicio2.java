package examen_recu;

//Ejercicio 2: Crear un método estático que reciba dos arrays de enteros, y devuelva
//aquel cuya suma de elementos sea superior.
//
//Por ejemplo, para los arrays A=[8,0] y B=[1,1,1,1,1,1,1,1,5] el metodo devolveria el
//array B, puesto que la suma de sus elementos es mayor.
//
//Otro ejemplo, para los arrays A=[8,10] y B=[1,1,1,1,1,1,1,1,5] el metodo devolveria el
//array A, puesto que la suma de sus elementos es mayor.

import java.util.Arrays;

public class Ejercicio2 {

    public static int[] devuelveMayorArray(int[] arr1, int[] arr2){
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            suma1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            suma2 += arr2[i];
        }
        if (suma1 > suma2){
            return arr1;
        } else if (suma1 < suma2){
            return arr2;
        }else{
            return arr1;
        }
    }

    static void main() {
        int[] arrayA = {8,0};
        int[] arrayB = {1,1,1,1,1,1,1,1,5};
        int[] res = devuelveMayorArray(arrayA, arrayB);
        System.out.println(Arrays.toString(res));
    }
}

