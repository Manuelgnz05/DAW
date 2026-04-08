package pokemon_vedruna;

public abstract class PokemonAgua extends Pokemon{

    public PokemonAgua(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public PokemonAgua(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public String toString() {
        return "PokemonAgua{" +
                "ID=" + ID +
                ", apodo='" + apodo + '\'' +
                ", salud=" + salud +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", velocidad=" + velocidad +
                ", nivel=" + nivel +
                '}';
    }

}
