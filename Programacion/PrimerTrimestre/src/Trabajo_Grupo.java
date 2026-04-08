import java.util.Scanner;

public class Trabajo_Grupo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //6. Invertir palabras individualmente
        //    Dada la frase "Hola que tal estás" genera:
        //            "aloH euq lat sátse"
        //    Debes invertir cada palabra sin usar split() y manipulando índices manualmente.

//        //Solución 1:
//
//        // Declaramos una variable temporal (tmp).
//        int temp = 0;
//        // Declaramos la frase.
//        String frase = "Hola que tal estás";
//        // Usamos un bucle 'for' para recorrer la frase.
//        for (int i = 0; i < frase.length(); i++) {
//            // Usamos un condicional 'if' para añadir un espacio al principio y al final de la frase.
//            if(i == 0){
//                frase = " " + frase + " ";
//            }
//            // Usamos un condicional 'if' para detectar los espacios.
//            if(frase.charAt(i) == ' '){
//                // Usamos substring para extraer cada palabra de la frase, hacerle el inverso y mostrarlo por pantalla
//                StringBuilder inv = new StringBuilder(frase.substring(temp, i));
//                temp = i;
//                System.out.print(inv.reverse());
//            }
//        }

        //6. Invertir palabras individualmente
        //    Dada la frase "Hola que tal estás" genera:
        //            "aloH euq lat sátse"
        //    Debes invertir cada palabra sin usar split() y manipulando índices manualmente.

        // Declaramos un StringBuilder vacío.
        StringBuilder sol = new StringBuilder();

        // Declaramos la frase.
        String frase = "   Hola que     t   al e\tstás    ";

        // Le añadimos un espacio al final de la frase.
        frase = frase + " ";

        // Usamos un bucle 'for' para recorrer la frase.
        for (int i = 0; i < frase.length(); i++) {

            // Usamos un condicional 'if' para detectar los espacios y
            // si lo detecta que muestre por pantalla la inversa de la palabra y
            // limpie el StringBuilder
            if(frase.charAt(i) == ' '){
                System.out.print(sol.reverse() + " ");
                sol = new StringBuilder();

                //Sino añadir el carácter al StringBuilder
            }else{
                sol.append(frase.charAt(i));
            }
        }

    }

}
