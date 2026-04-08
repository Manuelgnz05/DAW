package clase1;

public class Persona {

    protected String nombre;
    protected int edad;

    private Persona(){
        this.nombre = "DEFAULT-Name";
        this.edad = 1;
    }

    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public void andar(){
        System.out.println("Estoy andando...");
    }

    @Override
    public String toString() {
        System.out.println("Estamos en la clase Persona");
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
