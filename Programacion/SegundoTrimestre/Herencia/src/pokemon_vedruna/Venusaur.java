package pokemon_vedruna;

public class Venusaur extends Ivysaur{

    public Venusaur(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Venusaur(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }
}
