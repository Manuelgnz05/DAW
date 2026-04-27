package Boletin_posible_examen.Gestor_Contenido;

import java.util.*;
import java.util.Map.Entry;

//Se desea desarrollar una aplicación que gestione contenidos audiovisuales
//(películas, series, etc.) y su consumo por parte de usuarios.
//Cada usuario puede visualizar múltiples contenidos, y cada contenido puede ser visto por múltiples usuarios.
//
//Requisitos
//
//Registrar contenidos en el sistema.
//
//Registrar visualizaciones de usuarios.
//
//Evitar duplicidades de usuarios según un criterio lógico.
//
//Calcular cuántas veces ha sido visualizado cada contenido.
//
//Obtener un ranking de contenidos según popularidad.
//
//Mostrar los usuarios con mayor actividad.
//
//Permitir consultar si un usuario ha visto un contenido concreto.
//
//Consideraciones
//El alumno debe decidir cómo modelar usuarios y contenidos.
//Se valorará el uso de estructuras que permitan agrupar información.
//Se espera el uso de ordenación mediante mecanismos adecuados.
//La definición de igualdad entre objetos es parte esencial del ejercicio.

public class GestorContenido {

    private Map<Contenido, Set<Usuario>> registro = new HashMap<>();

    public GestorContenido() {
    }

    public GestorContenido(Map<Contenido, Set<Usuario>> registro) {
        this.registro = registro;
    }

    public void registrarContenido(Contenido contenido, Usuario usuario){
        registro.putIfAbsent(contenido, new HashSet<>());
        registro.get(contenido).add(usuario);
    }

    public int visualizacionesUsuario(Usuario usuario){
        int contador = 0;
        Set<Entry<Contenido, Set<Usuario>>> claveValor = registro.entrySet();
        for (Entry<Contenido, Set<Usuario>> tupla:claveValor){
            for (Usuario valor:tupla.getValue()){
                if (valor.equals(usuario)){
                    contador++;
                }
            }
        }
        return contador;
    }

    public int visualizacionesContenido(Contenido contenido){
        return registro.getOrDefault(contenido, new HashSet<>()).size();
    }

    public List<Contenido> rankingContenido(){

    }

    public boolean consultarUsuarioVistoContenido(Contenido contenido, Usuario usuario){
        return registro.getOrDefault(contenido, new HashSet<>()).contains(usuario);
    }

}
