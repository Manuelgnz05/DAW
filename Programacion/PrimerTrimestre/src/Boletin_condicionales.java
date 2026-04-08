import java.util.Scanner;


public class Boletin_condicionales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Introduce una edad: ");
        int edad = scan.nextInt();
        if (edad>=18){
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        System.out.println("Introduce un número");
        int num = scan.nextInt();
        System.out.println("Introduce un número");
        int num2 = scan.nextInt();
        if (num>=num2){
            System.out.println("El primero es mayor o igual que el segundo");
        } else{
            System.out.println("El segundo es mayor que el primero");
        }

        //Comprobar si un numero es negativo, 0, o positivo

        System.out.println("Introduce un numero");
        int num3 = scan.nextInt();
        if(num3<0){
            System.out.println("Negativo");
        } else if (num3>0){
            System.out.println("Positivo");
        }else{
            System.out.println("Es 0");
        }

        //Leer dos numero y imprimir el mayor de ellos

        System.out.println("Introduce un numero");
        int num4 = scan.nextInt();
        System.out.println("Introduce un numero");
        int num5 = scan.nextInt();
        if (num4 > num5){
            System.out.println(num4);
        } else {
            System.out.println(num5);
        }



        int valor = 3;

        switch(valor) {
            case 0: System.out.println("Vale 0"); break;
            case 1: System.out.println("Vale 1"); break;
            case 2: System.out.println("Vale 2"); break;
            case 3: System.out.println("Vale 3"); break;
            default: System.out.println("Por defecto"); break;
        }


        // 1. Leer dos números enteros e imprimir el mayor de ellos.

        System.out.println("Introduce un numero");
        int valor1 = scan.nextInt();
        System.out.println("Introduce un numero");
        int valor2 = scan.nextInt();
        if (valor1 > valor2){
            System.out.println(valor1);
        } else {
            System.out.println(valor2);
        }

        //2. Leer un entero y comprobar si es negativo o positivo,
        // imprimiendo por pantalla una frase al respecto.
        // Considere el cero como positivo.

        System.out.println("Introduce un numero");
        int valor3 = scan.nextInt();
        if(valor3<0){
            System.out.println("Negativo");
        } else if (valor3>0){
            System.out.println("Positivo");
        }else{
            System.out.println("Es 0");
        }

        //3. Modifique el ejercicio anterior para que,
        // en caso de introducir un cero, se imprima
        //por pantalla un mensaje específico.



        //4. Leer una edad y comprobar si la persona es mayor de edad,
        // imprimiendo una frase
        //al respecto. Si es menor, imprimir también un mensaje.

        System.out.println("Introduce tu edad");
        int edad4 = scan.nextInt();
        if (edad4<18){
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }

        //5. Modificar el ejercicio anterior para que además se compruebe si
        // es jubilado (tiene más de 67 años), imprimiendo un mensaje al respecto.

        System.out.println("Introduce una edad: ");
        int edad2 = scan.nextInt();
        if (edad2>=18){
            System.out.println("Mayor de edad");
        } else if (edad2<18){
            System.out.println("Menor de edad");
        } else if (edad2>=67){
            System.out.println("Jubilado");
        }

        //6. Modificar el ejercicio anterior para que solo se permita una
        // edad válida (0 a 120). En caso de ser válida hará todo
        //  lo implementado anteriormente. En caso de ser
        //inválida, se imprimirá un mensaje de error y el programa acabará.

        System.out.println("Introduce una edad: ");
        int edad3 = scan.nextInt();
        if (edad<=120 && edad>=0){
            if (edad3>=18){
                System.out.println("Mayor de edad");
            } else if (edad3<18){
                System.out.println("Menor de edad");
            } else if (edad3>=67){
                System.out.println("Jubilado");
            }
        } else {
            System.out.println("ERROR");
        }



        //7. Leer seis números y comprobar si coinciden con la combinación ganadora de la
        //primitiva (1, 3, 10, 20, 33, 40), imprimiendo un mensaje al respecto.

        System.out.println("Introduce un numero");
        int p = scan.nextInt();
        System.out.println("Introduce un numero");
        int p2 = scan.nextInt();
        System.out.println("Introduce un numero");
        int p3 = scan.nextInt();
        System.out.println("Introduce un numero");
        int p4 = scan.nextInt();
        System.out.println("Introduce un numero");
        int p5 = scan.nextInt();
        System.out.println("Introduce un numero");
        int p6 = scan.nextInt();

        if ((p == 1) && (p2 == 3) && (p3 == 10) && (p4 == 20) && (p5 == 33) && (p6 == 40)){
            System.out.println("Combinacion ganadora");
        }else{
            System.out.println("Combinacion no ganadora");
        }

        //8. Modificar el ejercicio anterior para que, al leerlos,
        // se compruebe si todos los números leídos tienen el rango
        // apropiado (entre 1 y 49). Si no lo tienen, imprimir un
        //mensaje de error y el programa acabará.

        if ((p<=49 && p>=1) && (p2<=49 && p2>=1) && (p3<=49 && p3>=1) && (p4<=49 && p4>=1) && (p5<=49 && p5>=1) && (p6<=49 && p6>=1)){
            if ((p == 1) && (p2 == 3) && (p3 == 10) && (p4 == 20) && (p5 == 33) && (p6 == 40)){
                System.out.println("Combinacion ganadora");
            }else{
                System.out.println("Combinacion no ganadora");
            }
        }


        //9. Leer por pantalla un entero y comprobar si es par o impar
        // (use el operador resto %).

        System.out.println("Introduce un entero");
        int entero = scan.nextInt();
        if(entero%2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }

        //10. Crear un programa que calcule el índice de masa corporal. Lea los datos que sean
        //necesarios, imprima por pantalla el índice, y dependiendo de su valor imprima al
        //usuario un mensaje informativo. Por ejemplo: está por debajo de lo normal, está
        //normal o está por encima de lo normal.

        System.out.println("Introduce una altura en metros");
        float altura = scan.nextFloat();
        System.out.println("Introduce un peso en kg");
        float peso = scan.nextFloat();
        float indice = peso/(altura*altura);
        if(indice<18.5f){
            System.out.println("Esta por debajo de lo normal");
        }else if ((indice >= 18.5f) && (indice <=24.9f)){
            System.out.println("Esta normal");
        } else if (indice>=25f && indice<=34.9f) {
            System.out.println("Esta por encima de lo normal");
        }else{
            System.out.println("Obesidad");
        }

        //11. Leer por pantalla un número entre 1 y 12 e imprimir por
        // pantalla el nombre del mes correspondiente. En caso de leer un número
        // fuera de rango, imprimir por pantalla un mensaje de error.

        System.out.println("Introduce un entero entre 1 y 12");
        int entero2 = scan.nextInt();
        if (entero2 == 1){
            System.out.println("Enero");
        }else if (entero2 == 2){
            System.out.println("Febrero");
        }else if (entero2 == 3) {
                System.out.println("Marzo");
        }else if (entero2 == 4) {
            System.out.println("Abril");
        }else if (entero2 == 5) {
            System.out.println("Mayo");
        }else if (entero2 == 6) {
            System.out.println("Junio");
        }else if (entero2 == 7) {
            System.out.println("Julio");
        }else if (entero2 == 8) {
            System.out.println("Agosto");
        }else if (entero2 == 9) {
            System.out.println("Septiembre");
        }else if (entero2 == 10) {
            System.out.println("Octubre");
        }else if (entero2 == 11) {
            System.out.println("Noviembre");
        }else if (entero2 == 12) {
            System.out.println("Diciembre");
        }else {
            System.out.println("Error");
        }


        //12. Establezca un número entre 0 y 9999, que servirá como contraseña.
        // Puede elegir el que desee. Pida por pantalla un número y si coincide
        // escriba “Contraseña correcta, accediendo al sistema”, en caso contrario
        // escriba “Contraseña incorrecta, cerrando sesión”.

        System.out.println("Introduce la contraseña");
        int contrasena = scan.nextInt();
        if (contrasena == 6302){
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }

        //13. Desarrolle un sistema de cálculo de descuentos para una farmacia. Cuando el
        //usuario introduzca un precio, usted deberá aplicar un descuento del 15% a ese
        //valor, e imprimir por pantalla el precio final. Recuerde que
        // debe imprimir el precio final tras aplicar el descuento,
        // no la cantidad que se descuenta.

        System.out.println("Introduce precio");
        float precio = scan.nextFloat();
        float precioDescuento = precio*0.75f;
        System.out.println("El precio final es" + precioDescuento);

        //14. Modifique el anterior para que además se imprima la cantidad que se descuenta.

        float descontado = precio*0.15f;
        System.out.println("El precio final es" + precioDescuento + "la cantidad descantada es" + descontado);

//        15. Diseñe un programa que lea la temperatura en centígrados del
//        día e imprima el tipo de clima de acuerdo a la siguiente tabla.

        System.out.println("Introduce temperatura");
        int tp = scan.nextInt();
        if(tp<=10){
            System.out.println("Frio");
        } else if(tp<=20 && tp>10){
            System.out.println("Nublado");
        } else if (tp<=30 && tp>20) {
            System.out.println("Caluroso");
        } else if (tp>30) {
            System.out.println("Tropical");
        }

//        16. Pedir un número entre 0 y 99999 y decir cuántas cifras tiene.
//        Suponga que se introducirán números en ese rango.

        System.out.println("Introduce un numero");
        int numero = scan.nextInt();
        if (numero<10){
            System.out.println("Tiene una cifra");
        } else if (numero>=10 && numero<100) {
            System.out.println("Tiene dos cifras");
        } else if (numero>=100 && numero<1000) {
            System.out.println("Tiene tres cifras");
        } else if (numero>=1000 && numero<10000) {
            System.out.println("Tiene cuatro cifras");
        }

//        17. La universidad ha categorizado las matrículas de acuerdo a la
//        facultad que va a estudiar el postulante. Ingrese por teclado el nombre
//        de la facultad donde va a estudiar, y muestre el importe y la mensualidad.
//        (Use el control switch-case, y recuerde que el nombre que introduzca debe
//        coincidir exactamente con el nombre de universidad).

        System.out.println("Introduce el nombre de la universidad");
        String nombre = scan.next();
        int importe;
        int mensualidad;
        if(nombre.equals("Ing. de Sistemas")){
            importe = 350;
            mensualidad = 650;
            System.out.println("El importe es" + importe + "la mensualidad es" + mensualidad);
        }else if(nombre.equals("Derecho")){
            importe = 300;
            mensualidad = 550;
            System.out.println("El importe es" + importe + "la mensualidad es" + mensualidad);
        }else if(nombre.equals("Ing. Naviera")){
            importe = 300;
            mensualidad  =500;
            System.out.println("El importe es" + importe + "la mensualidad es" + mensualidad);
        }else if(nombre.equals("Ing. Pesquera")){
            importe = 310;
            mensualidad = 460;
            System.out.println("El importe es" + importe + "la mensualidad es" + mensualidad);
        }else if(nombre.equals("Contabilidad")){
            importe = 280;
            mensualidad = 490;
            System.out.println("El importe es" + importe + "la mensualidad es" + mensualidad);
        }else if(nombre.equals("administracion")){
            importe = 360;
            mensualidad = 520;
            System.out.println("El importe es" + importe + "la mensualidad es" + mensualidad);
        }


//        18. Escriba programa para ingresar 4 notas de un alumno, calcular y
//        mostrar su promedio, sabiendo que la primera y segunda tiene 20% de
//        peso cada una, la tercera y cuarta tienen 30% de peso cada una.

        System.out.println("Introduce las 4 notas");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();
        float nota4 = scan.nextFloat();
        float notaMedia = (nota1*0.2f) + (nota2*0.2f) + (nota3*0.3f) + (nota4*0.3f);
        System.out.println("La nota media es" + notaMedia);

//        19. Desarrolle un programa que pida cuantos hombres y mujeres hay en un aula y
//        permita calcular el porcentaje de hombres y mujeres.

        System.out.println("Introduzca el numero de hombre");
        int hombres = scan.nextInt();
        System.out.println("Introduzca el numero de mujeres");
        int mujeres = scan.nextInt();
        int total = hombres + mujeres;
        float porcentaje_h = (hombres/total)*100f;
        float porcentaje_m  = (mujeres/total)*100f;
        System.out.println("El porcentaje de hombres es" + porcentaje_h);
        System.out.println("El porcentaje de mujeres es" + porcentaje_m);

//        20. A partir de aquí, los ejercicios son complicados. No se frustre si no le salen.

//        21. Leer por pantalla dos números enteros, e intercambiar sus valores (swapping).

        int entero3 = scan.nextInt();
        int entero4 = scan.nextInt();
        int enter = 0;
        enter = entero4;
        entero4 = entero3;
        entero3 = enter;


//        22. Leer por pantalla dos números enteros, e imprimirlos por pantalla en
//        orden creciente.
        int entero5 = scan.nextInt();
        int entero6 = scan.nextInt();
        if(entero5>entero6){
            System.out.println(entero6 + "," + entero5);
        }else{
            System.out.println(entero5 + "," + entero6);
        }

//        23. Leer por pantalla tres números enteros, e imprimirlos por pantalla en orden
//        creciente.

        System.out.println("Introduce 3 números");
        int entero7 = scan.nextInt();
        int entero8 = scan.nextInt();
        int entero9 = scan.nextInt();
        if(entero7>entero8 && entero7>entero9){
            if(entero8>entero9){
                System.out.println(entero7 + "," + entero8 + "," + entero9);
            }else{
                System.out.println(entero7 + "," + entero9 + "," + entero8);
            }
        }else if(entero8>entero7 && entero8>entero9){
            if(entero7>entero9){
                System.out.println(entero8 + "," + entero7 + "," + entero9);
            }else{
                System.out.println(entero8 + "," + entero9 + "," + entero7);
            }
        } else if (entero9>entero8 && entero9>entero7) {
            if(entero8>entero7){
                System.out.println(entero9 + "," + entero8 + "," + entero7);
            }else{
                System.out.println(entero9 + "," + entero7 + "," + entero8);
            }
        }

//        24. Repetir el ejercicio anterior, e imprimirlos en orden decreciente.

        if(entero7<entero8 && entero7<entero9){
            if(entero8<entero9){
                System.out.println(entero7 + "," + entero8 + "," + entero9);
            }else{
                System.out.println(entero7 + "," + entero9 + "," + entero8);
            }
        }else if(entero8<entero7 && entero8<entero9){
            if(entero7<entero9){
                System.out.println(entero8 + "," + entero7 + "," + entero9);
            }else{
                System.out.println(entero8 + "," + entero9 + "," + entero7);
            }
        } else if (entero9<entero8 && entero9<entero7) {
            if(entero8<entero7){
                System.out.println(entero9 + "," + entero8 + "," + entero7);
            }else{
                System.out.println(entero9 + "," + entero7 + "," + entero8);
            }
        }
//
//        25. Lea un número por pantalla y determine si es múltiplo de 10
//        (use el operador resto %).

        System.out.println("Introduce un numero entero");
        int entero10 = scan.nextInt();
        if(entero10%10 == 0){
            System.out.println("Es multiplo de 10");
        }else{
            System.out.println("No es multiplo de 10");
        }

//        26. Leer por pantalla un número de tres cifras, e imprimir cada una de sus
//        cifras en una línea.

        System.out.println("Introduce un numero de 3 cifras: ");
        int cifras = scan.nextInt();
        if (cifras<1000 && cifras>=100){
            System.out.println("Primera cifra: " + (cifras/100));
            System.out.println("Segunda cifra: " + ((cifras/10)%10));
            System.out.println("Tercera cifra: " + (cifras%10));
        }

//        27. Crea una aplicación llamada CalculadoraInversa, que lea por pantalla
//        dos operandos (int) y un signo aritmético (String), y según este último
//        se realizará la operación correspondiente. Al final mostrará el resultado
//        en consola. Los signos aritméticos disponibles son:
//        +: suma los dos operandos.
//        -: resta los operandos.
//                *: multiplica los operandos.
//                /: divide los operandos, este debe dar un resultado con decimales (double)
//                %: resto, resto de la división entre operando1 y operando2.
//                Para leer por pantalla usar nextInt y next.

        System.out.println("Introduce un número: ");
        int operador1 = scan.nextInt();
        System.out.println("Introduce un número: ");
        int operador2 = scan.nextInt();
        System.out.println("Introduce una operacion aritmetica: ");
        String signo = scan.next();
        if (signo.equals("+")){
            System.out.println("El resultado es: " + (operador1 + operador2));
        } else if (signo.equals("-")) {
            System.out.println("El resultado es: " + (operador1 - operador2));
        } else if (signo.equals("*")) {
            System.out.println("El resultado es: " + (operador1 * operador2));
        } else if (signo.equals("/")) {
            System.out.println("El rsultado es: " + (operador1/ (float)(operador2)));
        }else if (signo.equals("%")){
            System.out.println("El resultado: " + (operador1%operador2));
        }else{
            System.out.println("ERROR");
        }


//        28. En un casino de juegos se desea mostrar los mensajes respectivos por
//        el puntaje obtenido en el lanzamiento de tres dados de un cliente, de
//        acuerdo a los siguientes resultados:
//        Si los tres dados son seis, mostrar el mensaje “Muy buena suerte”
//        Si dos dados son seis, mostrar el mensaje “Buena suerte”
//        Si un dado es seis, mostrar el mensaje “Mala Suerte”
//        Si ningún dado se obtiene seis, mostrar el mensaje “Muy mala suerte”
//        Simule los lanzamientos con tres números aleatorios, usando instrucciones
//        Java que los genere.

        int dado1 = (int)(Math.random()*6)+1;
        System.out.println("El dado 1 es: " + dado1);
        int dado2 = (int)(Math.random()*6)+1;
        System.out.println("El dado 2 es: " + dado2);
        int dado3 = (int)(Math.random()*6)+1;
        System.out.println("El dado 3 es: " + dado3);

        int contador = 0;
        if (dado1 == 6){
            contador += 1;
        }
        if (dado2 == 6){
            contador += 1;
        }
        if (dado3 == 6){
            contador += 1;
        }
        if (contador == 1){
            System.out.println("Mala suerte");
        } else if (contador == 2) {
            System.out.println("Buena suerte");
        } else if (contador == 3) {
            System.out.println("Muy buena suerte");
        }else {
            System.out.println("Muy mala suerte");
        }

    }
}

