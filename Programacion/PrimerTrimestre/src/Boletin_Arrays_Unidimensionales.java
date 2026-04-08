import java.util.Random;
import java.util.Scanner;

public class Boletin_Arrays_Unidimensionales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1. Crear un array de float de tamaño 10 mediante un inicializador (dando valores
        //iniciales a su gusto). Imprimir el contenido del array por consola. Una vez impreso,
        //modificar el array para que en cada posición se almacene el índice que le
        //corresponde. Una vez que el array esté completamente modificado, volver a imprimir
        //el array y comprobar que ha hecho el ejercicio de forma correcta. Siga las
        //instrucciones al pie de la letra (siempre).

//        float[] arrayFloat = {3.7f, 34.3f, 54.0f, 22.45f, 32.532f, 325.35f, 0.3f, 0.123f, 547.324f, 235.2f};
//        for (int i = 0; i < arrayFloat.length; i++) {
//            float v = arrayFloat[i];
//            System.out.println(v);
//        }
//        for (int i = 0; i < arrayFloat.length; i++) {
//            System.out.println(arrayFloat[i] = i);
//        }

        //2. Modificar el ejercicio anterior de forma que el array sea de String.

//        String[] arrayString = {"3.7", "34.3", "54.0", "22.45", "32.532", "325.35", "0.3", "0.123", "547.324", "235.2"};
//        for (int i = 0; i < arrayString.length; i++) {
//            String v = arrayString[i];
//            System.out.println(v);
//        }
//        for (int i = 0; i < arrayString.length; i++) {
//            System.out.println(arrayString[i] = "" + i);
//        }

        //3. Modificar el ejercicio anterior de forma que el array sea de char (utilice únicamente
        //números de una cifra en el inicializador).

//        char[] arrayChar = {3, 3, 5, 2, 3, 3, 0, 0, 5, 2};
//        for (int i = 0; i < arrayFloat.length; i++) {
//            float v = arrayChar[i];
//            System.out.println(v);
//        }
//        for (int i = 0; i < arrayFloat.length; i++) {
//            arrayChar[i] = (char) i;
//            System.out.println(arrayChar[i]);
//        }

        //4. 1 Leer por teclado el tamaño de un array (suponemos >= 0) y crearlo. 2 Rellenar con
        //el patrón repetitivo {0, 1, 2, 3, 4}. 3 Imprimir el array.

//        System.out.println("Introduce el tamaño del array: ");
//        int tamano = scan.nextInt();
//        int[] arrayInt = new int[tamano];
//
//        for (int i = 0; i < arrayInt.length; i++) {
//            arrayInt[i] = i;
//            System.out.println(arrayInt[i]);
//        }

        //5. Escribe un programa que cree un array de 5 posiciones e imprima el valor de cada
        //posición. Elija el tipo que desee y los valores iniciales que desee.

//        float[] arrFloat = new float[5];
//        for (int i = 0; i < arrFloat.length; i++) {
//            System.out.println(arrFloat[i]);
//        }

        //6. Modifica el ejercicio anterior para que, a continuación, pida por pantalla 5 nuevos
        //valores y rellene el array con ellos, volviéndolo a imprimir.

//        System.out.println("Introduce 5 numeros: ");
//        int[] arrInt = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
//
//        for (int i = 0; i < arrInt.length; i++) {
//            int i1 = arrInt[i];
//            System.out.println(i1);
//        }

        //7. Modifica el programa anterior para que el número de posiciones del array se lea por
        //pantalla.

//        System.out.println("Introduce el tamaño del array: ");
//        int[] arrInt = new int[scan.nextInt()];
//        for (int i = 0; i < arrInt.length; i++) {
//            System.out.println("Introduce un numero: ");
//            arrInt[i] = scan.nextInt();
//        }
//        for (int i = 0; i < arrInt.length; i++) {
//            System.out.print(arrInt[i] + " ");
//
//        }

        //8. Si eligió un tipo numérico para el ejercicio anterior, repítalo usando un tipo no
        //numérico (boolean, char o String). Si eligió un tipo no numérico, repítalo usando
        //float.

//        System.out.println("Introduce el tamaño del array: ");
//        String[] arrString = new String[scan.nextInt()];
//        for (int i = 0; i < arrString.length; i++) {
//            System.out.println("Introduce una palabra: ");
//            arrString[i] = scan.next();
//        }
//        for (int i = 0; i < arrString.length; i++) {
//            System.out.print(arrString[i] + " ");
//
//        }

        //9. Crear un array de enteros donde indicamos por teclado el tamaño del array,
        //rellenamos el array con números aleatorios entre 0 y 9, y mostramos por pantalla el
        //valor de cada posición y la suma de todos los valores.

//        System.out.println("Introduce el tamaño del array: ");
//        int[] arrString = new int[scan.nextInt()];
//        int suma = 0;
//        Random random = new Random();
//        for (int i = 0; i < arrString.length; i++) {
//            int num = random.nextInt(10);
//            arrString[i] = num;
//        }
//        for (int i = 0; i < arrString.length; i++) {
//            System.out.print(arrString[i] + " ");
//
//        }
//        for (int i = 0; i < arrString.length; i++) {
//            suma += arrString[i];
//        }
//        System.out.println("\nLa suma de todos es:  " + suma);

        //10. Crea un array de números de 100 posiciones, que contendrá los números del 1 al
        //100. Partiendo del array ya creado y completamente relleno, obtener la suma de
        //todos ellos y la media.

//        int[] aInt = new int[100];
//        int sum = 0;
//        for (int i = 0; i < aInt.length; i++) {
//            aInt[i] = i+1;
//        }
//        for (int i = 0; i < aInt.length; i++) {
//            sum += aInt[i];
//        }
//        int avg = sum/aInt.length;
//
//        System.out.println("La suma de todos los numero es:  " + sum + " y la media es:  " + avg);

        //11. Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las
        //mayúsculas). Después, ve pidiendo posiciones del array por teclado y si la posición
        //es correcta, se añadirá a una cadena inicialmente vacía que se mostrará al final del
        //ejercicio. Se dejará de pedir números cuando se introduzca un número negativo.
        //Por ejemplo, si escribo los siguientes números
        //0 // Añadirá la ‘A’
        //5 // Añadirá la ‘F’
        //25 // Añadirá la ‘Z’
        //
        //50 // Error, inserte otro número
        //-1 // fin
        //Cadena resultante: AFZ

//        int[] intArr = new int[26];
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = 65 + i;
//        }
//
//        char[] arrChar = new char[intArr.length];
//        for (int i = 0; i < intArr.length; i++) {
//            arrChar[i] = ((char)intArr[i]);
//        }
//
//        int letra;
//        String cadena = "";
//        do {
//            System.out.println("Introduce un numero entre el 0 y el 25: ");
//            letra = scan.nextInt();
//            if (letra>25){
//                System.out.println("Error, inserte otro número");
//            } else if (letra<=25 && letra>=0) {
//                cadena += arrChar[letra];
//            } else if (letra<0) {
//                System.out.println("Fin");
//            }
//
//        }while(letra>=0);
//        System.out.println("Cadena resultante: " + cadena);

        //12. Crear un array de String de tamaño 3, con los nombres de tres compañeros de
        //clase. A continuación, pedir por teclado un nombre, y comprobar si está en el array,
        //escribiendo un mensaje al respecto de tipo: Juan esta en el array.

//        String[] arrString = {"Marcos", "Samuel", "Alejandro"};
//        System.out.println("Introduce un nombre: ");
//        String nombre = scan.nextLine();
//        boolean esta = false;
//        for (int i = 0; i < arrString.length; i++) {
//            if (arrString[i].equalsIgnoreCase(nombre)) {
//                esta = true;
//            }
//        }
//        if (esta) {
//            System.out.println(nombre + " esta en el array");
//        } else {
//            System.out.println(nombre + " no esta en el array");
//        }

        //13. Repetir escribiendo un mensaje de tipo: Juan esta en el array en la posición 2.

//        String[] arrString = {"Marcos", "Samuel", "Alejandro"};
//        System.out.println("Introduce un nombre: ");
//        String nombre = scan.nextLine();
//        boolean esta = false;
//        int pos = 0;
//        for (int i = 0; i < arrString.length; i++) {
//            if (arrString[i].equalsIgnoreCase(nombre)) {
//                esta = true;
//                pos = i;
//            }
//        }
//        if (esta) {
//            System.out.println(nombre + " esta en el array en la posicion " + pos);
//        } else {
//            System.out.println(nombre + " no esta en el array");
//        }

        //14. Leer por pantalla un numero entero y crear un array de ese tamaño, con valores
        //aleatorios entre 1 y 300. A continuación, pedir un número entero entre 0 y 9, e
        //imprimir todas las posiciones del array que tengan un número acabado en ese dígito.
        //Esos números, además de imprimirlos, almacenarlos en un array de salida con el
        //tamaño adecuado.

//        System.out.println("Introduce un numero: ");
//        int[] arrInt = new int[scan.nextInt()];
//
//        Random random = new Random();
//        for (int i = 0; i < arrInt.length; i++) {
//            arrInt[i] = random.nextInt(300) + 1;
//        }
//
//        int num;
//        do {
//            System.out.println("Introduce un numero entre 0 y 9: ");
//            num = scan.nextInt();
//            if (num>9 || num<0){
//                System.out.println("Error, introduce otro numero: ");
//            }
//        }while(num>9 || num<0);
//
//        int cont = 0;
//        for (int i = 0; i < arrInt.length; i++) {
//            if (arrInt[i]%10 == num){
//                System.out.println(i);
//                cont++;
//            }
//        }
//
//        int[] arrayInt = new int[cont];
//        int contador = 0;
//        for (int i = 0; i < arrInt.length; i++) {
//            if (arrInt[i]%10 == num){
//                arrayInt[contador] = i;
//                contador++;
//            }
//        }
//

        //15. Crear dos arrays de enteros del mismo tamaño (4). Inicializarlos con números
        //aleatorios de una cifra. Comparar si el contenido de ambos es exactamente el
        //mismo, imprimiendo un mensaje al respecto.

//        int[] arrInt = new int[4];
//        int[] arrayInt = new int[4];
//        Random random = new Random();
//        for (int i = 0; i < arrInt.length; i++) {
//            arrInt[i] = random.nextInt(10);
//        }
//        for (int i = 0; i < arrayInt.length; i++) {
//            arrayInt[i] = random.nextInt(10);
//        }
//
//        boolean distintos = false;
//        for (int i = 0; i < arrayInt.length; i++) {
//            if (arrInt[i] != arrayInt[i]){
//                System.out.println("Son distintos");
//                distintos = true;
//                break;
//            }
//        }
//        if (!distintos){
//            System.out.println("Son iguales");
//        }

        //16. Repetir el ejercicio anterior, sumando ambos arrays y guardando el resultado en un
        //tercer array que deberá imprimirse por pantalla.

//        int[] arrInt = new int[4];
//        int[] arrayInt = new int[4];
//        int[] suma = new int[arrayInt.length];
//        Random random = new Random();
//        for (int i = 0; i < arrInt.length; i++) {
//            arrInt[i] = random.nextInt(10);
//        }
//        for (int i = 0; i < arrayInt.length; i++) {
//            arrayInt[i] = random.nextInt(10);
//        }
//
//        for (int i = 0; i < arrayInt.length; i++) {
//            suma[i] = arrayInt[i] + arrInt[i];
//        }
//
//        for (int i = 0; i < suma.length; i++) {
//            System.out.print(suma[i] + " ");
//
//        }

        //17. Crear un array de enteros de 5 posiciones. Leer por pantalla una cadena y
        //almacenar en cada posición del array el número de ocurrencias de cada vocal: en la
        //posición 0 la cantidad de a, en la 1 la de e, y así sucesivamente, mostrando al final
        //el contenido del array.

//        int[] vocales = new int[5];
//        System.out.print("Introduce una cadena: ");
//        String cadena = scan.nextLine();
//
//        cadena = cadena.toLowerCase();
//
//        for (int i = 0; i < cadena.length(); i++) {
//            char c = cadena.charAt(i);
//
//            switch (c) {
//                case 'a':
//                    vocales[0]++;
//                    break;
//                case 'e':
//                    vocales[1]++;
//                    break;
//                case 'i':
//                    vocales[2]++;
//                    break;
//                case 'o':
//                    vocales[3]++;
//                    break;
//                case 'u':
//                    vocales[4]++;
//                    break;
//                default:
//                    break;
//            }
//        }
//        for (int i = 0; i < vocales.length; i++) {
//            System.out.println(vocales[i]);
//        }

        //18. Repetir, pero contando todas las letras del abecedario.

//        int[] letras = new int[26];
//
//        System.out.print("Introduce una cadena: ");
//        String cadena2 = scan.nextLine();
//        cadena2 = cadena2.toLowerCase();
//
//        for (int i = 0; i < cadena2.length(); i++) {
//            char c = cadena2.charAt(i);
//            if ((int)c >= (int)'a' && (int)c <= (int)'z') {
//                int indice = (int)c - (int)'a';
//                letras[indice]++;
//            }
//        }
//        for (int i = 0; i < letras.length; i++) {
//            System.out.println(letras[i]);
//        }

        //19. Leer una cadena que contenga varias palabras separadas por espacios. Buscar
        //información del método split de la clase String, y utilizarlo para dividir la cadena en
        //las distintas palabras.

//        System.out.print("Introduce una frase con varias palabras: ");
//        String frase = scan.nextLine();
//        String[] palabras = frase.split("//s+");
//
//        for (int i = 0; i < palabras.length; i++) {
//            System.out.println(palabras[i]);
//        }

        //20. Introduce por pantalla el número de tu DNI, y vuelve a imprimirlo seguido de la letra.
        //Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado
        //debe estar entre 0 y 22. Tendrás que crear un array que contenga:

//        char[] letrasDni = {'T','R','W','A','G','M','Y','F','P','D','X', 'B','N','J','Z','S','Q','V','H','L','C','K','E'};
//
//        System.out.print("Introduce el número de tu DNI (sin letra): ");
//        int numeroDni = scan.nextInt();
//        int resto = numeroDni % 23;
//        char letra = letrasDni[resto];
//        System.out.println("Tu DNI completo es: " + numeroDni + letra);

    }
}
