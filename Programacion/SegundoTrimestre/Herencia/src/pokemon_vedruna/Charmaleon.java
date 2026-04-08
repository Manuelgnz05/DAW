package pokemon_vedruna;

public class Charmaleon extends Charmander{
    public Charmaleon(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Charmaleon(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Pokemon evolucionar() throws DatoInvalidoException {
        Charizard evolucion = new Charizard(apodo, salud, ataque, defensa, velocidad, nivel);
        return evolucion;
    }

}
