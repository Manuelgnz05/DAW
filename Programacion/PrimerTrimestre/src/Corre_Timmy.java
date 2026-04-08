import java.util.Scanner;

public class Corre_Timmy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // El pequeño Timmy ha perseguido a su hermana para arrebatarle su pompero, pero se ha
        //extraviado y ahora está atrapado en una mazmorra y debe escapar de ella lo antes posible. La
        //mazmorra está llena de peligros: test chungos, validadores offline, bucles anidados...un paso
        //en falso y adiós a Timmy. ¡Ten cuidado, Timmy!
        //
        //Implemente el juego teniendo en cuenta las siguientes normas:
        //- Siga la plantilla que se le proporciona en las imágenes, contiene algunas ‘pistas’ para
        //ayudarle a conseguir la solución correcta.
        //- El tablero de juego consiste en un rectángulo de 20x20 posiciones, numeradas del 0 al
        //19 en cada dimensión.
        //- Las trampas se marcan con *. El borde del rectángulo está lleno de trampas.
        //- Timmy parte de una posición de inicio T, la (1,1). El objetivo es que Timmy llegue a la
        //posición de fin H, la (18,18).
        //- Timmy debe evitar las trampas de los bordes, moviéndose a través de los distintos
        //espacios en blanco.
        //- Para moverse, debe leer por teclado. El jugador debe introducir N para moverse hacia
        //arriba, S para moverse hacia abajo, E para moverse a la derecha, u O para moverse a la
        //izquierda (Norte, Sur, Este y Oeste). Si el jugador introduce STOP, el juego acaba.
        //Cualquier otra entrada de teclado debe hacer que Timmy se mueva hacia la izquierda
        //(Oeste).
        //- Si Timmy se mueve hacia una trampa del borde, el juego acaba. Hemos perdido a
        //Timmy.
        //- Cuando Timmy consigue llegar a la posición de fin, el juego acaba. Timmy ha escapado.
        //- Puede usar todo lo visto en clase salvo arrays.

        boolean fin = false;
        boolean vida = true;
        int ipos = 1;
        int jpos = 1;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i == ipos && j == jpos){
                    System.out.print("T");
                }else if ((i == 0) || (i == 19) || (j == 0) || (j == 19)) {
                    System.out.print("*");
                }else if (i == 18 && j == 18) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        while(!fin && vida){
            System.out.println("Introduce direccion N, S, E, O: ");
            char direccion = scan.next().toUpperCase().charAt(0);
            if (direccion == 'N'){
                ipos--;
            } else if (direccion == 'S') {
                ipos++;
            } else if (direccion == 'E') {
                jpos++;
            } else if (direccion == 'O') {
                jpos--;
            }
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (i == ipos && j == jpos){
                        System.out.print("T");
                    } else if ((i == 0) || (i == 19) || (j == 0) || (j == 19)) {
                        System.out.print("*");
                    }else if (i == 18 && j == 18) {
                        System.out.print("H");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            if (ipos == 18 && jpos == 18){
                fin = true;
            }
            if ((ipos == 0)||(ipos == 19)||(jpos == 0)||(jpos == 19)){
                vida = false;
            }
        }

        if (!vida){
            System.out.println("Has perdido, Timmy ha muerto");
        }else {
            System.out.println("Has ganado, Timmy ha escapado");
        }

    }
}
