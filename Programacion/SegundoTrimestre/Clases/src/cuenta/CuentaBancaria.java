package cuenta;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    private CuentaBancaria(){
        titular = "DEFAULTOwner";
        saldo = 0;
    }

    public CuentaBancaria(String titular, double saldo) throws SaldoInvalidoException {
        this();
        validarSaldo(saldo);
        this.titular = titular;
        this.saldo = saldo;
    }

    private void validarSaldo(double saldo) throws SaldoInvalidoException {
        if (saldo < 0){
            throw new SaldoInvalidoException("El saldo no puede ser negativo");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() throws SaldoInvalidoException {
        validarSaldo(saldo);
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad) throws IngresoInvalidoException {
        if (cantidad < 0){
            throw new IngresoInvalidoException();
        }
        saldo += cantidad;
    }

    public void retirar(double cantidad) throws RetiroInvalidoException, SaldoInvalidoException {
        if (cantidad < 0){
            throw new RetiroInvalidoException();
        } else if (cantidad > saldo) {
            throw new SaldoInvalidoException("Saldo insuficiente");
        }
        saldo -= cantidad;
    }
}
