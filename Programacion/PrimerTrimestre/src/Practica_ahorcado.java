import java.util.Scanner;

public class Practica_ahorcado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Debe implementar el juego del ahorcado (hardcodee la palabra a acertar). A continuación tiene un
        //ejemplo de ejecución del programa cuando se pierde y otro cuando se gana:
        //****Bienvenido al ahorcado****
        //Juguemos!!!
        //______ <- Esta es la palabra oculta!!!
        //Te quedan 5 fallos restantes.
        //Introduce una letra: c
        //C esta presente en la palabra oculta.
        //C_____ <- Esta es la palabra oculta!!!
        //Te quedan 5 fallos restantes.
        //Introduce una letra: o
        //O esta presente en la palabra oculta.
        //CO____ <- Esta es la palabra oculta!!!
        //Te quedan 5 fallos restantes.
        //Introduce una letra: C
        //Ya introdujiste anteriormente la letra 'C'. Cuenta como fallo!
        //CO____ <- Esta es la palabra oculta!!!
        //Te quedan 4 fallos restantes.
        //Introduce una letra: m
        //M esta presente en la palabra oculta.
        //COM___ <- Esta es la palabra oculta!!!
        //Te quedan 4 fallos restantes.
        //Introduce una letra: l
        //L no esta presente en la palabra.
        //COM___ <- Esta es la palabra oculta!!!
        //Te quedan 3 fallos restantes.
        //Introduce una letra: p
        //P no esta presente en la palabra.
        //COM___ <- Esta es la palabra oculta!!!
        //Te quedan 2 fallos restantes.
        //Introduce una letra: a
        //A esta presente en la palabra oculta.
        //COM__A <- Esta es la palabra oculta!!!
        //Te quedan 2 fallos restantes.
        //Introduce una letra: r
        //R no esta presente en la palabra.
        //COM__A <- Esta es la palabra oculta!!!
        //Te quedan 1 fallos restantes.
        //Introduce una letra: q
        //Q no esta presente en la palabra.
        //Has perdido, eres un LOOSER y ademas estas MUERTO.
        //
        //****Bienvenido al ahorcado****
        //Juguemos!!!
        //_______ <- Esta es la palabra oculta!!!
        //Te quedan 5 fallos restantes.
        //Introduce una letra: p
        //P no esta presente en la palabra.
        //_______ <- Esta es la palabra oculta!!!
        //Te quedan 4 fallos restantes.
        //Introduce una letra: d
        //D esta presente en la palabra oculta.
        //D______ <- Esta es la palabra oculta!!!
        //Te quedan 4 fallos restantes.
        //Introduce una letra: e
        //E esta presente en la palabra oculta.
        //DE_____ <- Esta es la palabra oculta!!!
        //Te quedan 4 fallos restantes.
        //Introduce una letra: l
        //L esta presente en la palabra oculta.
        //DEL____ <- Esta es la palabra oculta!!!
        //Te quedan 4 fallos restantes.
        //Introduce una letra: i
        //I esta presente en la palabra oculta.
        //DELI_I_ <- Esta es la palabra oculta!!!
        //Te quedan 4 fallos restantes.
        //Introduce una letra: c
        //C esta presente en la palabra oculta.
        //DELICI_ <- Esta es la palabra oculta!!!
        //Te quedan 4 fallos restantes.
        //Introduce una letra: a
        //A esta presente en la palabra oculta.
        //La palabra es: DELICIA
        //Bien jugado pero no te vengas muy arriba!!
        //Has necesitado: 7 rondas

        char letra;
        int rondas = 0;
        int fallos = 5;
        boolean acertado;
        String palabra = "";
        String solucion ;
        String usadas = "";
        System.out.println("Introduce una palabra: ");
        solucion = scan.nextLine().toUpperCase();
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
            if (palabra.equalsIgnoreCase(solucion)){
                acertado = true;
            }else{
                acertado = false;
            }
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

