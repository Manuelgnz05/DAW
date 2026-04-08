import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce la x: ");
        int x = scan.nextInt();
        System.out.print("Introduce la y: ");
        int y = scan.nextInt();

        int contador = 0;
        for(int i=0; i<=x; i++) {
            for(int j=0; j<=y; j++) {
                System.out.printf("(%d, %d)", i, j);
                contador++;
            }
            System.out.println();
        }
        System.out.println(contador);
    }
}
