import java.util.Scanner;
/**
 * Clase principal que implementa el juego del Ahorcado (Hangman) por consola.
 *
 * <p>El juego permite a un usuario introducir una palabra secreta y adivinarla letra por letra.
 * La implementación incluye las siguientes características clave:</p>
 *
 * <ul>
 * <li>Máximo de **5 intentos** permitidos por partida.</li>
 * <li>**Validación robusta** de la entrada del usuario.</li>
 * <li>Manejo de **letras repetidas**: no consumen un intento, pero se contabilizan
 * como errores para el usuario.</li>
 * <li>Mensajes de salida claros para el usuario:
 * <ul>
 * <li>Mensaje de **felicitación** al adivinar la palabra.</li>
 * <li>Mensaje de **error** al agotar el número de intentos.</li>
 * </ul>
 * </li>
 * </ul>
 *
 * <p>
 *     Manuel: la modificación ha sido que en vez de harcodear la palabra, lo he cambiado para que
 *     tu seas quien tenga que ponerla.
 *
 *     Marcos: con la modificación ahora la la palabra a adivinar cambia cada vez que se
 *     ejecuta el programa
 * </p>
 *
 * @author Manuel
 * @author Marcos
 * @version 2.0
 */
public class Marcos {
    public static void main(String[] args) {

            // Crea un objeto Scanner para leer datos por teclado
            Scanner entrada = new Scanner(System.in);

            // Pide la palabra que se quiere adivinar y la pasa a mayúsculas
            System.out.print("Introduce la palabra que se quiere adivinar: ");
            String palabra = entrada.next().toUpperCase();

            // Inicializa la representación de la palabra oculta con guiones bajos
            String mostrado = "_".repeat(palabra.length());

            // Acumula todas las letras que el jugador ya ha introducido
            String letrasUsadas = "";

            // Indica si el jugador ha adivinado completamente la palabra
            boolean acertado = false;

            // Número máximo de intentos permitidos al jugador
            int vidas = 5;

            // Mensajes de bienvenida al inicio del juego
            System.out.println("*** Bienvenido al Ahorcado ***");
            System.out.println("¡¡¡Juguemos!!!");

            // Bucle principal del juego: se ejecuta mientras no se acierte y queden vidas
            while (!acertado && vidas > 0) {

                // Muestra el estado actual de la partida
                System.out.println("Te quedan " + vidas + " vidas");
                System.out.println(mostrado + " <- Esta es la palabra oculta");
                System.out.println("Has usado estas letras: " + letrasUsadas);

                // Pide una letra y valida que sea exactamente un carácter alfabético
                String intento = "";
                do {
                    System.out.print("Introduce una letra: ");
                    intento = entrada.nextLine().toUpperCase();
                } while (intento.length() != 1 || !Character.isLetter(intento.charAt(0)));

                // Si la letra ya ha sido utilizada, avisa y resta una vida
                if (letrasUsadas.contains(intento)) {
                    System.out.println(intento + " ya ha sido probado");
                    vidas--;
                } else {
                    // Registra la nueva letra como usada
                    letrasUsadas = letrasUsadas.concat(intento).concat(" ");

                    // Extrae el carácter de la letra introducida
                    char letra = intento.charAt(0);

                    // Marca si en este turno se ha adivinado alguna posición de la palabra
                    boolean acierto = false;

                    // Recorre cada índice de la palabra oculta
                    for (int i = 0; i < palabra.length(); i++) {
                        // Comprueba si la letra introducida coincide con la letra de la palabra en esa posición
                        if (palabra.charAt(i) == letra) {
                            // Reemplaza el guion bajo por la letra acertada en la posición correspondiente
                            mostrado = mostrado.substring(0, i) + letra + mostrado.substring(i + 1);
                            acierto = true;
                        }
                    }

                    // Informa si la letra está o no en la palabra y, en caso negativo, resta una vida
                    if (acierto) {
                        System.out.println(intento + " está en la palabra oculta");
                    } else {
                        System.out.println(intento + " NO está en la palabra oculta");
                        vidas--;
                    }
                }

                // Comprueba si ya se ha completado la palabra y marca la victoria
                if (palabra.equals(mostrado)) {
                    acertado = true;
                }

                // Imprime una línea separadora entre turnos para mejorar la legibilidad
                System.out.println("----------------------------------------------");
            }

            // Mensaje final según si se ha ganado o perdido
            if (acertado) {
                System.out.println("¡ENHORABUENA, HAS GANADO!");
            } else {
                System.out.println("Has perdido");
            }
        }
    }

