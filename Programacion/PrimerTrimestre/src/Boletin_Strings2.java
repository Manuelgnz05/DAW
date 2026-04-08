import java.util.Scanner;

public class Boletin_Strings2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Lee por pantalla una cadena de caracteres e imprime su longitud.

        System.out.println("Introduce de una cadena: ");
        String cadena = scan.nextLine();
        System.out.println("La longitud de la cadena es " + cadena.length());

        //2. Lee por pantalla una cadena de caracteres e imprime su primera letra.

        System.out.println("Introduce de una cadena: ");
        String cadena2 = scan.nextLine();
        System.out.println("Su primera letra es: " + cadena2.charAt(0));
        //System.out.println("Su primera letra es: " + cadena2.charAt(0) + " " + (int) cadena2.charAt(0));

        //3. Lee por pantalla una cadena de caracteres e imprime su última letra. Ten en cuenta
        //que la cadena introducida puede cambiar en cada ejecución.

        System.out.println("Introduce de una cadena: ");
        String cadena3 = scan.nextLine();
        System.out.println("Su ultima letra es: " + cadena3.charAt(cadena3.length()-1));
        //System.out.println("Su primera letra es: " + cadena3.charAt(cadena3.length()-1) + " " + (int) cadena3.charAt(cadena3.length()-1));

        //4. Lee por pantalla una cadena de caracteres e imprime la letra central o su
        //aproximada.

        System.out.println("Introduce de una cadena: ");
        String cadena4 = scan.nextLine();
        int mitad = cadena4.length()/2;
        System.out.println("La letra central es : " + mitad);
        //System.out.println("La letra central es : " + cadena4.charAt(mitad) + " " + ((int) cadena4.charAt(mitad)));

        //5. Repite los tres ejercicios anteriores imprimiendo junto a la letra su código
        //UNICODE, separados por un espacio.

        //6. Lee por pantalla una cadena de caracteres, y vuelve a imprimirla en mayúsculas.

        System.out.println("Introduce de una cadena: ");
        String cadena5 = scan.nextLine();
        System.out.println(cadena5.toUpperCase());

        //7. Lee por pantalla una cadena de caracteres, e imprímela en minúsculas.

        System.out.println("Introduce de una cadena: ");
        String cadena6 = scan.nextLine();
        System.out.println(cadena6.toLowerCase());

        //8. Lee por pantalla una cadena de caracteres y reemplaza todas las aes por espacios
        //en blanco.

        System.out.println("Introduce de una cadena: ");
        String cadena7 = scan.nextLine();
        cadena7 = cadena7.replace("a", " ");
        System.out.println(cadena7);

        //9. Lee por pantalla una cadena de caracteres y elimina todas las aes.

        System.out.println("Introduce de una cadena: ");
        String cadena8 = scan.nextLine();
        cadena8 = cadena8.replace("a", "");
        System.out.println(cadena8);

        //10. Lee por pantalla una cadena de caracteres y reemplaza las vocales por espacios
        //en blanco.

        System.out.println("Introduce de una cadena: ");
        String cadena9 = scan.nextLine();
        cadena9 = cadena9.replaceAll("aeiouAEIOU", " ");
        System.out.println(cadena9);

        //11. Lee por pantalla una cadena de caracteres y elimina todas las vocales.

        System.out.println("Introduce de una cadena: ");
        String cad = scan.nextLine();
        cad = cadena9.replaceAll("aeiouAEIOU", "");
        System.out.println(cad);

        //12. Lee por pantalla la cadena “Supermercado” y comprueba si tiene la letra m. Repite
        //introduciendo la misma cadena y comprueba si tiene la letra M.

        String cad2 = "Supermercado";
        for (int i = 0; i < cad2.length()-1; i++) {
            if(cad2.charAt(i) == 'm'){
                System.out.println("Contiene la m");
            }else {
                System.out.println("No contiene la m");
            }
        }
        for (int i = 0; i < cad2.length()-1; i++) {
            if(cad2.charAt(i) == 'M'){
                System.out.println("Contiene la M");
            }else {
                System.out.println("No contiene la M");
            }
        }

        //13. Lee por pantalla dos cadenas y compáralas. Debes imprimir ‘La primera va antes’,
        //‘La segunda va antes’ o ‘Son iguales’, dependiendo del resultado de la
        //comparación.

