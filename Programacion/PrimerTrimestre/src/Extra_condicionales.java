import java.util.Scanner;

public class Extra_condicionales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Ejercicio 1: Validación de tarjeta ficticia
        //Enunciado:
        //Un número de tarjeta tiene 8 dígitos. Es válido si:
        //• La suma de los dígitos en posiciones pares multiplicada por 3, más la suma de los dígitos en
        //posiciones impares, es divisible por 7.
        //Ejemplo:
        //• Entrada: 12345678
        //• Salida: Número válido o Número inválido

        int tarjeta = 12345678;
        int impar1 = tarjeta%10;
        int par1 = (tarjeta/10)%10;
        int impar2 = (tarjeta/100)%10;
        int par2 = (tarjeta/1000)%10;
        int impar3 = (tarjeta/10000)%10;
        int par3 = (tarjeta/100000)%10;
        int impar4 = (tarjeta/1000000)%10;
        int par4 = (tarjeta/10000000)%10;

        int suma = ((par1+par2+par3+par4)*3) + impar1 + impar2 + impar3 + impar4;

        if(suma%7 == 0){
            System.out.println("Número válido");
        }else {
            System.out.println("Número inválido");
        }

        //Ejercicio 2: Código postal
        //Enunciado:
        //Validar un código postal de 5 cifras:
        //• Los dos primeros dígitos corresponden a provincias (01-52)
        //• Los tres últimos no pueden ser todos ceros
        //Ejemplo:
        //• Entrada: 28001 → Válido
        //• Entrada: 53000 → Inválido

        System.out.println("Introduce un codigo postal: ");
        int c_postal = scan.nextInt();
        int provincia = c_postal/1000;
        int num1 = (c_postal/100)%10;
        int num2 = (c_postal/10)%10;
        int num3 = c_postal%10;

        if (c_postal<=52 && c_postal>=1){
            if(num1 == 0 && num2 == 0 && num3 == 0){
                System.out.println("Código postak invalido");
            }else {
                System.out.println("Código postal válido");
            }
        }else {
            System.out.println("Código postal inválido");
        }


        //Ejercicio 3: Contraseña segura
        //Enunciado:
        //Una contraseña es segura si:
        //• Tiene al menos 8 caracteres
        //• Contiene al menos un número
        //• Contiene al menos una letra mayúscula
        //Ejemplo:
        //• Entrada: Abc12345 → Segura
        //• Entrada: abcdef → No segura

        System.out.println("Introduce una contraseña: ");
        char c1 = 'A';
        char c2 = 'b';
        char c3 = 'c';
        char c4 = '1';
        char c5 = '2';
        char c6 = '3';
        char c7 = '4';
        char c8 = '5';







        //Ejercicio 4: Número de serie
        //Enunciado:
        //Un número de serie de 6 dígitos es válido si el último dígito es igual al resto de la suma de los 5
        //primeros dígitos dividido entre 10.
        //Ejemplo:
        //• Entrada: 123455 → Válido
        //• Entrada: 123456 → Inválido

        System.out.println("Introduce un numero de serie: ");
        int serie = scan.nextInt();
        int n1 = serie/100000;
        int n2 = (serie/10000)%10;
        int n3 = (serie/1000)%10;
        int n4 = (serie/100)%10;
        int n5 = (serie/10)%10;
        int n6 = serie%10;
        int sum = (n1 + n2 + n3 + n4 + n5)%10;
        if(sum == n6){
            System.out.println("Contraseña segura");
        }else {
            System.out.println("Contraseña insegura");
        }

        //Ejercicio 5: Matrícula de coche
        //Enunciado:
        //Validar matrícula con formato 1234 ABC:
        //• Los números deben estar entre 0000 y 9999
        //• Las letras deben ser mayúsculas
        //• Mostrar si la matrícula es válida



    }
}
