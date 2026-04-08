import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Crea un programa en Java llamado MenuDoWhile.java que cumpla los siguientes requisitos:

1. Muestre un menú con las siguientes opciones:
===== MENÚ PRINCIPAL =====
1. Saludar
2. Calcular el cuadrado de un número
3. Mostrar un mensaje personalizado
4. Salir
===========================
Elige una opción:
2. Use un bucle do-while para que el menú se repita hasta que el usuario elija la opción 4
(Salir).
3. Utiliza la estructura switch para controlar las distintas opciones:
• Opción 1: Muestra el mensaje "¡Hola! Espero que estés teniendo un
gran día."
• Opción 2: Pide al usuario un número entero y muestra su cuadrado.
• Opción 3: Pide al usuario que escriba un mensaje y luego lo repite en pantalla.
• Opción 4: Muestra el mensaje "Saliendo del programa..." y finaliza.
• Cualquier otra opción: Muestra "Opción no válida, intenta de
nuevo."
         */

        int num;
        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Saludar");
            System.out.println("2. Calcular el cuadrado de un número");
            System.out.println("3. Mostrar un mensaje personalizado");
            System.out.println("4. Salir");
            System.out.println("===========================");
            System.out.println("Escoge un numero: ");
            num = scan.nextInt();
            switch (num){
                case 1:
                    System.out.println("¡Hola! Espero que estés teniendo un gran día.");
                    break;
                case 2:
                    System.out.println("Introduce un número: ");
                    int n = scan.nextInt();
                    int cuadrado = n*n;
                    System.out.println("El cuadrado de " + n + " es " + cuadrado + ".");
                    break;
                case 3:
                    System.out.println("Escribe el mensaje: ");
                    String mensaje = scan.nextLine();
                    mensaje = scan.nextLine();
                    System.out.println(mensaje);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
        } while(num != 4);


    }
}
