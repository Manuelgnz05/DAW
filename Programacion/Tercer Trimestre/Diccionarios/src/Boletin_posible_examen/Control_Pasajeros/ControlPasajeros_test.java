package Boletin_posible_examen.Control_Pasajeros;

import java.util.List;

public class ControlPasajeros_test {
    static void main() {
        Pasajero p1 = new Pasajero("Manuel");
        Pasajero p2 = new Pasajero("Lucia");
        Pasajero p3 = new Pasajero("Fran");
        Pasajero p4 = new Pasajero("manuel");
        ControlPasajeros registro = new ControlPasajeros();
        boolean valido = registro.regitrarPasajero("96954F", p1);
        System.out.println(valido);
        System.out.println(registro);
        valido = registro.regitrarPasajero("96954F", p4);
        registro.regitrarPasajero("96954F", p2);
        System.out.println(valido);
        System.out.println(registro);

        valido = registro.darBaja("96954F", p4);
        System.out.println(valido);
        System.out.println(registro);
        valido = registro.darBaja("96954F", p3);
        System.out.println(valido);
        System.out.println(registro);
        registro.regitrarPasajero("96954F", p3);
        registro.regitrarPasajero("96954F", p1);
        registro.regitrarPasajero("23554D", p1);
        registro.regitrarPasajero("23554D", p2);
        registro.regitrarPasajero("23554D", p3);

        List<String> vuelos = registro.generarAlerta(2);
        System.out.println(vuelos);
        System.out.println(registro);

    }
}
