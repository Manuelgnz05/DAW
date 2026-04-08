import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Una señora está decidida a pintar su casa. No sabe
        //exactamente de qué color, puesto que solo tiene pintura roja,
        //verde y azul (Las 3 en botes de 255ml), los cuales no son
        //colores apropiados para una pared. No obstante, esta señora
        //es familiar de un alumno de primero de DAM/DAW en el
        //instituto Vedruna, y sabe que en esa clase han hecho una
        //práctica en la que puede comprobar si los colores que usa
        //generan el color deseado. La señora desea dos colores
        //distintos para tener variedad.
        //El alumno, que ya tiene la app programada en clase, le
        //pregunta a la señora las siguientes cuestiones:
        //1) ¿Vas a usar TODO el bote rojo para el primer color?
        //2) ¿Vas a usar TODO el bote verde para el primer color?
        //3) ¿Vas a usar TODO el bote azul para el primer color?
        //4) ¿Vas a usar MEDIO bote rojo para el primer color?
        //5) ¿Vas a usar MEDIO bote verde para el primer color?
        //6) ¿Vas a usar MEDIO bote azul para el primer color?
        //7) ¿Vas a usar TODO el bote rojo para el segundo color?
        //8) ¿Vas a usar TODO el bote verde para el segundo color?
        //9) ¿Vas a usar TODO el bote azul para el segundo color?
        //10) ¿Vas a usar MEDIO bote rojo para el segundo color?
        //11) ¿Vas a usar MEDIO bote verde para el segundo color?
        //12) ¿Vas a usar MEDIO bote azul para el segundo color?
        //
        //Una vez guardadas las respuestas como True o False, que las
        //introducirá la señora (usuario) por pantalla, inmediatamente y
        //sin hacer otro tipo de instrucción intermedia entre las preguntas
        //y lo que se va a pedir a continuación, imprimir por pantalla el
        //
        //resultado de la proposición lógica descrita a continuación y que
        //está en negrita:
        //Queremos que el primer color elegido sea Verde lima
        //(127ml, 255ml, 0) Ó Verde clarito (0, 255ml, 127ml) Y que el
        //segundo color sea Azul claro (0, 127ml, 255ml) Ó Celeste
        //oscuro (0, 127ml, 127ml).
        //Nota: No se requiere que aparezcan en la proposición lógica
        //todas las variables que tenemos. Pero si se exige que
        //aparezca al menos una de cada color. (Ejemplo: todoBoteRojo,
        //medioBoteVerde, !todoBoteAzul podrían ser las tres variables
        //usadas para definir el color Naranja.)

        System.out.println("Responde a estas preguntas con true o false");
        System.out.println("¿Vas a usar TODO el bote rojo para el primer color?");
        boolean todo_rojo = scan.nextBoolean();
        System.out.println("¿Vas a usar TODO el bote verde para el primer color?");
        boolean todo_verde = scan.nextBoolean();
        System.out.println("¿Vas a usar TODO el bote azul para el primer color?");
        boolean todo_azul = scan.nextBoolean();
        System.out.println("¿Vas a usar MEDIO bote rojo para el primer color?");
        boolean medio_rojo = scan.nextBoolean();
        System.out.println("¿Vas a usar MEDIO bote verde para el primer color?");
        boolean medio_verde = scan.nextBoolean();
        System.out.println("¿Vas a usar MEDIO bote azul para el primer color?");
        boolean medio_azul = scan.nextBoolean();
        System.out.println("¿Vas a usar TODO el bote rojo para el segundo color?");
        boolean todo_rojo2 = scan.nextBoolean();
        System.out.println("¿Vas a usar TODO el bote verde para el segundo color?");
        boolean todo_verde2 = scan.nextBoolean();
        System.out.println("¿Vas a usar TODO el bote azul para el segundo color?");
        boolean todo_azul2 = scan.nextBoolean();
        System.out.println("¿Vas a usar MEDIO bote rojo para el segundo color?");
        boolean medio_rojo2 = scan.nextBoolean();
        System.out.println("¿Vas a usar MEDIO bote verde para el segundo color?");
        boolean medio_verde2 = scan.nextBoolean();
        System.out.println("¿Vas a usar MEDIO bote azul para el segundo color?");
        boolean medio_azul2 = scan.nextBoolean();


        boolean verde_lima = medio_rojo && todo_verde && !todo_azul && !medio_azul;
        boolean verde_clarito = !todo_rojo && !medio_rojo && todo_verde && medio_azul;
        boolean azul_claro = !todo_rojo2 && !medio_rojo2 && medio_verde2 && todo_azul2;
        boolean celeste_oscuro = !todo_rojo2 && !medio_rojo2 && medio_verde2 && medio_azul2;

        boolean propuesta = (verde_lima || verde_clarito) && (azul_claro || celeste_oscuro);
        System.out.println(propuesta);

    }
}
