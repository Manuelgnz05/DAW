import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Crea dos numeros enteros y almacene en una variable el resultado
        de comprobar si el primero es superior al segundo multiplicado por dos.
         */
       int v1 = 8;
       int v2 = 5;
       boolean r = v1>(v2*2);
       System.out.println(r);

       /*
        Cree una variable edad y almacene en una variable el resultado de comprobar
        si es mayor de edad.
         */
       int edad = 20;
       boolean mayorEdad = edad>=18;
        System.out.println(mayorEdad);

          /*
        Cree una variable edad y almacene en una variable el resultado de comprobar
        si es menor de edad.
         */
        boolean menorEdad = edad<18;
        System.out.println(menorEdad);

        /*
        Almacenar un numero entero y almacenar en otra variable el resultado
        de comprobar si es par.
         */
        int num = 4;
        boolean esPar = num%2 == 0;
        System.out.println(esPar);

          /*
        Almacenar un numero entero y almacenar en otra variable el resultado
        de comprobar si es impar.
         */
        boolean esImpar = num%2 != 0;
        System.out.println(esImpar);


        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un entero: ");
        int entero = scan.nextInt();
        System.out.println("El valor leido es " + entero);

        System.out.print("Introduce otro entero: ");
        System.out.println("El otro valor leido es " + scan.nextInt());

    }
}