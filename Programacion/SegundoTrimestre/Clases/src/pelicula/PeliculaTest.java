package pelicula;

public class PeliculaTest {
    public static void main(String[] args) {

        try {
            Pelicula p1 = new Pelicula("Titanic", 1900, 200, "Manuel");
            Pelicula p2 = new Pelicula("Titanic", 1900, 200, "Manuel");
            System.out.println(p1);
            System.out.println(p1.equals(p2));
        } catch (PeliculaInvalidaException e) {
            throw new RuntimeException(e);
        }

    }
}

