package pokemon_vedruna;

public abstract class PokemonPlanta extends Pokemon{

    public PokemonPlanta(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public PokemonPlanta(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public String toString() {
        return "PokemonPlanta{" +
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
