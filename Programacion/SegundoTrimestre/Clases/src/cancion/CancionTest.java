package cancion;

public class CancionTest {
    public static void main(String[] args) {
        try {
            Cancion cancion1 = new Cancion("Chuos", "Quevedo y Jushep", 600);
            Cancion cancion2 = new Cancion("Chuos", "Quevedo y Jushep", 200);
            System.out.println(cancion1);
            System.out.println(cancion1.equals(cancion2));
        } catch (CancionInvalidaException e) {
            throw new RuntimeException(e);
        }
    }
}
