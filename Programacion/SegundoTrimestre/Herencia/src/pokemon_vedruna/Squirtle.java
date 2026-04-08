package pokemon_vedruna;

public class Squirtle extends PokemonAgua{
    public Squirtle(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Squirtle(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public Pokemon evolucionar() throws DatoInvalidoException {
        Wartortle evolucion = new Wartortle(apodo, salud, ataque, defensa, velocidad, nivel);
        return evolucion;
    }
}
