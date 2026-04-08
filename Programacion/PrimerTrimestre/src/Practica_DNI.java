import java.util.Scanner;

public class Practica_DNI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Se pretende realizar una aplicación web para un negocio de compras online.
        // Por cada cliente que se registra en la plataforma, hay que validar sus
        // datos personales. Se pretende validar el DNI del usuario y su cuenta bancaria.

        //Validación del DNI

        //Introduce por pantalla el número de tu DNI y almacénalo en una variable de
        // tipo int de nombre ‘numDni’. Para calcular la letra, cogeremos el resto de
        // dividir nuestro DNI entre 23, el resultado debe estar entre 0 y 22.
        // Utilice un switch-case para comprobar que letra toca:

        System.out.println("Introduce tu DNI: ");
        int numDni = scan.nextInt();
        int resto = numDni%23;
        String letra;
        switch (resto){
            case 0: letra = "T";break;
            case 1: letra = "R";break;
            case 2: letra = "W";break;
            case 3: letra = "A";break;
            case 4: letra = "G";break;
            case 5: letra = "M";break;
            case 6: letra = "Y";break;
            case 7: letra = "F";break;
            case 8: letra = "P";break;
            case 9: letra = "D";break;
            case 10: letra = "X";break;
            case 11: letra = "B";break;
            case 12: letra = "N";break;
            case 13: letra = "J";break;
            case 14: letra = "Z";break;
            case 15: letra = "S";break;
            case 16: letra = "Q";break;
            case 17: letra = "V";break;
            case 18: letra = "H";break;
            case 19: letra = "L";break;
            case 20: letra = "C";break;
            case 21: letra = "K";break;
            case 22: letra = "E";break;
            default: letra = "ERROR";break;
        }
        System.out.println(numDni + letra);

        //Validación de la cuenta corriente
        //El algoritmo de validación de la cuenta corriente es el siguiente.
        // Por cada número de cuenta corriente se tienen dos dígitos de control DC.
        // Dado un número de cuenta de la forma:

        //Para obtener el primer dígito de control:
        //La primera cifra de la entidad se multiplica por 4.
        //La segunda cifra de la entidad se multiplica por 8.
        //La tercera cifra de la entidad se multiplica por 5.
        //La cuarta cifra de la entidad se multiplica por 10.

        //La primera cifra del banco se multiplica por 9.
        //La segunda cifra del banco se multiplica por 7.
        //La tercera cifra del banco se multiplica por 3.
        //La cuarta cifra del banco se multiplica por 6.
        //Se suman todos los resultados obtenidos.
        //Se divide entre 11 y nos quedamos con el resto de la división.

        int entidad = 1234;
        int banco = 5678;

        int primera_entidad = (entidad/1000)*4;
        int segunda_entidad = ((entidad/100)%10)*8;
        int tercera_entidad = ((entidad/10)%10)*5;
        int cuarta_entidad = (entidad%10)*10;

        int primera_banco = (banco/1000)*9;
        int segunda_banco = ((banco/100)%10)*7;
        int tercera_banco = ((banco/10)%10)*3;
        int cuarta_banco = (banco%10)*6;

        int numero = primera_entidad + segunda_entidad + tercera_entidad + cuarta_entidad + primera_banco + segunda_banco + tercera_banco + cuarta_banco;
        int valor = numero%11;
        int primer_DC = 11-valor;

        if (primer_DC == 10){
            primer_DC = 1;
        } else if (primer_DC == 11) {
            primer_DC = 0;
        }else {
            primer_DC = primer_DC;
        }

        //La primera cifra de la cuenta se multiplica por 1
        //La segunda cifra de la cuenta se multiplica por 2
        //La tercera cifra de la cuenta se multiplica por 4
        //La cuarta cifra de la cuenta se multiplica por 8
        //La quinta cifra de la cuenta se multiplica por 5
        //La sexta cifra de la cuenta se multiplica por 10
        //La séptima cifra de la cuenta se multiplica por 9
        //La octava cifra de la cuenta se multiplica por 7
        //La novena cifra de la cuenta se multiplica por 3
        //La décima cifra de la cuenta se multiplica por 6
        //Se suman todos los resultados obtenidos.
        //Se divide entre 11 y nos quedamos con el resto de la división.
        //A 11 le quitamos el resto anterior, y ese es el segundo dígito de control, con la salvedad de que
        //si nos da 10, el dígito es 1 y si es 11 ponemos 0.
        //Imprima por pantalla ambos dígitos. Para el caso que se presenta, los dígitos de control serían
        //0 el primero y 6 el segundo.

        int primero = 1 * 1;
        int segundo = 2 * 2;
        int tercero = 3 * 4;
        int cuarta = 4 * 8;
        int quinta = 5 * 5;
        int sexta = 6 * 10;
        int septima = 7 * 9;
        int octava = 8 * 7;
        int novena = 9 * 3;
        int decima = 0 * 6;
        int valor2 = (primero + segundo + tercero + cuarta + quinta + sexta + septima + octava + novena + decima)%11;
        int segundo_DC = 11 - valor2;

        if (segundo_DC == 10){
            segundo_DC = 1;
        } else if (segundo_DC == 11) {
            segundo_DC = 0;
        }else {
            segundo_DC = segundo_DC;
        }

        System.out.println("El DC es: " + primer_DC + segundo_DC);
    }

}
