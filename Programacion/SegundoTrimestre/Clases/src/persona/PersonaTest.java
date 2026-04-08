package persona;

public class PersonaTest {
    public static void main(String[] args) {
        try {
            Persona persona = new Persona("Manuel", "12345678A", 21);
            Persona persona2 = new Persona("Manuel", "12345678A", 21);
            System.out.println(persona);
            System.out.println(persona.equals(persona2));
        } catch (PersonaInvalidaException e) {
            throw new RuntimeException(e);
        }
    }
}
