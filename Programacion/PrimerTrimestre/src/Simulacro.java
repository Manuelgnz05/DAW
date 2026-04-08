import java.util.Scanner;

public class Simulacro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Pregunta 1: Control de acceso a un parque de atracciones (3 puntos)
        //Una empresa gestiona un parque de atracciones que aplica diferentes tarifas según la edad del
        //visitante y si posee o no un pase anual.
        //El programa debe pedir por teclado:
        //• La edad del visitante (número entero).
        //• Si el visitante posee pase anual (introduciendo true o false).
        //A partir de esos datos, el programa mostrará el precio de la entrada siguiendo estas normas:
        //• Menores de 5 años: entrada gratuita.
        //• Entre 5 y 12 años: 10 €.
        //• Entre 13 y 17 años: 15 €.
        //• 18 años o más: 20 €.
        //• Si el visitante tiene un pase anual, obtiene un 50% de descuento sobre el precio anterior.
        //Finalmente, el programa debe mostrar el mensaje con el precio final de la entrada.
        //Ejemplo de salida:
        //Edad: 10
        //Pase anual: true
        //Precio final: 5.0 €

        System.out.println("Introduce tu edad: ");
        int edad = scan.nextInt();
        System.out.println("Tiene el pase anual: ");
        boolean anual = scan.nextBoolean();
        float coste;

        if(anual == false){
            if(edad<5){
                System.out.println("Precio final: gratuito");
            } else if (edad>=5 && edad<=12) {
                coste = 10f;
                System.out.println("Precio Final: " + coste + "€");
            } else if (edad>=13 && edad<=17) {
                coste = 15f;
                System.out.println("Precio Final: " + coste + "€");
            }else {
                coste = 20f;
                System.out.println("Precio Final: " + coste + "€");
            }
        }else {
            if(edad<5){
                System.out.println("Precio final: gratuito");
            } else if (edad>=5 && edad<=12) {
                coste = 10f/2;
                System.out.println("Precio Final: " + coste + "€");
            } else if (edad>=13 && edad<=17) {
                coste = 15f/2;
                System.out.println("Precio Final: " + coste + "€");
            }else {
                coste = 20f/2;
                System.out.println("Precio Final: " + coste + "€");
            }
        }


        //Pregunta 2: Contador de pasos hasta alcanzar un objetivo (3 puntos)
        //Un entrenador físico quiere registrar los pasos que realiza un usuario diariamente hasta que alcance
        //un objetivo semanal.
        //El programa debe pedir primero al usuario cuántos pasos quiere alcanzar (un número entero
        //positivo).
        //Luego, en un bucle, el programa pedirá el número de pasos realizados cada día. El bucle continuará
        //hasta que la suma total de pasos alcance o supere el objetivo.
        //Al finalizar, el programa debe mostrar:
        //1. El total de días que le ha llevado alcanzar el objetivo.
        //2. El total de pasos realizados.
        //Ejemplo de ejecución:
        //Objetivo de pasos: 10000
        //Pasos día 1: 3000
        //Pasos día 2: 4000
        //Pasos día 3: 3500
        //Objetivo alcanzado en 3 días
        //        //Total de pasos: 10500
        //

        System.out.println("Cuantos pasos quieres alcanzar: ");
        int pasos = scan.nextInt();
        int totalPasos = 0;
        if(pasos>0){
            for(int contador = 1; totalPasos<pasos;contador++){
                System.out.println("Cuantos pasos has hacho hoy: ");
                int pasosDia = scan.nextInt();
                totalPasos += pasosDia;
                System.out.println("Pasos dia " + contador + ": " + pasosDia);
                if(totalPasos>=pasos){
                    System.out.println("Objetivo alcanzado en " + contador + " días");
                    System.out.println("Total de pasos: " + totalPasos);
                }
            }
        }

        //Pregunta 3: Gestión de notas de alumnos (4 puntos)
        //Un profesor desea automatizar el cálculo de las calificaciones de su grupo.
        //El programa debe pedir primero el número de alumnos del grupo.
        //Después, para cada alumno, pedirá su nombre y su nota numérica (un número real entre 0 y 10).
        //Con esos datos, el programa debe:
        //1. Calcular y mostrar la nota media de la clase.
        //2. Contar cuántos alumnos han aprobado (nota ≥ 5) y cuántos han suspendido.
        //3. Mostrar el nombre del alumno con la nota más alta.
        //Ejemplo de ejecución:
        //Número de alumnos: 3
        //Nombre del alumno 1: Ana
        //Nota: 7.5
        //Nombre del alumno 2: Luis
        //Nota: 4.2
        //Nombre del alumno 3: Marta
        //Nota: 9.0
        //Nota media: 6.9
        //Aprobados: 2
        //Suspendidos: 1
        //Mejor nota: Marta (9.0)

        System.out.println("Introduzca el número de alumnos: ");
        int alumnos = scan.nextInt();
        float nota;
        String nombre;
        int aprobados = 0;
        int suspendidos = 0;
        float notaMedia = 0f;
        float notaMasAlta = 0f;
        String MejorAlumno;

        for(int contador = 1;contador<=alumnos;contador++){
            System.out.println("Introduce el nombre del alumno numero " + contador + ":");
            nombre = scan.next();
            System.out.println("Introduce su nota: ");
            nota = scan.nextFloat();
            if(nota>=0 && nota<=10){
                notaMedia += nota/alumnos;
                System.out.println("Nombre del alumno " + contador + ": " + nombre);
                System.out.println("Nota: " + nota);
                if(nota<5){
                    suspendidos++;
                }else {
                    aprobados++;
                }
                if(notaMasAlta<nota){
                    MejorAlumno = nombre;
                    notaMasAlta = nota;
                    if(contador == alumnos){
                        System.out.println("Nota Media: " + notaMedia);
                        System.out.println("Aprobados: " + aprobados);
                        System.out.println("Suspendidos: " + suspendidos);
                        System.out.println("Mejor nota: " + MejorAlumno + "(" + notaMasAlta + ")");
                    }
                }
            }
            }

    }
}
