import java.util.Scanner;

public class Refuerzo_condicionales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1. Lea por pantalla un nombre (cadena de caracteres o String) mediante el
        // metodo nextLine de la clase Scanner, y almacénelo en una variable de
        // nombre name. A continuación, imprima por pantalla un saludo
        //(por ejemplo, si el usuario introduce Jorge, imprima por pantalla
        // Buenos días Jorge).

        System.out.println("Introduce un nombre: ");
        String name = scan.nextLine();
        System.out.println("Buenos días " + name);

        //2. Lea por pantalla las edades de dos personas, y compruebe si la
        // primera es al menos el doble de mayor que la segunda. Escriba un
        // mensaje al respecto.

        System.out.println("Introduce dos edades: ");
        int edad1 = scan.nextInt();
        int edad2 = scan.nextInt();
        if (edad1>=(edad2*2)){
            System.out.println("La primera es el doble de mayor que la segunda");
        }else{
            System.out.println("La primera no es el doble de mayor que la segunda");
        }

        //3. Lea los dos valores de tensión de una persona (alta y baja), y compruebe si son
        //normales. Se consideran normales si la baja es la mitad más uno de la alta. Use enteros
        //para todas las operaciones.

        System.out.println("Introduce una tension alta");
        int tension_alta = scan.nextInt();
        System.out.println("Introduce una tension baja");
        int tension_baja = scan.nextInt();
        if((tension_alta/2)+1 == tension_baja){
            System.out.println("Tension normal");
        }else{
            System.out.println("Tension anormal");
        }

        //4. (Examen) Lea por pantalla una temperatura, y dependiendo de la misma avise al
        //usuario de la siguiente forma:
        //a. Si la temperatura es inferior a 20 grados, escriba que hace frío.
        //b. Si es superior o igual a 20 pero inferior a 27, escriba que se está bien.
        //c. Si es igual o superior a 27, escriba que hace calor.

        System.out.println("Introduzca una temperatura: ");
        int temperatura = scan.nextInt();
        if (temperatura>=0){
            if (temperatura<20){
                System.out.println("Hace frio");
            } else if (temperatura>=20 && temperatura<27) {
                System.out.println("Se esta bien");
            } else {
                System.out.println("Hace calor");
            }
        }

        //5. Lea por pantalla una temperatura en grados centígrados, y conviértala a grados Kelvin
        //e imprima por pantalla.

        System.out.println("Introduzca una temperatura en celsius: ");
        int celsius = scan.nextInt();
        int kelvin = celsius + 273;
        System.out.println("Son " + kelvin + " kelvin");

        //6. Repita el ejercicio anterior, pero haciendo la operación inversa.
        System.out.println("Introduzca una temperatura en kelvin: ");
        int kelvin2 = scan.nextInt();
        int celsius2 = kelvin2 - 273;
        System.out.println("Son " + celsius2 + " grados");

        //7. (Examen) Repita los dos ejercicios anteriores, pero haciendo un menú en el que se le
        //pida al usuario un número. Si introduce un 1, entonces se quiere traducir de grados
        //centígrados a Kelvin. Si introduce un 2, entonces se quiere traducir de Kelvin a grados
        //centígrados.

        System.out.println("Introduce 1 para pasar de grados a kelvin y 2 para lo inverso: ");
        int num = scan.nextInt();
        if(num == 1 || num == 2){
            if(num == 1){
                System.out.println("Introduzca una temperatura en celsius: ");
                int celsius3 = scan.nextInt();
                int kelvin3 = celsius3 + 273;
                System.out.println("Son " + kelvin3 + " kelvin");
            }else{
                System.out.println("Introduzca una temperatura en kelvin: ");
                int kelvin4 = scan.nextInt();
                int celsius4 = kelvin4 - 273;
                System.out.println("Son " + celsius4 + " grados");
            }
        }
        //8. (Examen) Lea por pantalla un número que represente un día de la semana (1-7), e
        //imprima el nombre del día correspondiente (lunes-domingo).

        System.out.println("Introduce un numero: ");
        int numero = scan.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero erroneo");
        }

        //9. (Examen) Modifique el ejercicio anterior para que solo se acepten números del 1 al 7,
        //y en caso contrario se muestre un mensaje de error.

        //10. (Examen) Lea por pantalla un numero de entre los siguientes (y solo de entre los
        //siguientes): 28, 30 o 31. Si el usuario mete otro, imprimir un mensaje de error. Si mete
        //uno de esos tres, imprimir los nombres de los meses del año que tengan esa cantidad
        //de días. Por ejemplo: si el usuario mete 31, debería imprimirse por pantalla: Enero,
        //Marzo, Mayo, Julio, Agosto, Octubre y Diciembre. Si mete 28, se imprime Febrero. Si
        //mete 30, se imprime el nombre de los meses restantes.

        System.out.println("Introduce un numero: ");
        int num2 = scan.nextInt();
        switch (num2){
            case 28:
                System.out.println("Febrero");
                break;
            case 30:
                System.out.println("Abril, Junio, Septiembre, Noviembre");
                break;
            case 31:
                System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre");
                break;
            default:
                System.out.println("ERROR");
                break;
        }

        //11. Lea la cantidad de azúcar en sangre que tiene una persona (medida en miligramos) e
        //imprima por pantalla un mensaje indicando si se encuentra dentro del rango normal o
        //no. En caso de no estar dentro del rango normal, mostrar la cantidad por la que se ha
        //sobrepasado (busque por internet los rangos medios).

        System.out.println("Introduce el azucar en mg: ");
        int azucar = scan.nextInt();
        if (azucar>=70 && azucar<=100){
            System.out.println("Esta dentro de los valores normales");
        }else if(azucar<70){
            System.out.println("Esta por debajo por " + (70-azucar) + " mg");
        }else{
            System.out.println("Esta por encima por " + (azucar-100) + " mg");
        }

        //12. Lea por pantalla una altura expresada en metros, y compruebe si esa persona puede
        //montarse en las atracciones de la feria (altura igual o superior a 1.60 metros).

