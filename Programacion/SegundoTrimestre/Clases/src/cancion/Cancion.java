package cancion;

//Ejercicio 10: CanciónClase Cancion
//Atributos privados:
//String titulo
//String artista
//int duracionSegundos
//Validaciones:
//El título y el artista no pueden estar vacíos.
//La duración debe ser mayor que 0.
//Excepción: CancionInvalidaException
//toString():
//Formato requerido (con duración en mm:ss):"ARTISTA - TITULO [mm:ss]"
//
//Ejemplo:Queen - Bohemian Rhapsody [05:55]
//equals(Object o)
//Dos canciones son iguales si:
//El título y el artista coinciden
//Y la diferencia de duración es

public class Cancion {

    private String titulo;
    private String artista;
    private int duracionSegundos;

    private Cancion(){
        this.titulo = "DEFAULT-Title";
        this.artista = "DEFAULT-Artist";
        this.duracionSegundos = 1;
    }

    public Cancion(String titulo, String artista, int duracionSegundos) throws CancionInvalidaException {
        this();
        validarTitulo(titulo);
        validarArtista(artista);
        validadDuracion(duracionSegundos);
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }

    private void validarTitulo(String titulo) throws CancionInvalidaException {
        if (titulo == null || titulo.isEmpty()) {
            throw new CancionInvalidaException("El titulo no puede ser nulo");
        }
    }

    private void validarArtista(String artista) throws CancionInvalidaException {
        if (titulo == null || titulo.isEmpty()) {
            throw new CancionInvalidaException("La cancion no puede ser nula");
        }
    }

    public void validadDuracion(int duracionSegundos) throws CancionInvalidaException {
        if (duracionSegundos <= 0){
            throw new CancionInvalidaException("La duración debe ser mayor que 0");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws CancionInvalidaException {
        validarTitulo(titulo);
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) throws CancionInvalidaException {
        validarArtista(artista);
        this.artista = artista;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) throws CancionInvalidaException {
        validadDuracion(duracionSegundos);
        this.duracionSegundos = duracionSegundos;
    }

    private String getTiempo(int duracionSegundos){
        int min = 0;
        int seg = duracionSegundos;
        while (seg >= 60){
            min++;
            seg -= 60;
        }
        return String.format("%02d:%02d", min, seg);
    }

    @Override
    public String toString() {
        return artista + " - " + titulo + " [" + getTiempo(duracionSegundos) + "]";
    }

    public boolean equals (Object obj){
        Cancion otro = (Cancion) obj;
        return this.titulo.equals(otro.titulo) && this.artista.equals(otro.artista)
                && this.duracionSegundos == otro.duracionSegundos;
    }

}
