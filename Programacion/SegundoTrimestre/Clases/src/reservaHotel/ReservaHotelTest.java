package reservaHotel;

public class ReservaHotelTest {
    public static void main(String[] args) {
        try {
            ReservaHotel reserva1 = new ReservaHotel("HR-1234", "Manuel", 3, 354.50);
            ReservaHotel reserva2 = new ReservaHotel("HR-1234", "Manuel", 3, 354.50);
            System.out.println(reserva1);
            System.out.println(reserva1.equals(reserva2));
        } catch (ReservaInvalidaException e) {
            throw new RuntimeException(e);
        }
    }
}
