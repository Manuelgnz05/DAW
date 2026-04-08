package reservaHotel;

//Ejercicio 11: Reserva de HotelClase ReservaHotel
//Atributos privados:
//String codigoReserva
//String nombreCliente
//int numeroNoches
//double precioPorNoche
//Validaciones:
//El código de reserva debe seguir el formato: HR-XXXX (X = dígito).
//El número de noches debe ser mayor que 0.
//El precio por noche debe ser mayor que 0.
//Excepción: ReservaInvalidaExceptionMétodos auxiliares:
//double getPrecioTotal()
//toString()
//Formato exacto:"Reserva HR-XXXX | Cliente: NOMBRE | Noches: N | Total: XX.XX €"
//
//Ejemplo:Reserva HR-4821 | Cliente: Ana Pérez | Noches: 3 | Total: 270.00 €
//equals(Object o)
//Dos reservas se consideran iguales si:
//Tienen el mismo
// si tienen el mismo cliente y el mismo precio total (con un margen de ±0.01)

public class ReservaHotel {

    private String codigoReserva;
    private String nombreCliente;
    private int numeroNoches;
    private double precioPorNoche;

    private ReservaHotel(){
        this.codigoReserva = "DEFAULT-Code";
        this.nombreCliente = "DEFAULT-Name";
        this.numeroNoches = 1;
        this.precioPorNoche = 1;
    }

    public ReservaHotel(String codigoReserva, String nombreCliente, int numeroCoches, double precioPorNoche) throws ReservaInvalidaException {
        this();
        validarCodigo(codigoReserva);
        validarNombre(nombreCliente);
        validarNumCoches(numeroCoches);
        validarPrecioNoche(precioPorNoche);
        this.codigoReserva = codigoReserva;
        this.nombreCliente = nombreCliente;
        this.numeroNoches = numeroCoches;
        this.precioPorNoche = precioPorNoche;
    }

    private void validarCodigo(String codigoReserva) throws ReservaInvalidaException {
        if (!(codigoReserva.matches("HR-[0-9]{4}"))){
            throw new ReservaInvalidaException("El codigo de reserva debe seguir el formato: HR-XXXX (X = dígito).");
        }
    }

    private void validarNombre(String nombreCliente) throws ReservaInvalidaException {
        if (nombreCliente == null || nombreCliente.isEmpty()) {
            throw new ReservaInvalidaException("El nombre no puede estar vacio ni ser null.");
        }
    }

    private void validarNumCoches(int numeroCoches) throws ReservaInvalidaException {
        if (numeroCoches <= 0){
            throw new ReservaInvalidaException("El número de noches debe ser mayor que 0.");
        }
    }

    private void validarPrecioNoche(double precioPorNoche) throws ReservaInvalidaException {
        if (precioPorNoche <= 0){
            throw new ReservaInvalidaException("El precio por noche debe ser mayor que 0.");
        }
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) throws ReservaInvalidaException {
        validarCodigo(codigoReserva);
        this.codigoReserva = codigoReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) throws ReservaInvalidaException {
        validarNombre(nombreCliente);
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroCoches() {
        return numeroNoches;
    }

    public void setNumeroCoches(int numeroCoches) throws ReservaInvalidaException {
        validarNumCoches(numeroCoches);
        this.numeroNoches = numeroCoches;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) throws ReservaInvalidaException {
        validarPrecioNoche(precioPorNoche);
        this.precioPorNoche = precioPorNoche;
    }

    public double getPrecioTotal(){
        return numeroNoches*precioPorNoche;
    }

    @Override
    public String toString() {
        return "Reserva " + codigoReserva + " | Cliente: " + nombreCliente + " | Noches: " + numeroNoches + " | Total: " + getPrecioTotal() + "€";
    }

    public boolean equals(Object obj){
        ReservaHotel otro = (ReservaHotel) obj;
        return this.codigoReserva.equals(otro.codigoReserva) && this.nombreCliente.equals(otro.nombreCliente) && this.getPrecioTotal() == otro.getPrecioTotal();
    }

}
