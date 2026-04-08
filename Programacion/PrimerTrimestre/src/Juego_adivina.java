import java.util.Random;
import java.util.Scanner;

public class Juego_adivina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int numero = random.nextInt(101);
        int contador = 0;
        int n;
        do {
            System.out.println("Introduce un numero entre 0 y 100: ");
            n = scan.nextInt();
            if(numero < n){
                System.out.println("Es menor");
                contador += 1;
            } else if (numero > n) {
                System.out.println("Es mayor");
                contador += 1;
            }else{
                System.out.println("CORRECTO");
                contador += 1;
                if(contador < 8){
                    System.out.println("Felicidades");
                    System.out.println("Lo has intentado " + contador);
                }else {
                    System.out.println("Estas fuera de la media");
                    System.out.println("Lo has intentado " + contador);
                }
            }
        }while(numero != n);
    }
}
