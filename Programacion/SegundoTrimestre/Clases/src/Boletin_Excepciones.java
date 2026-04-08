import java.util.InputMismatchException;
import java.util.Scanner;

public class Boletin_Excepciones {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //1. Realice un programa que lea por pantalla dos números enteros, e imprima el resultado de
        //dividirlos. Observe la excepción que se lanza al dividir por cero, y tras ello modifique su código
        //para que capture dicha excepción.

        try{
            System.out.println("Introduce el primer valor: ");
            int valor1 = scan.nextInt();
            System.out.println("Introduce el segundo valor: ");
            int valor2 = scan.nextInt();
            System.out.println(valor1/valor2);
        }catch (ArithmeticException ex){
            System.out.println("No se puede dividir por 0");
        }

        //2. Realice un programa que cree un array de 10 posiciones inicializado con números crecientes
        //a partir de 1. Escriba un bucle que vaya desde i=0 hasta i<=longitud y los imprima por pantalla. Observe
        //la excepción que se lanza, y tras ello modifique su código para que capture dicha excepción.

        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        try{
            for (int i = 0; i <= arrayInt.length; i++) {
                System.out.println(arrayInt[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("No hay tantos números en el array");
        }

        //3. Realice un programa que lea por pantalla un número entero mediante la clase Scanner y nextInt.
        //Observe la excepción que se lanza al introducir una palabra, y tras ello modifique su código
        //para que capture dicha excepción.

        try {
            System.out.println("Introduce un número: ");
            int num = scan.nextInt();
            System.out.println(num);
        }catch (InputMismatchException ex){
            System.out.println("No es el tipo de dato permitido");
        }

        //4. Realice un programa que lea por pantalla un número entero mediante la clase Scanner y nextLine.
        //Convierta el String a un número entero con la clase Integer y parseInt. Observe la excepción que se
        //lanza al introducir un número con decimales, y tras ello modifique su código para que capture dicha excepción.

        try {
            String entrada = scan.nextLine();
            int numero = Integer.parseInt(entrada);
            System.out.println(numero);
        }catch (NumberFormatException ex){
            System.out.println("EL formato del numero no es válido");
        }

        //5. Realice un programa  que lea por pantalla una cadena mediante la clase Scanner y nextLine. Imprima
        //mediante charAt y un bucle que vaya desde i=0 hasta i<=longitud todas las posiciones de la cadena.
        //Observe la excepción que se lanza y tras ello modifique su código para que capture
        //dicha excepción.

        try {
            System.out.println("Introduce una cadena: ");
            String cadena = scan.nextLine();
            for (int i = 0; i <= cadena.length(); i++) {
                System.out.println(cadena.charAt(i));
            }
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("La cadena no tiene tantas letras");
        }

        //6. Escriba un método que reciba un String y lo imprima por pantalla en mayúsculas. Pruebe a llamar al método
        //pasando como argumento el valor null, observe la excepción que se lanza y modifique el código para capturarla.

        try {
            String cad = null;
            System.out.println(enMayusculas(cad));
        }catch (NullPointerException ex){
            System.out.println("El argumento es null");
        }

        //7. Realice un único programa que implemente todo lo anterior, y capture todas las excepciones que se puedan lanzar.

        try{
            System.out.println("Introduce el primer valor: ");
            int valor1 = scan.nextInt();
            System.out.println("Introduce el segundo valor: ");
            int valor2 = scan.nextInt();
            System.out.println(valor1/valor2);

            for (int i = 0; i <= arrayInt.length; i++) {
                System.out.println(arrayInt[i]);
            }

            System.out.println("Introduce un número: ");
            int num = scan.nextInt();
            System.out.println(num);

            String entrada = scan.nextLine();
            int numero = Integer.parseInt(entrada);
            System.out.println(numero);

            System.out.println("Introduce una cadena: ");
            String cadena = scan.nextLine();
            for (int i = 0; i <= cadena.length(); i++) {
                System.out.println(cadena.charAt(i));
            }

            String cad = null;
            System.out.println(enMayusculas(cad));

        }catch (ArithmeticException ex){
            System.out.println("No se puede dividir por 0");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("No hay tantos números en el array");
        }catch (InputMismatchException ex){
            System.out.println("No es el tipo de dato permitido");
        }catch (NumberFormatException ex){
            System.out.println("EL formato del numero no es válido");
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("La cadena no tiene tantas letras");
        }catch (NullPointerException ex){
            System.out.println("El argumento es null");
        }

        //8. Realice un programa que lea dos nombres de usuario (dos cadenas que empiecen por una letra y tengan longitud
        //superior a 1). En caso de que alguno de los nombres de usuario no sea válido, lance usted una excepción
        //del tipo IllegalArgumentException proporcionando un mensaje de error.

        System.out.println("Introduce un nombre que empiecen por una letra y tengan longitud superior a 1: ");
        String nombre1 = scan.nextLine();
        System.out.println("Introduce un nombre que empiecen por una letra y tengan longitud superior a 1: ");
        String nombre2 = scan.nextLine();
        if(((!Character.isLetter(nombre1.charAt(0))) && !nombre1.isEmpty()) && ((!Character.isLetter(nombre2.charAt(0))) && !nombre2.isEmpty())){
            throw new IllegalArgumentException("Alguna de las dos cadenas no cumplen las condiciones");
        }

    }
    public static String enMayusculas(String cad){
        return cad.toUpperCase();
    }
}
