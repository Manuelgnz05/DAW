package pelicula;

//Ejercicio 8: PelículaClase Pelicula
//Atributos privados:
//String titulo
//int anioEstreno
//int duracion (en minutos)
//String director
//Validaciones:
//El año de estreno debe ser mayor que 1880.
//La duración debe ser mayor que 0.
//El título y el director no pueden estar vacíos.
//Usa una excepción PeliculaInvalidaException.
//toString(): Debe devolver exactamente el siguiente formato:"Pelicula: TITULO (AÑO) - DURACION min | Dir: DIRECTOR"
//
//Ejemplo:Pelicula: Matrix (1999) - 136 min | Dir: Wachowski
//equals(Object o)
//Dos películas se consideran si:
//Tienen el mismo (ignorando mayúsculas/minúsculas)
//Y su año de estreno

public  class Pelicula {
    private String titulo;
    private int anioEstreno;
    private int duracion;
    private String director;

    public Pelicula() {
        this.titulo = "DEFAULT-Title";
        this.anioEstreno = 1881;
        this.duracion = 1;
        this.director = "DEFAULT-Director";
    }

    public Pelicula (String titulo, int anioEstreno, int duracion, String director) throws PeliculaInvalidaException {
        this();
        validarTitulo(titulo);
        validarAnioEstreno(anioEstreno);
        validarDuracion(duracion);
        validarDirector(director);
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.director = director;
    }

    private void validarTitulo(String titulo) throws PeliculaInvalidaException {
        if (titulo == null || titulo.isEmpty()) {
            throw new PeliculaInvalidaException("El titulo no puede ser nulo");
        }
    }

    private void validarAnioEstreno(int anioEstreno) throws PeliculaInvalidaException {
        if (anioEstreno <= 1880) {
            throw new PeliculaInvalidaException("El año de estreno tiene que ser mayor que 1880");
        }
    }

    private void validarDuracion(int duracion) throws PeliculaInvalidaException {
        if (duracion <= 0) {
            throw new PeliculaInvalidaException("La duracion tiene que ser mayor que 0");
        }
    }

    private void validarDirector(String director) throws PeliculaInvalidaException {
        if (director == null || director.isEmpty()) {
            throw new PeliculaInvalidaException("El director no puede ser nulo");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws PeliculaInvalidaException {
        validarTitulo(titulo);
        this.titulo = titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) throws PeliculaInvalidaException {
        validarAnioEstreno(anioEstreno);
        this.anioEstreno = anioEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) throws PeliculaInvalidaException {
        validarDuracion(duracion);
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) throws PeliculaInvalidaException {
        validarDirector(director);
        this.director = director;
    }

    @Override
    public String toString() {
        return titulo + " (" + anioEstreno + ") - " + duracion + " min | Dir: " + director;
    }

    @Override
    public boolean equals(Object obj) {
        Pelicula otro = (Pelicula) obj;
        return (this.titulo.equalsIgnoreCase(otro.titulo) && this.anioEstreno == otro.anioEstreno);
    }

}