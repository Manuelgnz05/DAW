import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones_clase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int var1 = 6;
            int var2 = 1;
            System.out.println("holi");
            int valor = var1 / var2;
            float valorFloat = scan.nextFloat();
            System.out.println("Division hecha");
        } catch(ArithmeticException ex) {
            System.out.println(ex);
        } catch(InputMismatchException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Me ejecuto siempre, soy el amigo pesao");
        }

        System.out.println("Por aqui seguimos ejecutando");

//        metodoFake();

    }

    public static void metodoFake() throws Exception{
        throw new Exception("Excepción fake");
    }
}
