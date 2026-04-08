import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //En una feria, Ana quiere montar en la noria y en la montaña rusa, pero
        //dichas atracciones imponen restricciones de altura. Para montar en la noria
        //hay que medir más de 1,10 metros, mientras que para montar en la
        //montaña rusa hay que medir más de 1,50 metros. Debe leer la altura de Ana
        //e imprimir por consola uno y sólo uno de los siguientes mensajes, según la
        //misma:

        //- Ana puede montar en la noria y en la montaña rusa. FIN DEL EJERCICIO 2.
        //- Ana puede montar en la noria pero no en la montaña rusa. FIN DEL EJERCICIO 2.
        //- Ana puede montar en la montaña rusa pero no en la noria. FIN DEL EJERCICIO 2.
        //- Ana no puede montar en ninguna de las dos atracciones. FIN DEL EJERCICIO 2.

        System.out.println("Introduce una altura: ");
        float alt = scan.nextFloat();
        float noria = 1.10f;
        float rusa = 1.50f;

        if(alt<=noria && alt<=rusa){
            System.out.println("Ana no puede montar en ninguna de las dos atracciones.");
        } else if (alt<=noria && alt>rusa) {
            System.out.println("Ana puede montar en la montaña rusa pero no en la noria.");
        } else if (alt>noria && alt<=rusa) {
            System.out.println("Ana puede montar en la noria pero no en la montaña rusa.");
        }else {
            System.out.println("Ana puede montar en la noria y en la montaña rusa.");
        }

        System.out.println(" FIN DEL EJERCICIO 2");
    }
}
