package ejercicio_naipes;

public class main {
    static void main() {
        try {
            Baraja b1 = new Baraja();
            b1.mostrarBaraja();
            b1.barajar();
            b1.mostrarBaraja();
        } catch (NumeroInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
