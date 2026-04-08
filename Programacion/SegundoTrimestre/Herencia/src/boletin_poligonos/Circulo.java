package boletin_poligonos;

/*
Cree una clase Círculo, y añádala a la jerarquía en el nivel que estime conveniente.
Puede crear tantas clases nuevas como sea necesario. Tenga en cuenta que un círculo
no tiene vértices.
 */

public final class Circulo extends Poligono{

    private float radio;

    public Circulo(float radio) throws NumeroInvalidoException {
        super(0);
        validadorRadio(radio);
        this.radio = radio;
    }

    private void validadorRadio(float radio) throws NumeroInvalidoException {
        if (radio<=0){
            throw new NumeroInvalidoException("El radio tiene que ser mayor que 0.");
        }
    }

    @Override
    public float calcularArea() {
        return (float)Math.PI*(radio*radio);
    }
}
