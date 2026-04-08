import java.util.Scanner;

public class Boletin_bucles_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        //1. Leer un nombre por pantalla, y escribir un saludo por pantalla que utilice ese
//        //nombre, repitiendo dicho saludo hasta que se muestre un total de diez veces.
//
//        System.out.println("Introduce un nombre: ");
//        String nombre = scan.nextLine();
//        for(int contador = 0;contador<10;contador++){
//            System.out.println("Un saludo, " + nombre);
//        }
//
//
//        //2. Leer un número entero, y escribir un mensaje de error tantas veces como diga ese
//        //número.
//
//        System.out.println("Introduce un numero: ");
//        int error = scan.nextInt();
//        for(int contador = 0;contador<error;contador++){
//            System.out.println("ERROR");
//        }
//
//        //3. Crear una contraseña numérica en una variable. Pedir por pantalla la contraseña de
//        //inicio hasta que el usuario la acierte.
//
//        int contrasena = 88;
//        int contrasena2;
//        do{
//            System.out.println("Introduce la contraseña: ");
//            contrasena2 = scan.nextInt();
//            if(contrasena == contrasena2){
//                System.out.println("Correcto");
//            }else{
//                System.out.println("Error, intentalo otra vez");
//            }
//
//        }while(contrasena != contrasena2);
//

//        //4. Leer por pantalla un entero y comprobar si es negativo o positivo, imprimiendo por
//        //pantalla una frase al respecto. Si se mete un cero, volver a pedir un número.
//
//        /*
//        int num;
//        do{
//            System.out.println("Introduce un numero: ");
//            num = scan.nextInt();
//            if(num>0){
//                System.out.println("El numero es positivo");
//            } else if (num<0) {
//                System.out.println("El numero es negativo");
//            }else {
//                System.out.println("Introduce otro numero");
//            }
//        }while(num == 0);
//         */
//
//        //5. Leer por pantalla un entero y comprobar si es par o impar. Si se mete un numero
//        //negativo o cero, volver a pedir un número.
//
//        /*
//        int entero;
//        do{
//            System.out.println("Introduce un numero: ");
//            entero = scan.nextInt();
//            if(entero%2 == 0){
//                System.out.println("Es par");
//            } else if (entero%2 == 1) {
//                System.out.println("Es impar");
//            }else {
//                System.out.println("Numero invalido, introduce otro");
//            }
//        }while(entero<=0);
//         */
//
//        //6. Introducir una variable contadora en los dos ejercicios anteriores que almacene la
//        //cantidad total de números incorrectos que ha introducido el usuario, y la muestre por
//        //pantalla antes de finalizar.
//
//        int num;
//        int contador = 0;
//        do{
//            System.out.println("Introduce un numero: ");
//            num = scan.nextInt();
//            if(num>0){
//                System.out.println("El numero es positivo");
//                System.out.println("Has introducido " + contador + " numeros incorrectos");
//            } else if (num<0) {
//                System.out.println("El numero es negativo");
//                System.out.println("Has introducido " + contador + " numeros incorrectos");
//            }else {
//                System.out.println("Introduce otro numero");
//                contador++;
//            }
//        }while(num == 0);
//
//
//        int entero;
//        int cont = 0;
//        do{
//            System.out.println("Introduce un numero: ");
//            entero = scan.nextInt();
//            if(entero%2 == 0){
//                System.out.println("Es par");
//                System.out.println("Has introducido " + cont + " numeros incorrectos");
//            } else if (entero%2 == 1) {
//                System.out.println("Es impar");
//                System.out.println("Has introducido " + cont + " numeros incorrectos");
//            }else {
//                System.out.println("Numero invalido, introduce otro");
//                cont++;
//            }
//        }while(entero<=0);
//
//        //7. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes
//        //correspondiente. En caso de leer un número fuera de rango, volver a pedir un
//        //número entre 1 y 12.
//
//        int mes;
//        do{
//            System.out.println("Introduce un numero: ");
//            mes = scan.nextInt();
//            switch (mes){
//                case 1:
//                    System.out.println("Enero");
//                    break;
//                case 2:
//                    System.out.println("Febrero");
//                    break;
//                case 3:
//                    System.out.println("Marzo");
//                    break;
//                case 4:
//                    System.out.println("Abril");
//                    break;
//                case 5:
//                    System.out.println("Mayo");
//                    break;
//                case 6:
//                    System.out.println("Junio");
//                    break;
//                case 7:
//                    System.out.println("Julio");
//                    break;
//                case 8:
//                    System.out.println("Agosto");
//                    break;
//                case 9:
//                    System.out.println("Septiembre");
//                    break;
//                case 10:
//                    System.out.println("Octubre");
//                    break;
//                case 11:
//                    System.out.println("Noviembre");
//                    break;
//                case 12:
//                    System.out.println("Diciembre");
//                    break;
//                default:
//                    System.out.println("Numero invalido, introduce otro");
//            }
//
//        }while(mes<1 || mes>12);

        //8. Leer por pantalla un entero e imprimirlo elevado a la quinta potencia. Utilizar un
        //bucle para realizar el cálculo.