//        System.out.println("Introduce una altura en metros: ");
//        float altura = scan.nextFloat();
//        if(altura>=1.6){
//            System.out.println("Te puedes montar en las atracciones");
//        }else{
//            System.out.println("No puedes montarte en la atracciones, te faltan" + (1.6-altura) + "metros");
//        }



        // 13. Modifique el ejercicio anterior para que además se compruebe si la persona también puede
        // montarse en las atracciones de Isla Mágica (altura igual o superior a 1.70).


//        System.out.println("Introduce una altura en metros: ");
//        float altura = scan.nextFloat();
//        if(altura>=1.6f && altura<1.7){
//            System.out.println("Te puedes montar en las atracciones, pero no es la de Isla Mágica");
//        }else if (altura<1.6f){
//            System.out.println("No puedes montarte en ninguna de las atracciones, te faltan" + (1.6-altura) + "metros");
//        } else if (altura>1.7f) {
//            System.out.println("Te puedes montar en las atracciones de Isla Mágica");
//        }

        //14. (Examen) Modifique el ejercicio anterior para que además se compruebe si la persona puede
        // formar parte del club de baloncesto de Sevilla (altura igual o superior a 1.78).

        System.out.println("Introduce una altura en metros: ");
        float altura = scan.nextFloat();
        if(altura>=1.6f && altura<1.7){
            System.out.println("Te puedes montar en las atracciones, pero no es la de Isla Mágica y tampoco puedes formar parte del club");
        }else if (altura<1.6f){
            System.out.println("No puedes montarte en ninguna de las atracciones,ni entrar en el club de baloncesto");
        } else if (altura>1.7f && altura<1.78) {
            System.out.println("Te puedes montar en las atracciones de Isla Mágica, pero no entrar en el club de baloncesto");
        } else if (altura>=1.78f) {
            System.out.println("Te puedes montar en las atracciones de Isla Magica y entrar en el club de baloncesto");
        }

        //15. Lea por pantalla un valor en dólares, y conviértalos a euros e imprímalo por pantalla.

        System.out.println("Introduce una cantidad: ");
        float dolares = scan.nextFloat();
        float euros = dolares * 1.16f;
        System.out.println("Son " + euros + " euros");

        //16. Repita el ejercicio anterior, pero haciendo la operación inversa.

        System.out.println("Introduce una cantidad: ");
        float euros2 = scan.nextFloat();
        float dolares2 = euros2 * 0.86f;
        System.out.println("Son " + dolares2 + " dolares");

        //17. Lea por pantalla un valor en pulgadas, y conviértalo a centímetros e imprima por
        //pantalla.

        System.out.println("Introduce una cantidad: ");
        float pulgadas = scan.nextFloat();
        float cm = pulgadas * 2.54f;
        System.out.println("Son " + cm + " centimentros");

        //18. Repita el ejercicio anterior, pero haciendo la operación inversa.

        System.out.println("Introduce una cantidad: ");
        float cm2 = scan.nextFloat();
        float pulgadas2 = cm2 * 0.39f;
        System.out.println("Son " + pulgadas2 + " pulgadas");

        //19. (Examen) Se tiene un saldo de 1000 euros. Lea por pantalla una cantidad
        //correspondiente a una transferencia que quiere realizar el usuario. Si es posible
        //hacerla, actualice el valor del saldo e imprímalo por pantalla. Si no es posible hacerla,
        //escriba un mensaje por pantalla que diga que no es posible realizar la operación, e
        //imprima la cantidad que le falta al usuario en el saldo para que fuese posible hacerla.

        float saldo = 1000f;
        System.out.println("Introduce la cantidad de la transferencia: ");
        float transferencia = scan.nextFloat();
        if(transferencia > saldo){
            System.out.println("No es posible realizar la tranferencia");
        }else{
            System.out.println("Transferencia realizada, cantidad restante: " + (saldo - transferencia));
        }

        //20. (Examen) Lea por pantalla un número que represente a un mes del año (1-12), e
        //imprima la cantidad de días que tiene ese mes. Suponga que no es un año bisiesto.

        System.out.println("Introduzca un numero entre el 1 y el 12: ");
        int num_mes = scan.nextInt();
        if(num_mes == 1 || num_mes == 3 || num_mes == 5 || num_mes == 7 || num_mes == 8 || num_mes == 10 || num_mes == 12){
            System.out.println("Ese mes tiene 31 días");
        } else if (num_mes == 2) {
            System.out.println("Ese mes tiene 28 días");
        }else{
            System.out.println("Ese mes tiene 30 días");
        }

        //21. (Examen) Busque por internet alguna fórmula de comprobación de años bisiestos (casi
        //todas fallan), y cree un programa que lea por pantalla un año y compruebe si es
        //bisiesto.

        System.out.println("Introduce un año: ");
        int ano = scan.nextInt();
        if(ano%4 == 0){
            System.out.println("Ese año es bisiesto");
        }else{
            System.out.println("Ese año no es bisiesto");
        }

    }
}
