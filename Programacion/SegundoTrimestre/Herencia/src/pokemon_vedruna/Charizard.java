package pokemon_vedruna;

public class Charizard extends Charmaleon {

    public Charizard(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Charizard(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