//        System.out.println("Introduce un numero: ");
//        int quinta = scan.nextInt();
//        int res = 0;
//        for(int con = 0;con<5;con++){
//            if(con == 0){
//                res = quinta*quinta;
//            } else if (con>0 && con<4) {
//                res = res*quinta;
//            }else if (con == 4){
//                System.out.println("Al elevarlo a la quinta sale " + res);
//
//            }
//        }

        //9. Repetir el ejercicio anterior para leer también por pantalla la potencia a la que debe
        //elevarse el número.
//
//        System.out.println("Introduce un numero: ");
//        int quinta = scan.nextInt();
//        System.out.println("Introduce a que potencia lo quieres elevar: ");
//        int potencia = scan.nextInt();
//        int res = 0;
//        for(int con = 0;con<potencia;con++){
//            if(con == 0){
//                res = quinta*quinta;
//            } else if (con>0 && con<(potencia-1)) {
//                res = res*quinta;
//            }else if (con == (potencia-1)){
//                System.out.println("Al elevarlo a " + potencia + " sale " + res);
//
//            }
//        }

        //10. Leer por pantalla un número n, e imprimir por pantalla una fila de asteriscos con
        //tantas columnas como diga n.
        //ejemplo para n = 4
        //

//        System.out.println("Introduce un numero: ");
//        int n = scan.nextInt();
//        for(int contador = 0; contador<n;contador++){
//            System.out.print("* ");
//        }

        //11. Leer por pantalla un número n, e imprimir por pantalla un cuadrado cuya altura viene
        //dada por n.

        System.out.println("Introduce un numero: ");
        int n = scan.nextInt();
        for(int fil = 0; fil<n;fil++){
            for(int col = 0; col<n;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        //12. Leer por pantalla un numero n, e imprimir por pantalla un cuadrado cuya altura viene
        //dada por n.
        //
        //ejemplo para n = 8

//        System.out.println("Introduce una altura del cuadrado: ");
//        int n2 = scan.nextInt();
//
//        for(int fil = 0; fil < n2; fil++){
//            for (int col = 0; col<n2;col++){
//                if(fil == 0 || col == 0 || fil == (n2-1) || col == (n2-1)){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }



        //13. Leer por pantalla un número n, e imprimir por pantalla un triángulo cuya altura viene
        //dada por n.

//        System.out.println("Introduce una altura del cuadrado: ");
//        int n2 = scan.nextInt();
//
//        for(int fil = 0; fil < n2; fil++){
//            for (int col = 0; col<=fil;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        

        //14. (MUY DIFICIL) Leer por pantalla un número n, e imprimir por pantalla un triángulo
        //cuyo número de niveles viene dado por n.
        //
        //ejemplo para n = 10



        //15. (DIFICIL) Leer por pantalla un número n, e imprimir por pantalla un triángulo cuyo
        //número de niveles viene dado por n.
        //*****
        //***
        //*
        //ejemplo para n = 5
        //
        //A PARTIR DE AQUÍ SON MATEMÁTICOS, NO LOS HAGA SI NO QUIERE
        //16. (Difícil) Escriba un programa que compruebe si un número es cúbico, es decir, si
        //puede expresarse como un producto de tres factores iguales.
        //17. (DIFÍCIL) Leer por pantalla un número entero e indicar si es primo.
        //18. (NO HACER) Imprimir por pantalla todos los números primos entre 0 y 100.
        //
        //19. (MUY DIFÍCIL) Escribe un programa que lea por pantalla un número entero y
        //determine si es un capicua.
        //20. (NO HACER) Leer por pantalla dos números, a y b, y calcular su máximo común
        //divisor.
        //21. (NO HACER) Leer por pantalla dos números, a y b, y calcular su mínimo común
        //múltiplo.
        //22. (NO HACER) Leer por pantalla dos números, a y b, y comprobar si son coprimos (los
        //números coprimos son aquellos que no tienen ningún factor primo en común).
        //--- A partir de aquí, la idea es usar bucles para imprimir distintos términos de varias
        //sucesiones aritméticas famosas, para lo cual deberá buscar en wikipedia
        //información sobre las mismas. No es necesario que los haga, hay más boletines
        //disponibles.
        //23. Leer por pantalla un número n, e imprimir por pantalla los n primeros términos de la
        //sucesión de Fibonacci.
        //24. Leer por pantalla un número n, e imprimir por pantalla los n primeros términos de la
        //sucesión de Pell.
        //25. Escriba un programa que lea por pantalla un número y determine si es un número de
        //Mersenne.
        //26. Escriba un programa que imprima los 10 primeros números de Fermat.
    }
}
