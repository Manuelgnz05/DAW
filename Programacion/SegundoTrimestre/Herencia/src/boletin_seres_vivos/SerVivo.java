package boletin_seres_vivos;

/*
Cree una clase SerVivo que tenga en sus atributos las tres dimensiones posibles (alto,
ancho y largo). Todo ser vivo se caracteriza porque puede realizar las siguientes tres
acciones: interactuar con el medio, nutrirse y reproducirse. La implementación de
estas acciones (y la del resto de ejercicios) no es relevante, vale con que al ejecutarse
se imprima un mensaje por pantalla con un texto relativo a la acción.
 */

import boletin_poligonos.NumeroInvalidoException;

public abstract class SerVivo {

    protected float alto;
    protected float ancho;
    protected float largo;

    private SerVivo(){
        this.alto = 0;
        this.ancho = 0;
        this.largo = 0;
    }

    public SerVivo(float alto, float ancho, float largo) throws NumeroInvalidoException {
        validarAlto(alto);
        validarAncho(ancho);
        validarLargo(largo);
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    private void validarAlto(float alto) throws NumeroInvalidoException {
        if (alto<=0){
            throw new NumeroInvalidoException("El alto tiene que ser superior que 0.");
        }
    }

    private void validarAncho(float ancho) throws NumeroInvalidoException {
        if (ancho<=0){
            throw new NumeroInvalidoException("El ancho tiene que ser superior que 0.");
        }
    }

    private void validarLargo(float largo) throws NumeroInvalidoException {
        if (largo<=0){
            throw new NumeroInvalidoException("El largo tiene que ser superior que 0.");
        }
    }

    public void interactuar(String medio){
        System.out.println("Has interactuado con ".concat(medio));
    }

    public void nutrirse(){
        System.out.println("Te has nutrido.");
    }

    public void reproducirse(){
        System.out.println("Te has reproducido.");
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }
}
