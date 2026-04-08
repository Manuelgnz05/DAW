package pokemon_vedruna;

public class Wartortle extends Squirtle{

    public Wartortle(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Wartortle(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public Pokemon evolucionar() throws DatoInvalidoException {
        Blastoise evolucion = new Blastoise(apodo, salud, ataque, defensa, velocidad, nivel);
        return evolucion;
    }

}
