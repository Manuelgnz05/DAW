import java.util.Scanner;

public class Entrada_por_consola {
    public static void main(String[] args) {
        //1. Lee por pantalla una altura y almacénala en una variable. Imprime la variable
        //por pantalla.
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una altura: ");
        float altura = scan.nextFloat();
        System.out.println("La altura introducida es " + altura);

        //2. Lee por pantalla una edad y almacénalo en una variable. Imprime la variable
        //por pantalla.
        System.out.println("Introduce una edad: ");
        int edad = scan.nextInt();
        System.out.println("La edad introducida es " + edad);

        //3. ¿Pueden modificarse los ejercicios anteriores para ahorrarse la variable?
        //Sí, poniendolo directamente al imprimirlo por pantalla.

        //4.a Lee por pantalla una temperatura en grados Celsius e imprímela por pantalla.
        System.out.println("Introduce una temperatura en grados celsius: ");
        float temperatura = scan.nextFloat();
        System.out.println("La temperatura en celsius es: " + temperatura);

        //4.b Repite pero imprimiendo por pantalla en grados Kelvin (hay que convertir).
        float kelvin = temperatura + 273.15f;
        System.out.println("La temperatura en kelvin es: " + kelvin);

        //5. Crea un programa que calcule el área de un rectángulo (base x altura),
        //pidiendo por pantalla los datos necesarios.
        System.out.println("Introduce una altura en metros: ");
        float altura2 = scan.nextFloat();
        System.out.println("Introduce una base en metros: ");
        float base2 = scan.nextFloat();
        System.out.println("El area del triángulo es: " + (altura2*base2));

        //6. Crea un programa que calcule el Índice de Masa Corporal (IMC), pidiendo
        //por pantalla los datos necesarios.
        System.out.println("Introduce un peso en kg: ");
        float peso = scan.nextFloat();
        System.out.println("Introduce una altura en metros: ");
        float altura3 = scan.nextFloat();
        System.out.println("El indice de masa coporal es: " + (peso/(altura3*altura3)));

        //7. Crea un programa que lea el precio sin IVA de un producto e imprima
        //el valor final con IVA del mismo.
        System.out.println("Introduce precio producto: ");
        float precio = scan.nextFloat();
        float conIVA = precio + (precio*0.21f);
        System.out.println("El precio con IVA es: " + conIVA);

        //8. Crea un programa que lea el precio sin IVA de tres productos e imprima
        //el valor total con IVA que paga el comprador, así como el valor medio con y sin
        //IVA.
        System.out.println("Introduce precio producto: ");
        float precio2 = scan.nextFloat();
        System.out.println("Introduce precio producto: ");
        float precio3 = scan.nextFloat();
        System.out.println("Introduce precio producto: ");
        float precio4 = scan.nextFloat();
        float conIVA2 = precio2 + (precio2*0.21f);
        float conIVA3 = precio3 + (precio3*0.21f);
        float conIVA4 = precio3 + (precio3*0.21f);
        System.out.println("El precio total con IVA es: " + (conIVA2 + conIVA3 + conIVA4));
        System.out.println("El valor medio sin IVA es: " + ((precio2 + precio3 + precio4)/3));
        System.out.println("El valor medio con IVA es: " + ((conIVA2 + conIVA3 + conIVA4)/3));


    }
}
