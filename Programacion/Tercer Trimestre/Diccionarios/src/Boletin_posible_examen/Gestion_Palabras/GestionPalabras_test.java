package Boletin_posible_examen.Gestion_Palabras;

public class GestionPalabras_test {
    static void main() {

        GestionPalabras g1 = new GestionPalabras();
        GestionPalabras g2 = new GestionPalabras();
        System.out.println(g1);
        g1.procesarEntrada("FRUTA:Manzana");
        System.out.println(g1);
        g1.procesarEntrada("FRUTA:Manzana");
        System.out.println(g1);
        g1.procesarEntrada("FRUTA:Platano");
        System.out.println(g1);
        g1.procesarEntrada("CHUCHES:Llave ácida");
        System.out.println(g1);
        System.out.println(g1.palabraMasRepetida("CHUCHES"));
        g1.mostrarInformeGlobal();

    }
}
