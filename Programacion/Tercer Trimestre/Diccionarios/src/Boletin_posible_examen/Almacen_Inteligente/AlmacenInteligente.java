package Boletin_posible_examen.Almacen_Inteligente;

//Ejercicio 4: El Almacén Inteligente
//Contexto: Una tienda de tecnología está teniendo problemas para organizar su stock. Actualmente, cuando llega un producto nuevo,
// lo anotan en un papel sin orden. Te piden desarrollar un programa en Java que organice el inventario por familias o categorías.
//Requerimientos de negocio:
//El sistema debe permitir dar de alta productos indicando a qué categoría pertenecen (por ejemplo: "Cámaras", "Consolas").
// También debe permitir borrarlos según su nombre (un producto puede estar en varias categorías).
//Regla de integridad: No pueden existir dos productos con el mismo nombre dentro de una misma categoría.
//El gerente necesita saber cuántos artículos hay en una categoría concreta en cualquier momento.
//Tu tarea: Diseña la clase y la lógica necesaria. Decide qué colección o combinación de colecciones de Java
// es la más eficiente para buscar por categoría y evitar duplicados internos.

import java.util.*;

public class AlmacenInteligente {

    private Map<String, List<Producto>> productos = new HashMap<>();

    public AlmacenInteligente() {

    }

    public AlmacenInteligente(Map<String, List<Producto>> registro) {
        this.productos = registro;
    }

    public boolean darAlta(String categoria, Producto prod){
        boolean nuevo = false;

        List<Producto> vacia = new ArrayList<>();
        List<Producto> previo = productos.putIfAbsent(categoria, vacia);
        if(previo == null) {
            nuevo = true;
            previo = vacia;
        }

        if(!previo.contains(prod)) {
            nuevo = true;
            previo.add(prod);
        }

        return nuevo;
    }

    // borrar
    public boolean borrar(Producto prod) {
        boolean borrado = false;
//        for(List<Producto> lista: productos.values()) {
//            borrado = borrado || lista.remove(prod);
//        }

        Iterator<List<Producto>> listas = productos.values().iterator();
        while(listas.hasNext()) {
            List<Producto> sigLista = listas.next();
            borrado = borrado || sigLista.remove(prod);
        }


        return borrado;
    }

    // contarProductos
    public int contarProductos(Producto prod) {
        int contador = 0;
        for(Map.Entry<String, List<Producto>> entrada: productos.entrySet()) {
            if(entrada.getValue().contains(prod)) {
                contador++;
            }
        }

        return contador;
    }

    public int contarProductos(String categoria) {
        return productos.getOrDefault(categoria, new ArrayList<>()).size();
    }


    @Override
    public String toString() {
        return "AlmacenInteligente{" +
                "productos=" + productos +
                '}';
    }

}
