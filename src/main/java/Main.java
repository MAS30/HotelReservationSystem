import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        HotelChain chain = new HotelChain("Demo Chain");
        Hotel hotel = new Hotel("Four Seasons");

        Reservation reservation = chain.makeReservation(
                hotel,
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 2, 5)
        );

        System.out.println("Reservation created with number: "
                + reservation.getNumber());
    }
}
