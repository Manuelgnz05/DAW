import java.util.Scanner;

public class Booleanos {
    public static void main(String[] args) {
        //1. Lea por pantalla dos numeros enteros y almacene en una variable el resultado
        //de comprobar si el primero es superior al segundo multiplicado por dos.

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        boolean res = num>(num2*2);
        System.out.println("Es superior el primero al segundo multiplicado por dos: " + res);

        //2. Lea por pantalla una edad y almacene en una variable el resultado de comprobar
        //si es mayor de edad.
        System.out.println("Introduce una edad: ");
        int edad = scan.nextInt();
        boolean mayorEdad = edad>=18;
        System.out.println("¿Es mayor de edad? " + mayorEdad);

        //3. Repita pero comprobando si es menor de edad.

        boolean menorEdad = edad<18;
        System.out.println("¿Es menor de edad? " + menorEdad);

        //4. Lea por pantalla un numero entero y almacene en una variable el resultado
        //de comprobar si es par.

        System.out.println("Introduce un numero: ");
        int num3 = scan.nextInt();
        boolean esPar = num3%2 == 0;
        System.out.println("¿Es par?: " + esPar);

        //5. Repita pero comprobando si es impar.

        System.out.println("Introduce un numero: ");
        int num7 = scan.nextInt();
        boolean esImpar = num3%2 == 1;
        System.out.println("¿Es impar?: " + esImpar);

        //6. Lea por pantalla un numero y compruebe si está comprendido entre 0 y 100,
        //ambos incluidos.

        System.out.println("Introduce un numero: ");
        int num4 = scan.nextInt();
        boolean res2 = (num4<=100) && (num4>=0);
        System.out.println("Esta commprendido entre 0 y 100: " + res2);

        //7. Lea por pantalla un numero y compruebe si es positivo y además impar.

        System.out.println("Introduce un numero: ");
        int num5 = scan.nextInt();
        boolean res3 = (num5>=0) && (num5%2 == 1);
        System.out.println("Es positivo y impar: " + res3);

        //8. Lea por pantalla un numero entero y compruebe si es el 3, el 7 o el 9.

        System.out.println("Introduce un numero: ");
        int num6 = scan.nextInt();
        boolean res4 = (num6==3) || (num==7) || (num==9);
        System.out.println("Es el numero 3, 7, o 9: " + res4);

    }
}
