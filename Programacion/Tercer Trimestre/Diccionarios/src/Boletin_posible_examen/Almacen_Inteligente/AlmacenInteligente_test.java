package Boletin_posible_examen.Almacen_Inteligente;


public class AlmacenInteligente_test {
    static void main() {

        AlmacenInteligente almacen = new AlmacenInteligente();
        boolean ret = almacen.darAlta("Electronica", new Producto("Raton Logitech MK3"));
        System.out.println(ret);
        ret = almacen.darAlta("Menaje", new Producto("Cucharas A. inox"));
        System.out.println(ret);
        ret = almacen.darAlta("Menaje", new Producto("Cucharas A. inox"));
        ret = almacen.darAlta("Menaje", new Producto("Cucharas de madera"));
        ret = almacen.darAlta("Electronica", new Producto("Cucharas A. inox"));
        System.out.println(ret);
        System.out.println(almacen);
        System.out.println(almacen.borrar(new Producto("Raton Logitech MK3")));
        System.out.println(almacen);
        System.out.println(almacen.borrar(new Producto("Tenedores acero")));
        System.out.println(almacen);
        System.out.println(almacen.contarProductos(new Producto("Cucharas A. inox")));
        System.out.println(almacen.contarProductos(new Producto("Sillas")));
        System.out.println(almacen.contarProductos("Menaje"));
        System.out.println(almacen.contarProductos("Videojuegos"));

    }
}
