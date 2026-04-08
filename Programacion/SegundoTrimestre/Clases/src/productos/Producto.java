package productos;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(){
        nombre = "DEFAULT-Name";
        precio = 0;
        stock = 0;
    }

    public Producto(String nombre, double precio, int stock){
        this();
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void validarPrecio(double precio) throws PrecioInvalidoException {
        if (precio < 0){
            throw new PrecioInvalidoException();
        }
    }

    public void vender(int cantidad) throws CantidadInvalidaException {
        if (cantidad > stock){
            throw new CantidadInvalidaException();
        }
        stock -= cantidad;
    }

    public void reponer(int cantidad) throws CantidadInvalidaException {
        stock += cantidad;
    }

    public boolean hayStock(){
        return stock > 0;
    }

}
