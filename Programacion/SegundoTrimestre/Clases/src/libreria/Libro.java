package libreria;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean prestado;

    public Libro(){
        titulo = "DEFAULT-Title";
        autor = "DEFAULT-Author";
        numeroPaginas = 0;
        prestado = false;
    }

    public Libro(String titulo, String autor, int numeroPaginas, boolean prestado) throws PaginasInvalidasException {
        this();
        validarPaginas(numeroPaginas);
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.prestado = prestado;
    }

    private void validarPaginas(int numeroPaginas) throws PaginasInvalidasException {
        if (numeroPaginas < 0){
            throw new PaginasInvalidasException();
        }
    }

    public void prestar(){
        prestado = true;
    }

    public void devolver(){
        prestado = false;
    }

    public boolean estaPrestado(){
        return prestado;
    }

}
