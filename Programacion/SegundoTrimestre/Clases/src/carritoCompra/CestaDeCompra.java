package carritoCompra;

public class CestaDeCompra {
    private Producto[] arrayProducto = new Producto[50];
    public static void precioCliente(Producto[] producto){
        float precio = 0f;
        for (Producto p:producto){
            precio += p.getPrecio();
        }
        System.out.println(precio);
    }
}
