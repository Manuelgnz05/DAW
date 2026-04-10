import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public static Map<String, Integer> contarPalabras(String texto) {
    Map<String, Integer> mapaConteo = new HashMap<>();
    String[] arrPalabras = texto.toLowerCase().replaceAll("[^\\p{L}\\s]", "").split("\\s+");
    for(String palabra: arrPalabras) {
        int conteo = mapaConteo.getOrDefault(palabra, 0);
        conteo++;
        mapaConteo.put(palabra, conteo);
    }

    return mapaConteo;
}

public static Map<Character, Integer> contarLetras(String palabra) {
    Map<Character, Integer> res = new LinkedHashMap<>();

    palabra = palabra.toLowerCase();
    palabra = palabra.replaceAll("\\s+", "");

    char[] letras = palabra.toCharArray();

    for (char letra : letras) {
        int apariciones = res.getOrDefault(letra, 0);
        apariciones++;
        res.put(letra, apariciones);
    }

    return res;
}

void main() {
}