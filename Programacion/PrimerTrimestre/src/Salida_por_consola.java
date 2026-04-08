public class Salida_por_consola {
    public static void main(String[] args) {
        // 1. Imprime por pantalla tu nombre
        String nombre = "Manuel";
        System.out.println(nombre);
        //2. Imprime por pantalla tu nombre y dos apellidos, cada uno en una línea.
        String apellido1 = "Gonzalez";
        String apellido2 = "Caballero";
        System.out.println(nombre);
        System.out.println(apellido1);
        System.out.println(apellido2);
        //3.a Repite el ejercicio anterior pero imprimiendo todo en la misma línea.
        System.out.print(nombre + apellido1 + apellido2);
        //3.b Repite el ejercicio anterior imprimiendo todo en la misma línea, usando
        //tres instrucciones de impresión.
        System.out.print(nombre);
        System.out.print(apellido1);
        System.out.print(apellido2);
        //4. Imprime tu edad.
        int edad = 20;
        System.out.println(edad);
        //5. Imprime el primer digito de tu edad en una línea, y el segundo en otra.
        char digito1 = '2';
        char digito2 = '0';
        System.out.println(digito1);
        System.out.println(digito2);
        //6. Imprime el primer digito de tu edad. Tras ello y con una nueva instrucción,
        //imprime el segundo. Tienen que aparecer ambos en la misma línea
        System.out.print(digito1);
        System.out.print(digito2);
        //7. Imprime al revés tu nombre, de forma que cada letra aparezca en una línea.
        char ultima = 'l';
        char penultima = 'e';
        char antepenultima = 'u';
        char medio = 'n';
        char segunda = 'a';
        char primera = 'M';
        System.out.println(ultima);
        System.out.println(penultima);
        System.out.println(antepenultima);
        System.out.println(medio);
        System.out.println(segunda);
        System.out.println(primera);
        //8. Repite lo anterior, pero entre cada letra debe aparecer una línea en blanco.
        System.out.println( );
        System.out.println(ultima);
        System.out.println( );
        System.out.println(penultima);
        System.out.println( );
        System.out.println(antepenultima);
        System.out.println( );
        System.out.println(medio);
        System.out.println( );
        System.out.println(segunda);
        System.out.println( );
        System.out.println(primera);
        //9. Imprime por pantalla tu nombre concatenándolo con tu edad, de forma que quede
        //un espacio en blanco entre ambos.
        System.out.println(nombre + " " + edad);
        //10. Imprime por pantalla el número 3 concatenándolo con el número 7. Comprueba
        //si tu compañero lo ha hecho igual que tú.
        System.out.println("3" + "7");
        //11. Imprime por pantalla la cadena "Hola mundo" y a continuación, la cadena
        //"Hola\nmundo". ¿Para qué sirve el '\n'? ¿Puede utilizarse varias veces seguidas?
        System.out.println("Hola mundo");
        System.out.println("Hola\nmundo");
        //Para saltar de linea
        System.out.println("Hola\nmun\ndo");
        //Sí

    }
}
