package pokemon_vedruna;

public class Bulbasur extends PokemonPlanta{

    public Bulbasur(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Bulbasur(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public Pokemon evolucionar() throws DatoInvalidoException {
        Ivysaur evolucion = new Ivysaur(apodo, salud, ataque, defensa, velocidad, nivel);
        return evolucion;
    }
}