//        System.out.println("Introduce dos cadenas de caracteres: ");
//        String cad3 = scan.nextLine();
//        String cad4 = scan.nextLine();
//        int num = cad3.compareTo(cad4);
//        if(num<0){
//            System.out.println("La primera va antes");
//        } else if (num>0) {
//            System.out.println("La segunda va antes");
//        }else{
//            System.out.println("Son iguales");
//        }

        //14. Repite ignorando mayúsculas.

        System.out.println("Introduce dos cadenas de caracteres: ");
        String cad3 = scan.nextLine();
        String cad4 = scan.nextLine();
        int num = cad3.compareToIgnoreCase(cad4);
        if(num>0){
            System.out.println("La primera va antes");
        } else if (num<0) {
            System.out.println("La segunda va antes");
        }else{
            System.out.println("Son iguales");
        }

        //15. Lee por pantalla dos cadenas y comprueba si son iguales.

//        System.out.println("Introduce dos cadenas de caracteres: ");
//        String cad5 = scan.nextLine();
//        String cad6 = scan.nextLine();
//        boolean num2 = cad5.equals(cad6);
//        if(num2){
//            System.out.println("Son iguales");
//        }else{
//            System.out.println("No son iguales");
//        }

        //16. Repite ignorando mayúsculas.

        System.out.println("Introduce dos cadenas de caracteres: ");
        String cad5 = scan.nextLine();
        String cad6 = scan.nextLine();
        int num2 = cad5.compareToIgnoreCase(cad6);
        if(num2 == 0){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        //17. Lee un carácter por teclado y muestra por consola el código ASCII al que
        //pertenece. Por ejemplo: si introduzco una a, debe mostrar 97.

        System.out.println("Introduce un carcter: ");
        char caracter = scan.next().charAt(0);
        int ascii = caracter;
        System.out.println(ascii);

        //18. Lee una cadena de caracteres por teclado que represente un número de dos
        //cifras, e imprime por pantalla el carácter que representa.

        System.out.println("Introduce un numero de dos cifras: ");
        String cade = scan.nextLine();
        int num3 = Integer.parseInt(cade);
        char c = (char) num3;
        System.out.println("Representa el numero: " + c);

        //19. Escribe una aplicación con un String que contenga una contraseña inventada.
        //Después se pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes
        //ya no pedirá más la contraseña y mostrará un mensaje diciendo “Logged in”.
        //Cuando falle, debe imprimir ‘Prueba otra vez…’ y volver a leer por teclado. En el
        //tercer fallo, debe imprimir Error’ y el programa termina.

        String contrasena = "hola";
        int intentos = 3;
        String pasword;
        do{
            System.out.println("Introduce la contraseña, numero de intentos " + intentos);
            pasword = scan.nextLine();
            if(contrasena.equals(pasword)){
                System.out.println("Logged in");
            }else {
                System.out.println("Prueba otra vez…");
                intentos--;
            }
            if(intentos == 0){
                System.out.println("Error");
            }

        }while((!contrasena.equals(pasword)) && (intentos != 0));


        //20. Se pretende leer por pantalla una contraseña e indicarle al usuario si su seguridad
        //es fuerte, media o débil. Cree un algoritmo que lea una cadena e imprima por
        //pantalla su nivel de seguridad en base a los siguientes criterios:
        //- Si la longitud de la cadena es inferior a cinco, siempre es débil. Ejemplo: &quot;hola&quot;
        //es debil.
        //
        //- Si la longitud es superior o igual a cinco y solo tiene letras o solo tiene números,
        //es media. Ejemplo: &quot;holaholita&quot; o &quot;57213&quot;.
        //
        //- Si la longitud es superior o igual a cinco y tiene tanto letras como números, es
        //alta. Ejemplo: “adios365”
        //
        //Nota: puede usar todo lo aprendido sobre Java. Suponga que la cadena solo tiene
        //letras y números, nunca caracteres especiales.


    }
}
