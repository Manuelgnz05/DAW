package pokemon_vedruna;

public abstract class PokemonFuego extends Pokemon{

    public PokemonFuego(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public PokemonFuego(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public String toString() {
        return "Pokemon tipo Fuego, " +
                "Número de la Pokedex = " + ID + ", apodo=" +  apodo + '\'' + ", HP=" + salud + ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", velocidad=" + velocidad +
                ", nivel=" + nivel;
    }
}
