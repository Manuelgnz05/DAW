import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Java no permite leer un único carácter char con Scanner, por lo que en este
        //ejercicio intentará abordar dicho problema de la siguiente forma:

        //- Leerá por teclado un número entero, y comprobará si dicho número está
        //comprendido en alguno de los dos siguientes rangos: de 65 a 90 (ambos
        //inclusive) o de 97 a 122 (ambos inclusive).

        //- En caso de que el número leído esté dentro de alguno de esos dos rangos,
        //el número leído puede ser convertido a un char, puesto que el número 65
        //representa al carácter ‘A’, el 90 al carácter ‘Z’, el 97 al carácter ‘a’ y el 122 al
        //carácter ‘z’. Por tanto imprimirá por consola el carácter que representa al
        //número que ha leído.

        //- El proceso anterior se repite hasta el momento en que se lea un número
        //que no esté dentro de los rangos comentados. En ese caso, el proceso
        //terminará y no se volverá a pedir ningún otro número, y se imprimirá por
        //pantalla el mensaje “FIN DEL EJERCICIO 1”.

        int num;
        do{
            System.out.println("Introduce un numero: ");
            num = scan.nextInt();
            if((num>=65 && num<=90) || (num>=97 && num<=122)){
                char c = (char)num;
                System.out.println("El caracter es: " + c);
            }
        }while((num>=65 && num<=90) || (num>=97 && num<=122));
        System.out.println("FIN DEL EJERCICIO 1");

    }
}
