import java.util.Scanner;

public class Practica_ahorcado_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letra;
        int rondas = 0;
        int fallos = 5;
        boolean acertado;
        String palabra = "";
        String solucion;
        boolean usada = false;
        System.out.println("Introduce una palabra: ");
        solucion = scan.nextLine().toUpperCase();
        char[] usadas = new char[solucion.length()];
        for (int i = 0; i <= solucion.length()-1; i++) {
            palabra = palabra + "_";
        }
        System.out.println("****Bienvenido al ahorcado****\n" +
                "Juguemos!!!");
        do {
            System.out.println("Te quedan " + fallos + " fallos restantes.");
            System.out.println("Introduce una letra: ");
            System.out.println(palabra + " <- Esta es la palabra oculta!!!");
            letra = scan.next().toUpperCase().charAt(0);
            System.out.println();
            for (int i = 0; i < usadas.length; i++) {
                if (usadas[i] == letra){
                    usada = true;
                }
            }
            if (!usada){
                if (solucion.indexOf(letra)>=0){
                    System.out.println(letra + " esta presente en la palabra oculta");
                    for (int i = 0; i <= solucion.length()-1; i++) {
                        if (solucion.charAt(i) == letra){
                            palabra = palabra.substring(0, i) + letra + palabra.substring(i+1);
                            System.out.println(palabra);
                        }
                    }
                }else {
                    System.out.println(letra + " no esta presente en la palabra");
                    fallos--;
                }
            }else {
                System.out.println("La letra ya ha sido usada");
                fallos--;
            }

            if (palabra.equalsIgnoreCase(solucion)){
                acertado = true;
            }else{
                acertado = false;
            }
            usadas[rondas] = letra;
            rondas++;

        } while (fallos != 0 && (!acertado));

        if (fallos>0){
            System.out.println("La palabra es: " + palabra);
            System.out.println("Bien jugado pero no te vengas muy arriba!!");
            System.out.println("Has necesitado: " + rondas + " rondas.");
        }else{
            System.out.println("Has perdido, eres un LOOSER y ademas estas MUERTO.");
        }
    }
}
