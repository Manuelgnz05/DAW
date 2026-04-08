package pokemon_vedruna;

public class Blastoise extends Wartortle{

    public Blastoise(String apodo, int nivel) throws DatoInvalidoException {
        super(apodo, nivel);
    }

    public Blastoise(String apodo, int salud, int ataque, int defensa, int velocidad, int nivel) throws DatoInvalidoException {
        super(apodo, salud, ataque, defensa, velocidad, nivel);
    }
}
