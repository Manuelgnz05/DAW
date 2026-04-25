package Boletin_posible_examen.Control_Pasajeros;

//Ejercicio 5: Control de Pasajeros (FlightCheck)
//Contexto: Una aerolínea de bajo coste necesita un software para gestionar los manifiestos de carga de sus vuelos.
// Cada vuelo se identifica por un código alfanumérico único.
//Requerimientos de negocio:
//El sistema debe permitir registrar a los pasajeros en un vuelo determinado.
//Seguridad: Un pasajero no puede estar registrado dos veces en el mismo vuelo. El sistema no debe distinguir entre "JUAN" y "juan".
//Debe existir una función para dar de baja a un pasajero si este solicita una cancelación.
//Al final del día, el sistema debe generar una alerta que muestre qué códigos de vuelo están "Saturados"
// (aquellos que han alcanzado o superado un límite de plazas definido por el usuario).
//Tu tarea: Implementa el motor de esta lógica. Elige la estructura que mejor relacione los vuelos con sus listas de personas
// y asegúrate de que las búsquedas y eliminaciones sean consistentes.


import java.util.*;
import java.util.Map.Entry;

public class ControlPasajeros {

    private Map<String, List<Pasajero>> registro = new HashMap<>();

    public ControlPasajeros() {

    }

    public ControlPasajeros(Map<String, List<Pasajero>> registro) {
        this.registro = registro;
    }

    public boolean regitrarPasajero(String vuelo, Pasajero pasajero){
        boolean valido = false;
        List<Pasajero> vacia = new ArrayList<>();
        List<Pasajero> previo = registro.putIfAbsent(vuelo, vacia);
        if (previo == null){
            valido = true;
            previo = vacia;
        }

        boolean esta = false;
        for (Pasajero valor:previo){
            if (pasajero.getNombre().toUpperCase().equals(valor.getNombre().toUpperCase())){
                esta = true;
            }
        }

        if (!esta){
            valido = true;
            previo.add(pasajero);
        }
        return valido;
    }

    public boolean darBaja(String vuelo, Pasajero pasajero){
        boolean valido = false;
        List<Pasajero> pasajeros = registro.get(vuelo);
        if (pasajeros == null){
            return valido;
        }
        for (Pasajero valor:pasajeros){
            if (valor.getNombre().toUpperCase().equals(pasajero.getNombre().toUpperCase())){
                valido = valido || pasajeros.remove(valor);
            }
        }
        return valido;
    }

    public List<String> generarAlerta(int numeroPlazas){
        List<String> res = new ArrayList<>();
        Set<Entry<String, List<Pasajero>>> claveValor = registro.entrySet();
        for (Entry<String, List<Pasajero>> tupla:claveValor){
            if (tupla.getValue().size() >= numeroPlazas){
                res.add(tupla.getKey());
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "ControlPasajeros{" +
                "registro=" + registro +
                '}';
    }
}
