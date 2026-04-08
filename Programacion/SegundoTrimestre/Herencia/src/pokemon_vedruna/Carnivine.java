package pokemon_vedruna;

public class Carnivine extends PokemonPlanta{

    public Carnivine(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Carnivine(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public Pokemon evolucionar() {
        return null;
    }
}
