package boletin_poligonos;

/*
Cree una clase Polígono, que tenga un atributo vértices, que indica la cantidad de
vértices que tiene el polígono. Cree constructores, getters, setters y código de
validación, y marque todos los miembros con el modificador de visibilidad que
considere adecuado. Debe tener un método abstracto llamado calcularArea, que
devuelve un float con el área del polígono.
 */

import java.util.Objects;

public abstract class Poligono {

    protected int vertices;

    private Poligono(){
        this.vertices = 0;
    }

    public Poligono(int vertices) throws NumeroInvalidoException {
        this();
        validadorVertices(vertices);
        this.vertices = vertices;
    }

    private void validadorVertices(int vertices) throws NumeroInvalidoException {
        if (vertices<0){
            throw new NumeroInvalidoException("El numero de vertices tiene que ser superior a 0");
        }
    }

    public abstract float calcularArea();

    public int getVertices(){
        return vertices;
    }

    private void setVertices(int vertices) throws NumeroInvalidoException {
        validadorVertices(vertices);
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "vertices=" + vertices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Poligono obj = (Poligono) o;
        return vertices == obj.vertices;
    }

}
