import java.util.Scanner;

public class Boletin_Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        //1. Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
//        //por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
//
//        String nombre = "Manuel";
//        System.out.println("Bienvenido " + nombre);
//
//        //2. Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.
//
//        System.out.println("Introduce tu nombre: ");
//        String name = scan.nextLine();
//        System.out.println("Bienvenido " + name);
//
//        //3. Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
//        //se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá
//        //más la contraseña y mostrará un mensaje diciendo “Enhorabuena”. Piensa bien en la
//        //condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
//
//        String contrasena = "hola";
//        int intentos = 3;
//        String pasword;
//        do{
//            System.out.println("Introduce la contraseña, numero de intentos " + intentos);
//            pasword = scan.nextLine();
//            if(contrasena.equals(pasword)){
//                System.out.println("Enhorabuena");
//            }else {
//                intentos--;
//            }
//            if(intentos == 0){
//                System.out.println("Numero de intentos completados");
//            }
//
//        }while((!contrasena.equals(pasword)) && (intentos != 0));

        //4. Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuántas vocales hay en
        //total (recorre el String con un bucle y charAt).

        String cad = "La lluvia en Sevilla es una maravilla";
//        int vocales = 0;
//        for(int contador = 0;contador<cad.length();contador++){
//            if((cad.charAt(contador) == 'a') || (cad.charAt(contador) == 'e') || (cad.charAt(contador) == 'i') || (cad.charAt(contador) == 'o') || (cad.charAt(contador) == 'u')){
//                vocales++;
//            }
//            if(contador==(cad.length()-1)){
//                System.out.println("Hay un total de " + vocales + " vocales");
//            }
//
//        }


        //5. Reemplaza todas las a del String anterior por una e.

        String nueva = cad.replace("a", "e");
        System.out.println(nueva);

        //6. Dada una cadena mostrar por pantalla la cantidad de vocales que tiene. Ejemplo:
        //Entrada: cad = "Hola tu";
        //Salida: La cantidad de vocales es 3

//        System.out.println("Introduce una cadena de caracteres: ");
//        String cadena = scan.nextLine();
//        int vocales = 0;
//        for(int contador = 0;contador<cadena.length();contador++){
//            if((cad.charAt(contador) == 'a') || (cad.charAt(contador) == 'e') || (cad.charAt(contador) == 'i') || (cad.charAt(contador) == 'o') || (cad.charAt(contador) == 'u')){
//                vocales++;
//            }
//            if(contador==(cad.length()-1)){
//                System.out.println("Hay un total de " + vocales + " vocales");
//            }
//
//        }


        //7. Dada una cadena invertir la misma y mostrar por pantalla. Ejemplo:
        //Entrada: casa blanca;
        //Salida: acnalb asac;

        System.out.println("Introduce una cadena de caracteres: ");
        String cade = scan.nextLine();
        String salida = "";
        for(int contador = cade.length()-1;contador>=0;contador--){
            salida += cade.charAt(contador);
        }
        System.out.println(salida);

        //8. Dada una cadena cad, y un carácter car, verificar cuántas veces se repite el carácter car
        //en la cadena cad, por ejemplo:
        //Entrada: cad = casa blanca, car = a;
        //Salida: El carácter a se repite 4 veces

        String caden = "casa blanca";
        char car = 'a';
        int cont = 0;
        for(int contador = 0;contador<caden.length();contador++){
            if(caden.charAt(contador) == car){
                cont++;
            }
            if(contador==(caden.length()-1)){
                System.out.println("Hay un total de " + cont + " vocales");
            }

        }

        //9. Lee un número por teclado y muestra por consola el carácter al que pertenece en la
        //tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.

        System.out.println("Introduce un numero: ");
        int ascii = scan.nextInt();
        char resul = (char) ascii;
        System.out.println("El numero " + ascii + " en la tabla ASCII es " + resul);

        //10. Modifica el ejercicio anterior para que, en lugar de pedir un número, pida un carácter y
        //muestre su código en la tabla ASCII.

        System.out.println("Introduce un caracter: ");
        char caracter = scan.next().charAt(0);
        int result = caracter;
        System.out.println("El caracter introducido es el numero " + result + " en el codigo ASCII.");

        //11. Recorre un String y transforma cada carácter a su código ASCII. Muéstralos en línea
        //recta, separados por un espacio entre cada carácter.

        System.out.println("Introduce una cadena: ");
        String cadena = scan.nextLine();
        for(int contador = 0; contador<=cadena.length()-1;contador++){
            System.out.print((int) cadena.charAt(contador) + " ");
        }
        
        //12. Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int,
        //pero se leerán como String y luego se convertirán) y un signo aritmético (String), según
        //este último se realizará la operación correspondiente. Al final mostrará el resultado en
        //consola. Los signos aritméticos disponibles son:
        //+: suma los dos operandos.
        //-: resta los operandos.
        //*: multiplica los operandos.
        ///: divide los operandos, este debe dar un resultado con decimales (double)
        //^: 1º operando como base y 2º como exponente.
        //%: módulo, resto de la división entre operando1 y operando2.

        System.out.print("Introduce el primer operando: ");
        String op1Str = scan.nextLine();

        System.out.print("Introduce el segundo operando: ");
        String op2Str = scan.nextLine();

        System.out.print("Introduce el signo aritmético (+, -, *, /, ^, %): ");
        String signo = scan.nextLine();

        int operando1 = Integer.parseInt(op1Str);
        int operando2 = Integer.parseInt(op2Str);
        double resultado = 0;

        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                if (operando2 != 0)
                    resultado = (double) operando1 / operando2;

                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                System.out.println("Operador no válido.");
                return;
        }

        System.out.println("Resultado: " + resultado);

    }
}
