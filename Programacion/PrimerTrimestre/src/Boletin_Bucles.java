import java.util.Scanner;

public class Boletin_Bucles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1

        //10
//        int var=0;
//        while(var<10) {
//            System.out.println(var);
//            var++;
//        }
//
//        //21
//        for(int i=20; i>=0; i--) {
//            System.out.println(i);
//        }
//
//        //17
//        int num=15;
//        for(int i=0;i<17;i++) {
//            System.out.println(num);
//        }
//
//        //31
//        var=30;
//        while(var>=0) {
//            System.out.println(var);
//            var--;
//        }
//
//        //5
//        for(int i=0; i<10; i+=2) {
//            System.out.println(i);
//        }
//
//        //Nada
//        var=70;
//        while(var>=0); {
//            var--;
//            System.out.println(var);
//        }
//
//        //3
//        for(int i=0; i<10;i+=2) {
//            System.out.println(i);
//            i++;
//        }

        //2. Traduce cada bucle for a su correspondiente while, y cada while a su for.

//        int var=0;
//        while(var<10) {
//            System.out.println(var);
//            var++;
//        }

        for(int var2=0; var2<10; var2++){
            System.out.println(var2);
        }
//
//        //21
//        for(int i=20; i>=0; i--) {
//            System.out.println(i);
//        }

        int i2 = 20;
        while(i2>=0){
            System.out.println(i2);
            i2--;
        }
//
//        //17
//        int num=15;
//        for(int i=0;i<17;i++) {
//            System.out.println(num);
//        }

        int num2 = 15;
        int i3 = 0;
        while(i3<17){
            System.out.println(num2);
            i3++;
        }
//
//        //31
//        var=30;
//        while(var>=0) {
//            System.out.println(var);
//            var--;
//        }

        for(int var=0;var>=0;var--){
            System.out.println(var);
        }
//
//        //5
//        for(int i=0; i<10; i+=2) {
//            System.out.println(i);
//        }

        int i4 = 0;
        while(i4<10){
            System.out.println(i4);
            i4 +=2;
        }
//
//        //71
//        var=70;
//        while(var>=0); {
//            var--;
//            System.out.println(var);
//        }
        for(int var = 70;var>=0;var--){
            System.out.println(var);
        }
//
//        //3
//        for(int i=0; i<10;i+=2) {
//            System.out.println(i);
//            i++;
//        }

        int i5 = 0;
        while(i5<10){
            System.out.println(i5);
            i5++;
        }

        // 3. Modifica el código para que cada bucle cuente las iteraciones y, una vez haya
        //terminado cada bucle, se imprima el número de iteraciones.

        int var=0;
        int contador = 0;
        while(var<10) {
            System.out.println(var);
            var++;
            contador++;
            System.out.println(contador);
        }

        //21
        int contador2 = 0;
        for(int i=20; i>=0; i--) {
            System.out.println(i);
            contador2++;
            System.out.println(contador2);
        }

        //17
        int num=15;
        int contador3 = 0;
        for(int i=0;i<17;i++) {
            System.out.println(num);
            contador3++;
            System.out.println(contador3);
        }

        //31
        var=30;
        int contador4 = 0;
        while(var>=0) {
            System.out.println(var);
            var--;
            contador4++;
            System.out.println(contador4);
        }

        //5
        int contador5 = 0;
        for(int i=0; i<10; i+=2) {
            System.out.println(i);
            contador5++;
            System.out.println(contador5);
        }

        //71
        int contador6 = 0;
        var=70;
        while(var>=0); {
            var--;
            System.out.println(var);
            contador6++;
            System.out.println(contador6);
        }

        //3
        int contador7 = 0;
        for(int i=0; i<10;i+=2) {
            System.out.println(i);
            i++;
            contador7++;
            System.out.println(contador7);
        }

        //4. Crea un programa que lea un número, e imprima en una misma línea tantos ceros
        //como diga el número. Por ejemplo: si se lee el 3 debe imprimirse:
        //0 0 0

        /*
        System.out.println("Introduce un numero: ");
        int numero = scan.nextInt();
        for(int cont = 0;cont<numero;cont++){
            System.out.print("0 ");
        }
         */

        //5. Modifica el ejercicio 4 para que la primera columna siempre imprima un 1. Por
        //ejemplo, si se lee el 3 debe imprimirse:
        //1 0 0

        System.out.println("Introduce un numero: ");
        int numero2 = scan.nextInt();
        System.out.print("1 ");
        for(int cont = 1;cont<numero2;cont++){
            System.out.print("0 ");
        }

        //6. Modifica el ejercicio 4 para que la última columna siempre imprima un 1. Por ejemplo,
        //si se lee el 3 debe imprimirse:
        //0 0 1

        System.out.println("Introduce un numero: ");
        int numero3 = scan.nextInt();
        for(int cont = 0;cont<(numero3-1);cont++){
            System.out.print("0 ");
        }
        System.out.print("1 ");


        //7. Modifica el ejercicio 4 para que la columna central (o la más cercana en caso de no
        //haber central) siempre imprima un 1. Por ejemplo, si se lee el 3 debe imprimirse:
        //0 1 0

        System.out.println("Introduce un numero: ");
        int numero4 = scan.nextInt();
        int medio = numero4/2;
        for(int cont = 0;cont<(numero4);cont++){
            System.out.print("0 ");
            if(cont == medio){
                System.out.print("1 ");
            }
        }

        //8. Crea un programa que lea un número, y repita el ejercicio 4 tantas veces como diga
        //ese número. Por ejemplo: si se lee el 3 debe imprimirse:
        //0 0 0
        //0 0 0
        //0 0 0

