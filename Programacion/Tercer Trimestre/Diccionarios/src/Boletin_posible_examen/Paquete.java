package Boletin_posible_examen;

public class Paquete implements Comparable<Paquete>{

    private String id;
    private Double peso;
    private int prioridad;

    public Paquete(String id, Double peso, int prioridad) throws PrioridadException {
        this.id = id;
        this.peso = peso;
        validarPrioridad(prioridad);
        this.prioridad = prioridad;
    }

    private void validarPrioridad(int prioridad) throws PrioridadException {
        if (prioridad > 3 || prioridad < 1){
            throw new PrioridadException("La prioridad tiene que estar entre 1 y 3");
        }
    }

    public String getId() {
        return id;
    }

    public Double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paquete o) {
        return this.prioridad - o.prioridad;
    }
}
