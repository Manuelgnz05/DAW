package ejercicio_naipes;

public final class Carta {

    private int numero;
    private Palo palo;

    private Carta(){
        this.numero = 1;
        this.palo = Palo.ESPADAS;
    }

    public Carta(int numero, Palo palo) throws NumeroInvalidoException {
        this();
        validarNumero(numero);
        this.numero = numero;
        this.palo = palo;
    }

    private void validarNumero(int numero) throws NumeroInvalidoException {
        if (!((numero > 0 && numero <= 7) || (numero >= 10 && numero <= 12))){
            throw new NumeroInvalidoException("El número tiene que estar entre 1 y 12");
        }
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo=" + palo +
                '}';
    }

    public boolean equals(Object o){
        Carta obj = (Carta) o;
        return numero == obj.numero && palo == obj.palo;
    }

}
