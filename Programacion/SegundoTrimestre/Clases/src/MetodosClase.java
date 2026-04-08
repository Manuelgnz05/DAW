import java.util.Scanner;

public class MetodosClase {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        //1
        System.out.println(duplicar(3));

        //2
        saludar("Manuel");

        //3, 4
        saludar();

        //5
        imprimirCabecera("ejercicio 5");

        //6
        imprimirCabecera("ejercicio 2", 4);

        //7
        tablaMultiplicar(2);

        //8
        System.out.println(esPositivo(2));

        //9
        System.out.println(contarPositivos());

        //10
        System.out.println(areaRectangulo(2, 7));

        //11
        System.out.println(areaCuadrado(5));

        //12
        System.out.println(areaTriangulo(2, 7));

        //13
        System.out.println(areaTriangulo());

        //14
        System.out.println(eurosDolares(7));

        //15
        System.out.println(dolaresEuros(7));

        //16
        System.out.println(librasEuros(7));

        //17
        System.out.println(numeroPosicion(14325, 4));

        //18
        System.out.println(stringReves("cadena"));

        //19
        esPalindromo("amor a roma");

        //20
        System.out.println(factorial(4));

        //21
        System.out.println(numCombinatorio(3, 4));

        //22
        System.out.println(vecesRepite("de de de de papapa de", "de"));

        //23
        int[] arrayInt = {3,12,7,9};
        imprimirArray(arrayInt);

        //24
        imprimirArrayTabla(arrayInt);

        //25
        oredenarArray(arrayInt);

        //26
        int[] arrInt = {3,4,7,9};
        buscarArrayLineal(arrInt, 4);

        //27
        buscarArrayBinaria(arrInt, 3);

        //28
        int[] ar = {3, 8, 9};
        int[] arr = meterNumArray(ar, 13, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        //29
        int[] array1 = {7,2,1,0};
        int[] array2 = {3,2,2,7,6};
        copiarArray(array1, array2, 3);

    }
  //1. Crear un método estático que tenga la siguiente firma:
    //public static float duplicar(float num)
    //e implementarlo: el método debe devolver el valor num multiplicado por 2.

    public static float duplicar(float num){
        return num*2;
    }

