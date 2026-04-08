package pokemon_vedruna;

public class Lapras extends PokemonAgua{

    public Lapras(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Lapras(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public Pokemon evolucionar() {
        return null;
    }
}
