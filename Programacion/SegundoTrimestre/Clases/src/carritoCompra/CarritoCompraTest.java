package carritoCompra;

public class CarritoCompraTest {
    public static void main(String[] args) {
        Producto p1 = new Producto("Tomate", "Verdura", 1, 3.6f);
        Producto p2 = new Producto("Queso", "Lacteos", 2, 8.2f);
        Producto p3 = new Producto("Pan", "Panadería", 3, 1.4f);
        Producto[] array = {p1, p2, p3};
        CestaDeCompra.precioCliente(array);
    }
}
