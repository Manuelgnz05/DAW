import java.util.*;
import java.util.Map.Entry;

public class Clase {

    public static void main(String[] args) {
//        Map<String, Float> mapaProductos = new HashMap<>();
//        mapaProductos.put("Filipinos blancos", 1.40f);
//        mapaProductos.put("Monster blanco", 1.90f);
//        mapaProductos.put("Palmera de huevo", 2.10f);
//        System.out.println(mapaProductos);
//        float precio = mapaProductos.get("Palmera de huevo");
//        System.out.println(precio);

//        Map<String, String> dicc = new HashMap<>();
//        dicc.put("hello","hola");
//        dicc.put("bad","malo");
//        dicc.put("song","cancion");
//        dicc.put("red","rojo");
//        System.out.println("Traducción de 'hello': "+dicc.get("hello"));
//        System.out.println("Traducción de 'HELLO': "+dicc.get("HELLO"));

//        Map<String, String> dicc = new HashMap<>();
//        dicc.put("hello","hola");
//        dicc.put("bad","malo");
//        dicc.put("good","bien");
//        dicc.put("great","bien");
//        String valor = dicc.remove("Hello");
//        System.out.println(valor);
//        System.out.println(dicc);
//        System.out.println("*******");

        Map<String, List<String>> dicc = new HashMap<>();
        String userName1 = "MGC3633Mag";
        String userName2 = "manuelgnz";
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        dicc.put(userName1, lista1);
        dicc.put(userName2, lista2);
        System.out.println(dicc);
        lista1.add("Fifa 26");
        lista1.add("Far cry");
        lista1.add("NBA 2k 26");
        System.out.println(dicc);

        Map<String, Float> mapaProductos = new HashMap<>();
        mapaProductos.put("Filipinos Blancos", 1.40f);
        mapaProductos.put("Monster Blanco", 1.90f);
        mapaProductos.put("Palmera de huevo", 2.10f);

        Set<Entry<String, Float>> products = mapaProductos.entrySet();
        for (Entry<String, Float> product:products){
            System.out.println(product.getKey() + " - " + product.getValue());
        }

        for (String clave : mapaProductos.keySet()){
            System.out.println(clave+" - "+mapaProductos.get(clave));
        }

        Map<String, List<String>> mapaComidas = new HashMap<>();
        List<String> comidasJorge = new ArrayList<>();
        comidasJorge.add("Huevo frito");
        comidasJorge.add("Serranito");
        comidasJorge.add("Pollo frito");
        List<String> comidasDavid = new ArrayList<>();
        comidasDavid.add("Sushi");
        comidasDavid.add("Kebap");
        comidasDavid.add("Ramen");
        mapaComidas.put("Jorge", comidasJorge);
        mapaComidas.put("David", comidasDavid);
        System.out.println(mapaComidas);

        Set<Entry<String, List<String>>> comidas = mapaComidas.entrySet();
        for (Entry<String, List<String>> comida:comidas){
            System.out.println(comida.getKey() + " - " + comida.getValue());
        }

    }
}