//        System.out.println("Introduce un numero: ");
//        int numb = scan.nextInt();
//        for(int cont = 0; cont<numb; cont++){
//            for(int cont2 = 0;cont2<numb;cont2++){
//                System.out.print("0 ");
//            }
//        }

        //9. Modifica el ejercicio 8 para que la primera línea siempre imprima unos. Por ejemplo, si
        //se lee el 3 debe imprimirse:
        //1 1 1
        //0 0 0
        //0 0 0

//        System.out.println("Introduce un numero: ");
//        int numb = scan.nextInt();
//        for(int cont = 0; cont<numb; cont++){
//            for(int cont2 = 0;cont2<numb;cont2++){
//                if(cont == 0){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }
//            }
//        }

        //10. Modifica el ejercicio 8 para que la primera columna siempre imprima unos. Por
        //ejemplo, si se lee el 3 debe imprimirse:
        //1 0 0
        //1 0 0
        //1 0 0

        System.out.println("Introduce un numero: ");
        int numb = scan.nextInt();
        for(int cont = 0; cont<numb; cont++){
            for(int cont2 = 0;cont2<numb;cont2++){
                if(cont2 == 0){
                    System.out.println("1 ");
                }else{
                    System.out.println("0 ");
                }
            }
        }

        //19. Crea un programa que lea un número e imprima dicho número por pantalla siete
        //veces. Por ejemplo, si se lee el 6, debe imprimirse:
        //6
        //6
        //6
        //6
        //6
        //6
        //6

        System.out.println("Introduce un numero: ");
        int n = scan.nextInt();
        for(int cont = 0; cont<7;cont++){
            System.out.println(n);
        }

        //20. Modifica el programa para que el número se imprima tantas veces como diga el propio
        //número. Por ejemplo, si se lee el 4, debe imprimirse:
        //4
        //4
        //4
        //4

        System.out.println("Introduce un numero: ");
        int n2 = scan.nextInt();
        for(int cont = 0; cont<n2;cont++){
            System.out.println(n2);
        }

        //21. Modifica el ejercicio anterior, para que además del número se lea un carácter, y se
        //imprima dicho carácter tantas veces como diga el número. Por ejemplo, si se lee 3 y
        //‘A’, debe imprimirse:
        //A
        //A
        //A

        System.out.println("Introduce un numero: ");
        int n3 = scan.nextInt();
        System.out.println("Introduce un caracter: ");
        String letra = scan.next();
        for(int cont = 0; cont<n3;cont++){
            System.out.println(letra);
        }

        //22. Crea un programa que lea un número, e imprima por pantalla los primeros números
        //positivos. Por ejemplo, si se lee el 5 debe imprimirse:
        //1
        //2
        //3
        //4
        //5

//        System.out.println("Introduce un numero: ");
//        int n4 = scan.nextInt();
//        for(int cont = 1; cont<=n4; cont++){
//            System.out.println(cont);
//        }

        //23. Modifica el ejercicio anterior para que se imprima todo en la misma línea.

        System.out.println("Introduce un numero: ");
        int n4 = scan.nextInt();
        for(int cont = 1; cont<=n4; cont++){
            System.out.print(cont + " ");
        }

        //24. Crea un programa que lea un número, e imprima por pantalla los primeros números
        //pares. Por ejemplo, si se lee el 5 debe imprimirse:
        //2
        //4
        //6
        //8
        //10

        /*
        System.out.println("Introduce un numero: ");
        int n5 = scan.nextInt();
        int par = 2;
        for(int cont = 0; cont<n5;cont++){
            System.out.println(par);
            par += 2;
        }
        */

        //25. Modifica el ejercicio anterior para que imprima los primeros números impares.

        /*
        System.out.println("Introduce un numero: ");
        int n5 = scan.nextInt();
        int impar = 1;
        for(int cont = 0; cont<n5;cont++){
            System.out.println(impar);
            impar += 2;
        }
        */

        //26. Modifica los dos anteriores para que todo se imprima en la misma línea, pero
        //separando los números por coma en lugar de espacios en blanco.

        System.out.println("Introduce un numero: ");
        int n5 = scan.nextInt();
        int par = 2;
        for(int cont = 0; cont<n5;cont++){
            System.out.print(par + ",");
            par += 2;
        }


//        System.out.println("Introduce un numero: ");
//        int n5 = scan.nextInt();
//        int impar = 1;
//        for(int cont = 0; cont<n5;cont++){
//            System.out.println(impar + ",");
//            impar += 2;
//        }


    }
}