    //2. Crear un método estático que tenga la siguiente firma:
    //public static void saludar(String nombre)
    //e implementarlo: el método debe imprimir por pantalla la cadena “Hola
    //nombre”, donde nombre será la cadena que se recibe como argumento.

    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }

    //3. Observe la siguiente firma y responda antes de desarrolar cualquier código:
    //public static void saludar()
    //¿Le dará algún error si crea este método justo debajo del método del ejercicio
    //anterior? Piense que se llaman igual y que devuelven lo mismo. Desarrolle a
    //continuación el método dejando el cuerpo vacío. ¿Ocurre lo que pensó antes?
    //¿Por qué?

    //No dara ningún error ya que la firma no es igual al completo
    //No, porque no tiene la misma firma

    //4. Desarrolle el cuerpo del método anterior. El método únicamente imprime por
    //pantalla la palabra Hola, pero debe hacerlo mediante una llamada al método
    //del ejercicio 2.

    public static void saludar(){
        saludar("");
    }

    //5. Crear un método que se utilice para poder separar con claridad el final de un
    //ejercicio del boletín y el comienzo del siguiente, de forma que cuando se llame
    //a este método de la siguiente forma:
    //imprimirCabecera(“ejercicio 5”);
    //se imprima por pantalla lo siguiente:
    //******************
    //EJERCICIO 5
    //******************

    public static void imprimirCabecera(String ejercicio){
        for (int i = 0; i < 18; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println(ejercicio.toUpperCase());
        for (int i = 0; i < 18; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //6. Modificar el ejercicio anterior, para que el método reciba un segundo
    //argumento de tipo int, que serán la cantidad de asteriscos que deben
    //imprimirse en cada una de las dos líneas. De esta forma, cuando se llame a este
    //método de la siguiente forma:
    //imprimirCabecera(“ejercicio 2”, 4);
    //se imprima por pantalla lo siguiente:
    //****
    //EJERCICIO 2
    //****

    public static void imprimirCabecera(String ejercicio, int numero){
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println(ejercicio.toUpperCase());
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //7. Crear un método estático que reciba un número e imprima la tabla de
    //multiplicar de dicho número con el siguiente formato (ejemplo para una
    //entrada de 2):
    //=========================
    //TABLA DE MULTIPLICAR DEL 2
    //=========================
    //2 x 0 = 0
    //2 x 1 = 2
    //2 x 2 = 4
    //…
    //2 x 10 = 20
    //=========================
    //Pruebe el método imprimiendo la tabla de multiplicar de todos los números del
    //1 al 10

    public static void tablaMultiplicar(int numero){
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("TABLA DE MULTIPLICAR DEL " + numero);
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero*i);
        }
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    //8. Crear un método estático de nombre esPositivo, que reciba un número entero
    //y devuelva un valor booleano indicando si el número es positivo (true) o no
    //(false).

    public static boolean esPositivo(int numero){
        return numero >= 0;
    }

    //9. Crear un método estático de nombre contarPositivos. Este método lee por
    //pantalla números enteros continuamente, y para únicamente cuando el usuario
    //introduce un cero. Cuando esto ocurre, el método devuelve la cantidad de
    //números positivos que el usuario ha introducido por pantalla.

    public static int contarPositivos(){
        int numero;
        int contador = 0;
        do {
            System.out.println("Introduce un numero: ");
            numero = scan.nextInt();
            if (numero > 0){
                contador++;
            }
        }while(numero != 0);
        return contador;
    }

    //10. Crear un método estático que reciba la base y la altura de un rectángulo y
    //devuelva su área.

    public static float areaRectangulo(float base, float altura){
        return (base*altura);
    }

    //11. Crear un método estático que reciba el lado de un cuadrado y devuelva su área.

    public static float areaCuadrado(float lado){
        return lado*lado;
    }

    //12. Crear un método estático que reciba la base y la altura de un triángulo y
    //devuelva su área.

    public static float areaTriangulo(float base, float altura){
        return (base*altura)/2f;
    }

    //13. Modificar el ejercicio anterior para que la base y altura del triángulo se lean por
    //teclado.

    public static float areaTriangulo(){
        System.out.println("Introduce una base: ");
        float base = scan.nextInt();
        System.out.println("Introduce una altura: ");
        float altura = scan.nextInt();
        return (base*altura)/2f;
    }

    //14. Crear un método estático que reciba un valor en euros y lo devuelva convertido
    //a dólares americanos.

    public static float eurosDolares(float euros){
        return euros*1.17f;
    }

    //15. Crear un método estático que haga lo contrario.

    public static float dolaresEuros(float dolares){
        return dolares*0.86f;
    }

    //16. Crear un método estático que reciba un valor en libras y lo devuelva convertido
    //a euros.

    public static float librasEuros(float libras){
        return libras*1.15f;
    }

    //17. Crear un método estático que reciba un número entero y una posición, y
    //devuelva el dígito que se encuentra en dicha posición.

    public static int numeroPosicion(int numero, int posicion) {
        String num = numero + "";
        int res = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i == posicion) {
                char nume = num.charAt(i);
                res = nume - '0';
            }
        }
        return res;
    }

    //18. Crear un método estático que reciba un String, y lo devuelva del revés.

    public static String stringReves(String cadena){
       return new StringBuilder(cadena).reverse().toString();
    }

    //19. Crear un método estático que reciba un String, y compruebe si es un
    //palíndromo. Debe usar el método del ejercicio anterior.

    public static void esPalindromo(String cadena){
        if (cadena.equalsIgnoreCase(stringReves(cadena))){
            System.out.println("Sí lo es");
        }else{
            System.out.println("No lo es");
        }
    }

    //20. Crear un método estático que reciba un número entero y devuelva el factorial
    //de dicho número.

    public static int factorial(int num){
        int res = num;
        for (int i = num - 1; i > 0; i--) {
            res = res * i;
        }
        return res;
    }

    //21. Crear un método estático que reciba dos números enteros n y r, y devuelva el
    //número combinatorio n sobre r. Utilice para ello el método creado en el
    //ejercicio anterior.

    public static float numCombinatorio(int n, int r){
        return (float) factorial(n) /(factorial(n - r) * factorial(r));
    }

    //22.Crear un método estático que reciba dos String, y cuente la cantidad de veces que
    // el segundo se repite en el primero.

    public static int vecesRepite(String cad1, String cad2){
        int inicio = 0;
        int res = 0;
        for (int i = 0; i < cad1.length(); i++) {
            if (cad1.indexOf(cad2, inicio) >= 0){
                inicio = cad1.indexOf(cad2, inicio) + cad2.length();
                res++;
            }
        }
        return res;
    }

    //23. Crear un método estático que reciba un array de algún tipo primitivo y lo
    //imprima por pantalla.

    public static void imprimirArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //24. Cree un método que reciba un array de enteros, y por cada entero del array
    //imprima su tabla de multiplicar.

    public static void imprimirArrayTabla(int[] array){
        for (int i = 0; i < array.length; i++) {
            tablaMultiplicar(array[i]);
        }
    }

    //25. Crear un método que reciba un array 1D de enteros y lo ordene.

    public static void oredenarArray(int[] array){

        int num = 1;
        while(num < array.length){
            int temp;
            for (int i = 0; i < array.length - num; i++) {
                if(array[i] > array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            num++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //26. Crear un método que reciba un array 1D de enteros y un número, y busque
    //dicho número en el array (búsqueda lineal).

    public static void buscarArrayLineal(int[] array, int num){
        int posicion = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                posicion = i;
                break;
            }
        }
        System.out.println(posicion);
    }

    //27. Repetir el anterior, pero haciendo una búsqueda binaria. Tenga en cuenta los
    //requisitos de este tipo de búsqueda.

    public static void buscarArrayBinaria(int[] array, int elemento){

        int posicion = busquedaBinaria(array, elemento);
        System.out.println(posicion);
    }
    public static int busquedaBinaria(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin)/2;

            if (arr[medio] == objetivo) {
                return medio; // encontrado
            }

            if (arr[medio] < objetivo) {
                inicio = medio + 1; // buscar en la mitad derecha
            } else {
                fin = medio - 1; // buscar en la mitad izquierda
            }
        }

        return -1;
    }

    //28. Crear un método que reciba un array de enteros, un número y una posición, y
    //devuelva un nuevo array que tenga los mismos contenidos del original, pero
    //con sus elementos desplazados a partir de la posición especificada, donde se
    //almacenará además el número pasado en el segundo argumento.
    //Por ejemplo, si el método recibe los siguientes datos:
    //[3, 8, 9]
    //Número: 13
    //Posición: 1
    //El nuevo array devuelto por el método debe ser el siguiente:
    //[3, 13, 8, 9]

    public static int[] meterNumArray(int[] array, int num, int pos){
        int[] arr = new int[array.length + 1];
        int cont = 0;
        for (int i = 0; i < arr.length; i++, cont++) {
            if (i == pos){
                arr[i] = num;
                cont--;
            }else {
                arr[i] = array[cont];
            }
        }
       return arr;
    }

    public static int[] meterNumArray2(int[] array, int num, int pos){
        int[] arr = new int[array.length + 1];

        for (int i = 0; i < pos; i++) {
            arr[i] = array[i];

        }
        arr[pos] = num;
        for (int i = pos; i < array.length; i++) {
            arr[i+1] = array[i];
        }

        return arr;
    }

    //29. Crear un método que reciba dos arrays y un entero, y copie tantos elementos
    //del segundo array en el primer array como diga el entero, comenzando desde
    //la posición cero en ambos. Suponga que no se saldrá de los límites.
    //Por ejemplo, si array1 = [7,2,1,0] y array2 = [3,2,2,7,6] y entero=3, al acabar el
    //método el primer array se modificará y su contenido será array1 = [3,2,2,0] (en
    //negrita están las posiciones que se han modificado).

    public static void copiarArray(int[] array1, int[] array2, int num) {
        for (int i = 0; i < num; i++) {
                array1[i] = array2[i];
        }
        imprimirArray(array1);
    }


    //30. Repetir lo anterior, pero añadiendo un cuarto argumento, que indique la
    //posición del segundo array a partir de la cual se empezará.

    //31. Repetir lo anterior, pero añadiendo un quinto argumento, que indique la
    //posición del primer array a partir de la cual se empezará

}
