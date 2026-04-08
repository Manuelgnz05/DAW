package boletin_poligonos;
public class main{
    public static void main(String[] args) {
        try {
            Cuadrado c1 = new Cuadrado(5);
        } catch (NumeroInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}

