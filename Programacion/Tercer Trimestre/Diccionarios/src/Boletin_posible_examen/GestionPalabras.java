package Boletin_posible_examen;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GestionPalabras {

    private Map<String, Map<String, Integer>> registro = new HashMap<>();

    public GestionPalabras(Map<String, Map<String, Integer>> registro) {
        this.registro = registro;
    }

    public void procesarEntrada(String linea){
        String categoria = linea.split(":")[0];
        String palabra = linea.split(":")[1];
        Map<String, Integer> valor = registro.getOrDefault(categoria, new HashMap<>());
        Set<Entry<String, Integer>> claveValor = valor.entrySet();
        for (Entry<String, Integer> tupla:claveValor){
            if (tupla.getKey().contains(tupla.getKey())){

            }
            Integer contador = valor.getOrDefault(categoria, 1);
        }
    }

}
