package pokemon_vedruna;

public class Torkoal extends PokemonFuego{

    public Torkoal(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Torkoal(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public Pokemon evolucionar() {
        return null;
    }
}
