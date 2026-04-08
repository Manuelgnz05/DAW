public class Television {
    private String marca;
    private String modelo;
    private float precio;

    public Television(){
        this.marca = "DEFAULT-BRAND";
        this.modelo = "DEFAULT-MODEL";
        this.precio = 0.0f;
    }

    public Television (String marca){
        this();
        this.marca = marca;
    }

    public Television(String marca, String modelo){
        this(marca);
        this.modelo = modelo;
    }

    public Television(String marca, String modelo, float precio){
        this(marca, modelo);
        this.precio = precio;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public float getPrecio(){
        return precio;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo) throws Exception{
        if(modelo == null){
            throw new Exception();
        }else {
            this.modelo = modelo;
        }
    }

    public void setPrecio(float precio){
        if(precio>0){
            this.precio = precio;
        }
    }
}
