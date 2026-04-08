package cuenta;

public class CuentaTest {
    public static void main(String[] args) {
        try {
            CuentaBancaria cuenta1 = new CuentaBancaria("Manuel", -1000);
        } catch (SaldoInvalidoException e) {
            System.out.println("El saldo no puede ser negativo");
        }
    }
}
