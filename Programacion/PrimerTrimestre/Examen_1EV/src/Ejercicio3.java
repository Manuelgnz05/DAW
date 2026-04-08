import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //En un casino se quiere implementar un juego de apuestas (en euros) como el de la figura.
        // La forma de operación es la siguiente:

        //- Debe leer por teclado el saldo inicial del jugador. Puede suponer que el saldo leído
        //será superior a cero.

        //- Cada ronda o turno tendrá lugar si el jugador
        //tiene saldo positivo. Si eso se cumple, comienza la
        //ronda.

        //- Al comienzo de cada ronda debe generar un número aleatorio entre 1 y 9,
        //que será el número que el jugador intentará adivinar.

        //- Tras lo anterior, debe leer la cantidad de dinero que el jugador quiere
        //apostar, teniendo en cuenta lo siguiente: si el jugador quiere apostar 0€
        //(cero €), la ronda acaba, no habrá más rondas y el juego termina. En caso
        //contrario el número que lea será la cantidad que apueste el jugador
        //(suponga que el jugador no meterá nunca números negativos ni apostará
        //una cantidad superior a su saldo total), y se le restará a su saldo.

        //- Tras lo anterior, debe leer un único número (y sólo uno), que representa el
        //tipo de apuesta del jugador: apuesta por los negros, apuesta por los rojos, o
        //apuesta por un número en concreto. Si el número leído es inferior a 1
        //supondremos que apuesta por los negros, si es superior a 9 supondremos
        //que apuesta por los rojos, y si está entre 1 y 9 ambos inclusive supondremos
        //que apuesta por ese número en concreto.

        //- Ahora debe comprobar si la apuesta del jugador ha tenido éxito.

        //• Si el número del jugador coincide con el número aleatorio, el jugador gana
        //el triple de lo que apostó, y debe actualizar su saldo.

        //• Si apostó por los negros y el número aleatorio es alguno de los negros
        //(1,3,6 u 8) el jugador gana el doble de lo que apostó, y debe actualizar su
        //saldo.

        //• Si apostó por los rojos y el número aleatorio es alguno de los rojos (2, 4, 5,
        //7 o 9) el jugador gana el doble de lo que apostó, y debe actualizar su saldo.
        //Cuando el juego termine, debe imprimir el saldo final y FIN DEL EJERCICIO 3.

        System.out.println("Introduce su dinero: ");
        float dinero = scan.nextFloat();
        float dinero_apuesta;
        int apuesta;
        String color;
        do{
            int result = new Random().nextInt(1, 10);
            System.out.println("Introduce el dinero que quiere apostar: ");
            dinero_apuesta = scan.nextFloat();
            if(dinero_apuesta>0){
                dinero = dinero-dinero_apuesta;
            }else {
                System.out.println("Acabando juego...");
                break;
            }
            System.out.println("Introduce un numero para la apuesta: " +
                    "\nSi el número es menor que 1: apuesta por negros." +
                    "\nSi el número es mayor que 9: apuesta por rojos." +
                    "\nSi el número esta entre 1 y 9 apuesta por el número.");
            apuesta = scan.nextInt();
            if (apuesta<1){
                if(result == 1 || result == 3 || result == 6 || result == 8){
                    dinero += (dinero_apuesta*3);
                }
            } else if (apuesta>9) {
                if(result == 2 || result == 4 || result == 5 || result == 7 || result == 9){
                    dinero += (dinero_apuesta*3);
                }
            }else{
                if (result == apuesta){
                    dinero += (dinero_apuesta*3);
                }
            }
            if(result == 2 || result == 4 || result == 5 || result == 7 || result == 9){
                color = "Rojo";
            }else {
                color = "Negro";
            }
            System.out.println("Has apostado " + dinero_apuesta);
            System.out.println("Ha salido el número: " + result);
            System.out.println("Ha salido el color: " + color);
            System.out.println("Te quedan " + dinero);

        }while(dinero>0);
        System.out.println("FIN DEL EJERCICIO 3");

    }
}
