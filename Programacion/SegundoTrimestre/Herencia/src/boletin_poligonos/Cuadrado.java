package boletin_poligonos;

/*
Cree una clase Cuadrado, teniendo en cuenta que un cuadrado es un caso de
rectángulo especializado en el que la base es igual a la altura. Piense en el método
calcularArea y modifíquelo si lo estima conveniente.
 */

public final class Cuadrado extends Rectangulo{

    public Cuadrado(float lado) throws NumeroInvalidoException {
        super(lado, lado);
    }

}
