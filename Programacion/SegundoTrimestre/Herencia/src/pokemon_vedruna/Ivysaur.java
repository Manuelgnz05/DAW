package pokemon_vedruna;

public class Ivysaur extends Bulbasur{
    public Ivysaur(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Ivysaur(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public Pokemon evolucionar() throws DatoInvalidoException {
        Venusaur evolucion = new Venusaur(apodo, salud, ataque, defensa, velocidad, nivel);
        return evolucion;
    }

}
