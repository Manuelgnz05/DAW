public class Boletin_variables_2 {
    public static void main(String[] args) {
        //EJERCICIO 1

        //1. Crea una variable de tipo entero y asígnale el valor 10.
        int valor = 10;
        //2. Imprímela por pantalla.
        System.out.println(valor);
        //3. Decrementa su valor una vez.
        valor--;
        //4. Imprímela por pantalla.
        System.out.println(valor);
        //5. Multiplícalo por dos.
        valor = valor*2;
        //6. Réstale cuatro unidades.
        valor--;
        valor--;
        valor--;
        valor--;
        //7. Imprímela por pantalla.
        System.out.println(valor);
        //8. Incrementa su valor cuatro veces usando el operador de incremento (++).
        valor++;
        valor++;
        valor++;
        valor++;
        //9. Imprímela por pantalla.
        System.out.println(valor);
        //10. Crea una segunda variable y asígnale el resultado de sumar una unidad a la primera.
        int valor2 = 1+valor;
        //11. Imprime las dos variables.
        System.out.println(valor);
        System.out.println(valor2);
        //12. Divide la segunda entre dos.
        valor2 = valor2/2;
        //13. Imprime las dos variables y comprueba si el resultado es el correcto comparando con otros
        //compañeros.
        System.out.println(valor);
        System.out.println(valor2);


        //EJERCICIO 2
        //Desarrollar un algoritmo para calcular el área de un rectángulo, cuya fórmula es base x altura.
        //Para ello:

        //1. Cree una variable para almacenar el valor de la base, y asigne un valor.
        int base = 10;
        //2. Cree una variable para almacenar el valor de la altura, y asigne un valor.
        int altura = 5;
        //3. Cree una variable para almacenar el área, y utilice la fórmula anterior para asignarle el valor
        //adecuado.
        int area = base*altura;
        //4. Imprima por pantalla el área, utilizando una instrucción println.
        System.out.println(area);
        //5. Tenga en cuenta que debe elegir el tipo adecuado para cada variable.

        //EJERCICIO 3

        //Desarrollar un algoritmo para convertir de euros a dólares teniendo en cuenta que un euro son
        //1.16 dólares. Para ello:

        //1. Cree una variable para almacenar el factor de conversión (1.16).
        float conv = 1.16f;
        //2. Cree una variable para almacenar la cantidad de euros (no asigne ningún valor aún).
        float euros;
        //3. Utilice una instrucción de asignación para darle un valor a la variable anterior.
        euros = 15.70f;
        //4. Cree una variable para almacenar la cantidad de dólares, y asigne el resultado de multiplicar
        float dolares = conv * euros;
        //5. Imprima por pantalla el resultado, utilizando una instrucción println.
        System.out.println(dolares);


        //EJERCICIO 4

        //Modifique el ejercicio 2 para ahorrarnos la creación de la variable del área. Para ello:
        //elimine dicha variable, y ponga en la instrucción println la fórmula del área directamente.

        //1. Cree una variable para almacenar el valor de la base, y asigne un valor.
        int base2 = 10;
        //2. Cree una variable para almacenar el valor de la altura, y asigne un valor.
        int altura2 = 5;
        //3. Imprima por pantalla el área, utilizando una instrucción println.
        System.out.println(base2*altura2);
        //4. Tenga en cuenta que debe elegir el tipo adecuado para cada variable.


        //EJERCICIO 5

        //Modifique el ejercicio 3 para ahorrarnos la creación de la variable del factor de conversión.
        System.out.println(dolares*1.16);


        //EJERCICIO 6

        //1. Cree una variable de tipo entero y asigne el valor 3.
        int entero = 3;
        //2. Decremente su valor tres veces con el operador de decremento (- -).
        entero--;
        entero--;
        entero--;
        //3. Incremente su valor 6 unidades con el operador de suma simplificada (+=).
        entero +=6;
        //4. Incremente su valor en una unidad utilizando el operador de incremento (++).
        entero++;
        //5. Duplique su valor como desee.
        entero = entero*2;
        //6. Utilice el operador módulo (%) para comprobar el resto de dividir la variable entre 2,
        //imprimiendo por pantalla el resultado.
        System.out.println(entero%2);
        //7. ¿Cómo se puede comprobar si un número es par o impar?
        //Usando el operador % si al dividirlo por 2 y da 0 es par y si da 1 es impar.
        //Por ello al dar 0 el entero es un número par.


    }
}
