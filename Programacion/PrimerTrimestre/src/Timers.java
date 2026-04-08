import java.util.Scanner;

public class Timers {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        //1. Crear un programa que lea por pantalla un numero entre 0 y 59, ambos incluidos y forzando
        //al usuario que esté dentro de ese rango. Tras ello, crear un timer de tipo cuenta atrás, que
        //comience presentando el numero introducido y lo vaya decrementando e imprimiendo en una
        //nueva línea. Tras imprimir el cero, el programa acaba imprimiendo la palabra FIN.
        //Es decir, si se lee el número 10, debe imprimirse:
        //10
        //09
        //08
        //07
        //...
        //01
        //00
        //FIN

//        System.out.println("Introduce un numero entre 0 y 59: ");
//        int num = scan.nextInt();
//        if(num >= 0 && num <= 59){
//            for (int contador = num;contador>0;contador--){
//                System.out.println(contador);
//            }
//            System.out.println("FIN");
//        }


        //2. Modifique el programa anterior de forma que aparezca la siguiente línea justo después del
        //print que está utilizando para imprimir cada número:
        //Thread.sleep(1000);
        //¿Qué es lo que hace dicha línea? Pruebe a modificar el número que utiliza como argumento.
        //¿Que representa dicho número?
        //Si no es capaz de hacer este ejercicio, déjelo como estaba y siga con los siguientes.

//        System.out.println("Introduce un numero entre 0 y 59: ");
//        int num = scan.nextInt();
//        if(num >= 0 && num <= 59){
//            for (int contador = num;contador>0;contador--){
//                System.out.println(contador);
//                Thread.sleep(500);
//            }
//            System.out.println("FIN");
//        }

        //3. Modifique el programa anterior, justo la línea donde tiene el print que imprime el número.
        //En lugar de print pruebe a usar print para que se imprima siempre en la misma línea, pero
        //
        //concatene al número un retorno de carro “\r” antes del mismo. Por ejemplo, si tiene el
        //numero almacenado en una variable i, modifique el print para que sea como el que sigue:
        //
        //¿Qué uso tiene el carácter \r?
        //Si no es capaz de hacer este ejercicio, déjelo como estaba y siga con los siguientes.

//        System.out.println("Introduce un numero entre 0 y 59: ");
//        int num = scan.nextInt();
//        if(num >= 0 && num <= 59){
//            for (int contador = num;contador>0;contador--){
//                System.out.print("\r" + contador);
//                Thread.sleep(1000);
//            }
//            System.out.println(" ");
//            System.out.println("FIN");
//        }

        //4. Modifique el programa anterior para que el formato de los números impresos sea el
        //siguiente:
        //00:59
        //00:58
        //00:57
        //...
        //00:00
        //FIN

        System.out.println("Introduce un numero entre 0 y 59: ");
        int num = scan.nextInt();
        if(num >= 0 && num <= 59){
            for (int contador = num;contador>=0;contador--){
                System.out.printf("\r00:%02d", contador);
                Thread.sleep(1000);
            }
            System.out.println(" ");
            System.out.println("FIN");
        }

        //5. Modifique el programa anterior para que además de los segundos, se lean por pantalla los
        //minutos, forzando al usuario para que introduzca un valor del minutero válido (entre 0 y 59,
        //ambos incluidos). Implemente la cuenta atrás teniendo en cuenta que, si el minutero tiene un
        //valor distinto de cero, después de que los segundos lleguen a cero el valor del minutero se
        //decrementará una unidad, y el segundero pasará de 00 a 59, prosiguiendo su curso.
        //Es decir: debe ser capaz de implementar este flujo:
        //09:01
        //09:00
        //08:59
        //08:58
        //08:57
        //...
        //00:00
        //FIN

        int segundos = 0;
        do {
            System.out.print("Introduce los segundos: ");
            segundos = scan.nextInt();
        } while(segundos<0 || segundos>59);
        int minutos = 0;
        do {
            System.out.print("Introduce los minutos: ");
            minutos = scan.nextInt();
        } while(minutos<0 || minutos>59);
        do{
            System.out.printf("\r%02d:%02d", minutos, segundos);
            Thread.sleep(1000);
            segundos--;
            if(segundos==-1) {
                segundos=59;
                minutos--;
            }
        } while(minutos>=0);
        System.out.println("\nFIN");

    }
}
