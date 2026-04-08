import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Se quiere crear un calendario electrónico que lea por pantalla
        //un número de mes e imprima como salida una representación
        //visual de los días de dicho mes, repartidos entre semanas. Por
        //ejemplo, si se lee el número 1, correspondiente al mes de
        //enero (31 días), se visualizará lo siguiente:
        //TAB TAB “Enero”
        //Lu Ma Mi Ju Vi Sa Do
        //01 02 03 04 05 06 07
        //08 09 10 11 12 13 14
        //15 16 17 18 19 20 21
        //22 23 24 25 26 27 28
        //29 30 31
        //
        //Los meses que tienen 31 días son: enero, marzo, mayo, julio,
        //agosto, octubre, diciembre.
        //Los meses que tienen 30 días son: abril, junio, septiembre,
        //noviembre.
        //El mes de febrero tiene 28 días.
        //Las letras TAB representan una tabulación.
        //a) (0.75 puntos) Pedir al usuario por pantalla un número
        //entre 1 y 12, forzando a que se meta un número dentro de
        //ese rango.
        //b) (0.75 puntos) Imprimir por pantalla el nombre del mes
        //que le corresponde a ese número, precediéndolo de dos
        //tabulaciones (marcadas con TAB en el ejemplo superior) y
        //entre comillas dobles.
        //
        //c) (0.5 puntos) Imprimir los nombres de los días de la
        //semana con el formato que aparece en el ejemplo
        //superior.
        //d) (1.5 puntos) Usando bucles imprimir los días de todas las
        //semanas que le corresponden al mes en cuestión, tal y
        //como se muestra en el ejemplo superior. Suponga que el
        //día 1 de cada mes SIEMPRE empieza en lunes. Los días
        //deben imprimirse con una anchura de 2 caracteres.
        //e) (1 puntos) Cuando el programa termine, pregunte al
        //usuario si desea continuar. En caso afirmativo (si el
        //usuario introduce un 1), se repetirá todo el proceso (desde
        //introducir un nuevo mes hasta imprimir sus días). En caso
        //negativo (si el usuario introduce cualquier otro número), el
        //programa termina imprimiendo un mensaje de despedida
        //(el que usted quiera, pero no utilice términos ofensivos ni
        //palabras malsonantes).
        //f) (0.5 puntos) Finalmente, considere añadir soporte para
        //tener en cuenta los años bisiestos. Para ello, debe
        //modificar el programa para que después de leer el
        //número de mes, también se lea un número que
        //represente al año, forzando que dicho número sea igual o
        //superior a cero. Dependiendo del valor de ese año el mes
        //de febrero tendrá 28 días (año normal) o 29 días (año
        //bisiesto), y al imprimir el calendario de dicho mes deberán
        //verse los días adecuados. Para conseguir estos puntos
        //debe seguir estrictamente la regla que puede leer en el
        //siguiente párrafo. No juzgue si la regla es correcta o no,
        //simplemente implemente la lógica tal y como aparece.
        //“Un año es bisiesto si es divisible entre 4 y no es divisible entre
        //100. También si es divisible entre 400”
        //
        //Ejemplos de años bisiestos: 1988, 1992, 1996...

        int num;
        int ano;
        int numero;

        do {
            do{
                System.out.println("Introduce un numero entre 1 y 12: ");
                num = scan.nextInt();
                if(num>12 || num<1){
                    System.out.println("Número incorrecto, introduce otro.");
                }
            }while(num>12 || num<1);

            do{
                System.out.println("Introduce un año: ");
                ano = scan.nextInt();
                if(ano<=0){
                    System.out.println("Número incorrecto, introduce otro.");
                }
            }while(ano<=0);

            String mes = "";
            switch (num){
                case 1:
                    System.out.println("\t\t\"Enero\"");
                    mes = "Enero";
                    break;
                case 2:
                    System.out.println("\t\t\"Febrero\"");
                    mes = "Febrero";
                    break;
                case 3:
                    System.out.println("\t\t\"Marzo\"");
                    mes = "Marzo";
                    break;
                case 4:
                    System.out.println("\t\t\"Abril\"");
                    mes = "Abril";
                    break;
                case 5:
                    System.out.println("\t\t\"Mayo\"");
                    mes = "Mayo";
                    break;
                case 6:
                    System.out.println("\t\t\"Junio\"");
                    mes = "Junio";
                    break;
                case 7:
                    System.out.println("\t\t\"Julio\"");
                    mes = "Julio";
                    break;
                case 8:
                    System.out.println("\t\t\"Agosto\"");
                    mes = "Agosto";
                    break;
                case 9:
                    System.out.println("\t\t\"Septiembre\"");
                    mes = "Septiembre";
                    break;
                case 10:
                    System.out.println("\t\t\"Octubre\"");
                    mes = "Octubre";
                    break;
                case 11:
                    System.out.println("\t\t\"Noviembre\"");
                    mes = "Noviembre";
                    break;
                case 12:
                    System.out.println("\t\t\"Diciembre\"");
                    mes = "Diciembre";
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }

            System.out.println("Lu Ma Mi Ju Vi Sa Do\n");

            int dias = 0;
            switch (mes){
                case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre":
                    dias = 31;
                    break;
                case "Abril", "Junio", "Septiembre", "Noviembre":
                    dias = 30;
                    break;
                case "Febrero":
                    dias = 28;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }

            if(ano%400 == 0 || ((ano%4 == 0) && !(ano%100 == 0)) && mes.equals("Febrero")){
                dias++;
            }

            for (int i = 1; i <= dias; i++) {
                System.out.printf("%02d ", i);
                if(i%7 == 0){
                    System.out.println();
                }
            }

            System.out.println("\nIntroduce 1 para repetir el proceso, y otro número para terminar: ");
            numero = scan.nextInt();

        }while(numero == 1);

        
    }
}
