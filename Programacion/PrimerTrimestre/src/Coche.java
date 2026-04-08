public class Coche {
    public static void main(String[] args) {
        arrancarMotor();
        System.out.println("Haciendo otras tareas...");
        arrancarMotor();
        Utilidades.imprimir("gracias");
        float resultado = Utilidades.sumar(6.7f, 9);
    }

    public static void arrancarMotor(){
        System.out.println("Motor arrancado");
    }
}
