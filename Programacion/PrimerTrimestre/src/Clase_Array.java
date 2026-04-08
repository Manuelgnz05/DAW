public class Clase_Array {
    public static void main(String[] args) {
        //Creacion con listas de inicializacion
        int miEdad = 20;
        int[] arrayEnteros = {0, 4, -9, miEdad};
        System.out.println(arrayEnteros.length);
        float[] arrayFloat = {0.2f, 6.9f};

        double[] arrayDouble = {9.335, 4.5324, 5.6242};

        char[] arrayChar = {'r', 'y'};

        boolean[] arrayBoolean = {true, false, false};

        String[] arrayString = {"oca", "pez"};

        //Creacion con tamaño
        int[] arrInt = new int [17];

        //Imprimir el contenido del array de forma que se imprima cada letra en una linea
        char[] arrChar = {'m', 'a', 'r', 'c', 'o', 's', 'j', 'u', 'l', 'i', 'a', 'n'};
        for (int i = 0; i < arrChar.length; i++) {
            System.out.print(arrChar[i]);
        }

    }
}
