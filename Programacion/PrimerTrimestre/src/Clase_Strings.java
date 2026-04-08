public class Clase_Strings {
    public static void main(String[] args) {

        String cadena = new String("Hola Mundo");
        for (int contador = 0; cadena.length() > contador; contador++) {
            System.out.println(cadena.charAt(contador));
        }

        // Crear una cadena mediante un literal de cadena.
        //Dividir la cadena en dos mitades e imprimir cada mitad en una línea. Debe usar el metodo substring y length.

//        String cad = "Hola mundo";
//        String parte1 = cad.substring(0, (cad.length()/2));
//        String parte2 = cad.substring((cad.length()/2));
//        System.out.println(parte1);
//        System.out.println(parte2);

        // A partir de una cadena que contiene un espacio en blanco (y solo uno), usar indexOf o lastIndexOf para obtener el indice donde esta el espacio.

        String espacio = "Hola Mundo";
        System.out.println(espacio.indexOf(" "));

        //A partir de ese indice, dividir la cadena en dos partes distintas, que no contengan el espacio

        String part1 = espacio.substring(0, espacio.indexOf(" "));
        String part2 = espacio.substring(espacio.indexOf(" ") + 1);
        System.out.println(part1);
        System.out.println(part2);


    }
}
