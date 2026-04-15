package Boletin_posible_examen;

import java.util.*;
import java.util.Map.Entry;

public class GestionPaquetes{

    private Map<String, List<Paquete>> registro = new TreeMap<>();

    public void asignarPaquete(String ciudad, Paquete p){
        List<Paquete> paquetes;
        if (!(registro.containsKey(ciudad))){
            paquetes = new ArrayList<>();
        }else {
            paquetes = registro.get(ciudad);
        }
        paquetes.add(p);
        Collections.sort(paquetes);
        registro.put(ciudad, paquetes);
    }

    public Paquete enviarPaqueteMasPesado(String ciudad){
        Set<Entry<String, List<Paquete>>> dicc = registro.entrySet();
        double maxValor = 0;
        Paquete maxPaquete = null;
        for (Entry<String, List<Paquete>> tupla:dicc){
            if (tupla.getKey().equalsIgnoreCase(ciudad)){
                List<Paquete> valor = registro.get(tupla.getKey());
                for (Paquete paquete:valor){
                    if (paquete.getPeso()>maxValor){
                        maxValor = paquete.getPeso();
                        maxPaquete = paquete;
                    }
                }
                for (Paquete paquete:valor){
                    if (paquete.getPeso() == maxValor){
                        valor.remove(maxPaquete);
                    }
                }
            }
        }
        return maxPaquete;
    }

    /*
    List<Paquete> listaPaquetes = registro.get(ciudad);

        Double mayorPeso = 0.0;
        Paquete masPesado = null;
        for (Paquete paquete : listaPaquetes) {
            Double peso = paquete.getPeso();
            if (peso > mayorPeso) {
                mayorPeso = peso;
                masPesado = paquete;
            }
        }

        listaPaquetes.remove(masPesado);

        return masPesado;
     */

    public Map<String,Double> obtenerPesoTotalPorCiudad() {
        Map<String,Double> nuevoMapa = new HashMap<>();
        for(Map.Entry<String, List<Paquete>> entrada: registro.entrySet()) {
            double peso = 0.0;
            for(Paquete p: entrada.getValue()) {
                peso += p.getPeso();
            }
            nuevoMapa.put(entrada.getKey(), peso);
        }

        return nuevoMapa;
    }

    @Override
    public String toString() {
        return "GestionPaquetes{" +
                "registro=" + registro +
                '}';
    }

}
