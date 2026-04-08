package boletin_tierra_media;

public abstract class SerTierraMedia {

    /*Ejercicio 1: todas las razas humanoides de Tolkien (elfos, enanos, hombres, orcos y
hobbits) descienden de un ancestro común que llegó a la Tierra Media y era capaz de
hablar y moverse. Los seres de esta raza inicial tenían un nombre que los identificaba a
cada uno de ellos y los distinguía del resto. También tenían un apellido y un apodo. Cree
una clase SerTierraMedia que modele la raza inicial (y solo la raza inicial). Los métodos
para hablar y moverse no devuelven nada, y reciben una cadena de texto con la frase que
se quiere decir y el lugar al que se quiere mover.
     */

    protected String nombre;
    protected String apellido;
    protected String apodo;

    private SerTierraMedia(){
        this.nombre = "DEFAULT-NAME";
        this.apellido = "DEFAUTLT-SURNAME";
        this.apodo = "DEFAULT-NICKNAME";
    }

    public SerTierraMedia(String nombre, String apellido, String apodo){
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
    }

    public final void hablar(String texto){
        System.out.println(texto);
    }

    public final void mover(String lugar){
        System.out.println("Se ha movido a " + lugar);
    }

    @Override
    public String toString() {
        return "SerTierraMedia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", apodo='" + apodo + '\'' +
                '}';
    }

}
