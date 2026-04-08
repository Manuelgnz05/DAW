package boletin_poligonos;

/*
Cree una clase Triángulo, y añádala a la jerarquía en el nivel que estime conveniente.
Puede crear tantas clases nuevas como sea necesario.
 */

public final class Triangulo extends Poligono{

    private float base;
    private float altura;

    public Triangulo(float base, float altura) throws NumeroInvalidoException {
        super(3);
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

    @Override
    public float calcularArea() {
        return (base*altura)/2;
    }
}
