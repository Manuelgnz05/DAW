import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Nivel 1: básicos
        //1. Crea un StringBuilder con el texto "Programar en Java".
        //• Añade " es divertido".
        //• Imprime el resultado.

        StringBuilder cadena = new StringBuilder("Programar en Java");
        cadena.append(" es divertido");
        System.out.println(cadena);


        //2. Usa insert() para colocar "muy " después de "es ".
        //Resultado esperado: Programar en Java es muy divertido.

        cadena.insert(21, "muy ");
        System.out.println(cadena);

        //3. Usa delete() para eliminar la palabra "Java".
        //Resultado: Programar en es muy divertido.

        cadena.delete(13, 18);
        System.out.println(cadena);

        //Nivel 2: manipulación
        //4. Crea un programa que lea una palabra del usuario y la imprima al revés (usa reverse()).

        System.out.println("Introduce una palabra: ");
        StringBuilder cad = new StringBuilder(scan.nextLine());
        System.out.println(cad.reverse());

        //5. Crea una frase con StringBuilder usando varias llamadas a append().
        //Ejemplo: “Hoy es un gran día para aprender Java”.

        StringBuilder frase = new StringBuilder("Hoy");
        frase.append(" es").append(" un").append(" gran").append(" dia").append(" para").append(" aprender").append(" Java");
        System.out.println(frase);

        //6. Usa replace() para cambiar “día” por “momento”.

        frase.replace(15, 18, "momento");
        System.out.println(frase);

        //Nivel 3
        //7. Generador de lista numerada:
        //Usa un bucle for y un StringBuilder para construir este texto:

        //1. Elemento 1
        //2. Elemento 2
        //3. Elemento 3
        //(Y al final imprímelo con toString().)

        StringBuilder sol = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            sol.delete(0, sol.length());
            sol.append(i + ". Elemento " + i);
            System.out.println(sol);
        }

        //8. Inversor de frase:
        //Pide al usuario una frase, elimínale los espacios (deleteCharAt() o reemplazo manual)
        //y luego inviértela.

        System.out.println("Introduce una frase: ");
        StringBuilder sl = new StringBuilder(scan.nextLine());
        for (int i = 0; i < sl.length(); i++) {
            if(sl.charAt(i) == ' '){
                sl.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sl.reverse());


        //9. Palíndromo simple:
        //Pide una palabra y comprueba si es igual a su reverso.

        System.out.println("introduce una palabra: ");
        String palabra3 = scan.nextLine();
        StringBuilder s = new StringBuilder(palabra3);
        s.reverse();
        if (palabra3.equals(s.toString())){
            System.out.println("Es igual");
        }else{
            System.out.println("No es igual");
        }

    }

}
