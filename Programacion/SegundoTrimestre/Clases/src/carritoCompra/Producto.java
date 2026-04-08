package carritoCompra;

public class Producto {
    private String nombreProducto;
    private String nombreCategoria;
    private int numeroLote;
    private float precio;

    public Producto(String nombreProducto, String nombreCategoria, int numeroLote, float precio){
        this.nombreProducto = nombreProducto;
        this.nombreCategoria = nombreCategoria;
        this.numeroLote = numeroLote;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
