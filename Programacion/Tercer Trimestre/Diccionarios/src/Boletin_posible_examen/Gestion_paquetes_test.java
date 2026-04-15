package Boletin_posible_examen;

public class Gestion_paquetes_test {
    static void main() {
        GestionPaquetes gestor2 = new GestionPaquetes();
        try {
            gestor2.asignarPaquete("Huelva", new Paquete("1", 4.6, 3));
            gestor2.asignarPaquete("Huelva", new Paquete("2", 1.6, 2));
            gestor2.asignarPaquete("Huelva", new Paquete("3", 2.6, 2));
            gestor2.asignarPaquete("Bogotá", new Paquete("1", 5.6, 1));
            gestor2.asignarPaquete("Bogotá", new Paquete("2", 0.4, 1));
            //System.out.println(gestor2.enviarPaqueteMasPesado("Huelva")); lanza excepcion
            System.out.println(gestor2);
            System.out.println(gestor2.obtenerPesoTotalPorCiudad());
        } catch (PrioridadException e) {
            throw new RuntimeException(e);
        }

    }

}
