package Boletin_posible_examen.Red_Climatica;

import Boletin_posible_examen.CiudadException;

import java.util.*;

//Ejercicio 6: Monitorización de Estaciones Meteorológicas
//Contexto: Una red de estaciones climáticas envía datos de temperatura cada hora. Cada dato viene acompañado del nombre de la ciudad donde se
//ha tomado la medida.
//Requerimientos de negocio:
//El sistema debe ir almacenando todas las temperaturas que se reciban de cada ciudad para poder consultar el histórico.
//El meteorólogo jefe quiere poder consultar las temperaturas de una ciudad específica, pero necesita que
//aparezcan ordenadas de frío a calor para facilitar el análisis, sin que esto altere el orden en el que se guardaron originalmente los datos.
//Se requiere una función que, al indicarle una ciudad, genere un mensaje informativo mostrando cuál ha sido la temperatura más alta y cuál
//la más bajas registradas hasta la fecha. Si de esa ciudad aún no hay datos, el sistema debe avisar amigablemente.
//Tu tarea: Desarrolla el componente encargado de gestionar estos datos. Deberás decidir cómo guardar múltiples valores numéricos asociados a
//una misma ubicación y cómo procesarlos para extraer estadísticas.

public class RedClimatica {

    private Map<String, List<Float>> registro = new HashMap<>();

    public RedClimatica() {

    }

    public RedClimatica(Map<String, List<Float>> registro) {
        this.registro = registro;
    }

    public void regitrarValor(String ciudad, float temperatura){
        List<Float> temperaturas = registro.getOrDefault(ciudad, new ArrayList<>());
        temperaturas.add(temperatura);
        registro.put(ciudad, temperaturas);
    }

//    public void registrarValor(String ciudad, float temperatura) {
//        registro.computeIfAbsent(ciudad, k -> new ArrayList<>())
//                .add(temperatura);
//    }

    public List<Float> consultarTempCiudad(String ciudad) throws CiudadException {
        List<Float> res = registro.get(ciudad);
        if (res == null){
            throw new CiudadException("La ciudad que a puesto no esta registrada.");
        }
        res.sort(Comparator.naturalOrder());
        return res;
    }

    public List<Float> tempMaxYMin(String ciudad) throws CiudadException {
        List<Float> res = new ArrayList<>();
        List<Float> temp = registro.get(ciudad);
        if (temp == null){
            throw new CiudadException("La ciudad que a puesto no esta registrada.");
        }
        temp.sort(Comparator.naturalOrder());
        float max = temp.getLast();
        float min = temp.getFirst();
        res.add(min);
        res.add(max);
        return res;
    }

    @Override
    public String toString() {
        return "RedClimatica{" +
                "registro=" + registro +
                '}';
    }
}
