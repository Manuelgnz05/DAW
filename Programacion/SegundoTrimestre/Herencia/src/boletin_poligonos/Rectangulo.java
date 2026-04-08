package boletin_poligonos;

/*
Cree una clase Rectángulo, teniendo en cuenta que un rectángulo es un caso de
polígono especializado de cuatro vértices (y sólo cuatro vertices). Añada atributos
adicionales si lo estima conveniente, e implemente el método abstracto calcularArea.
 */

public class Rectangulo extends Poligono{

    protected float base;
    protected float altura;

    public Rectangulo(float base, float altura) throws NumeroInvalidoException {
        super(4);
        validadorAltura(altura);
        validadorBase(base);
        this.base = base;
        this.altura = altura;
    }

    private void validadorBase(float base) throws NumeroInvalidoException {
        if (base<=0){
            throw new NumeroInvalidoException("La base tiene que ser mayor que 0.");
        }
    }

    private void validadorAltura(float altura) throws NumeroInvalidoException {
        if (altura<=0){
            throw new NumeroInvalidoException("La altura tiene que ser mayor que 0.");
        }
    }

    public float calcularArea() {
        return base*altura;
    }
}
