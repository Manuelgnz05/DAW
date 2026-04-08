public class Boletin_variables_1 {
    public static void main(String[] args) {
        //1. Crear una variable entera e imprimirla por pantalla sin asignarle ningún valor.
        //¿Qué se ha impreso?
        int valor;
        // System.out.println(valor);
        // un error ya que no tiene ningun valor

        //2.a Crear una variable entera con el valor 0. Incrementar su valor en 3 unidades utilizando el operador
        //de suma + y asignación =, e imprimirla por pantalla.
        int res = 0;
        System.out.println(res + 3);

        //2.b Decrementar su valor en una unidad utilizando
        // el operador de decremento --. Imprimirla por pantalla.
        System.out.println(res-1);

        //3. Incrementar su valor en 4 unidades sin utilizar el operador de suma
        // y asignación +=, e imprimirla por pantalla (no puede usar el =).
        System.out.println(res+4);

        //4.Crear otra variable entera y asignarle el valor 48.76.
        float res1 = 48.76f;

        //5. Modificarla dividiendo por 50 e imprimir el resultado por pantalla.
        float mod = res1/50;
        System.out.println(mod);

        //6.Modificarla sumándole 1 y multiplicando por
        // 48 e imprimir el resto de dividirla entre 46.
        float res2 = ((mod + 1)*48)/46;
        System.out.println(res2);

        //7.Sin modificar el valor de la variable,
        // imprimir por pantalla el resultado de elevarla al cuadrado.
        System.out.println(res1 * res1);

        //8. Crear dos variables de tipo float,
        // dándoles un valor inicial e imprimiéndolas por pantalla.
        float res3 = 2.5f;
        float res4 = 8.8f;
        System.out.println(res3);
        System.out.println(res4);

        //9. Imprimir por pantalla el resultado
        // de comprobar si la primera es mayor que la segunda.
        System.out.println(res3>res4);

        //10. Cambiar la primera con el valor de la segunda
        // multiplicado por dos, y volver a imprimir por pantalla
        //el resultado de la comprobación anterior.
        res3 = res4 * 2;
        System.out.println(res3>res4);

        //11. Imprimir por pantalla el resultado de comprobar
        // si la primera es menor o igual que la segunda.
        System.out.println(res3 <= res4);

        //12. Repetir el ejercicio anterior pero almacenando el
        // resultado de la comprobación
        //en una variable, e imprimiendo después por pantalla dicha variable.
        boolean res5 = res3 <= res4;
        System.out.println(res5);
    }
}
