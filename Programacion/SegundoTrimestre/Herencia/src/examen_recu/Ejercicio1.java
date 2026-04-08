package examen_recu;

//En el método Main, leer un entero n con la clase Scanner
//(suponga que el usuario siempre introduce un número mayor que cero). A
//continuación, crear un array 1D de números
//enteros que tenga tamaño n + 1, y llenarlos
//con los números 0^4, 1^4, 2^4, 3^4, …,
//n^4. Es decir, llenarlo con la sucesión de números elevados a 4,
//desde el 0 hasta n. Cuando el array esté
//lleno, vuelva a recorrerlo con otro bucle distinto e imprímalo por
//pantalla. Nota: un número elevado a 4 quiere
//decir que se multiplica por sí mismo 4 veces.

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un entero: ");
        int num = scan.nextInt();
        int[] arrNum = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            arrNum[i] = (int) Math.pow(i, 4);
        }
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println(arrNum[i]);
        }
    }
}
