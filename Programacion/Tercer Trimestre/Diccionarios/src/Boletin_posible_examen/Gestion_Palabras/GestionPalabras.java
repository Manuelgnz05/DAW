package Boletin_posible_examen.Gestion_Palabras;

import java.util.*;
import java.util.Map.Entry;

public class GestionPalabras {

    private Map<String, Map<String, Integer>> registro;

    public GestionPalabras() {
        this.registro = new HashMap<>();
    }

    public GestionPalabras(Map<String, Map<String, Integer>> registro) {
        this.registro = registro;
    }

    public void procesarEntrada(String linea){
        String categoria = linea.split(":")[0];
        String palabra = linea.split(":")[1];
        Map<String, Integer> valor = registro.getOrDefault(categoria, new HashMap<>());
        Integer contador = valor.getOrDefault(palabra, 0);
        contador++;
        valor.put(palabra, contador);
        registro.put(categoria, valor);
    }

    public String palabraMasRepetida(String categoria){
        Map<String, Integer> valores = registro.getOrDefault(categoria, new HashMap<>());
        Set<Entry<String, Integer>> claveValor = valores.entrySet();
        Integer maxRep = 0;
        String res = "";
        for (Entry<String, Integer> tupla:claveValor){
            if (tupla.getValue() > maxRep){
                maxRep = tupla.getValue();
                res = tupla.getKey();
            }
        }
        return res;
    }

    public void mostrarInformeGlobal(){
        Set<Entry<String, Map<String, Integer>>> claveValor = registro.entrySet();
        for (Entry<String, Map<String, Integer>> tupla:claveValor){
            System.out.println(tupla.getKey());
            Map<String, Integer> valores = registro.get(tupla.getKey());
            Set<Entry<String, Integer>> dicValores = valores.entrySet();
            for (Entry<String, Integer> tuplaValor:dicValores){
                System.out.println(tuplaValor.getKey() + ": " + tuplaValor.getValue());
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GestionPalabras{" +
                "registro=" + registro +
                '}';
    }
}
