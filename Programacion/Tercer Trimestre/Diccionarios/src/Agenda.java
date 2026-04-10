import java.util.*;

public class Agenda {

    private Map<String, String> agenda = new HashMap<>();

    public void agregar(String nombre, String telefono) {
        agenda.put(nombre, telefono);
    }

    public String buscar(String nombre) {
        return agenda.get(nombre);
    }

    public void eliminar(String nombre) {
        agenda.remove(nombre);
    }



    public void mostrarContactos() {
        List<String> llavesOrdenadas = new ArrayList<>(agenda.keySet());
        Collections.sort(llavesOrdenadas);
        for (String llave : llavesOrdenadas) {
            System.out.println(llave + ": " + agenda.get(llave));
        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "agenda=" + agenda +
                '}';
    }
}