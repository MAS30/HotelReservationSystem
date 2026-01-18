import java.time.LocalDate;

public class Hotel {

    private String name;

    public Hotel(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Hotel name cannot be empty");
        }
        this.name = name;
    }

    public Reservation createReservation(LocalDate startDate,
                                         LocalDate endDate,
                                         int reservationNumber) {

        return new Reservation(
                LocalDate.now(),
                startDate,
                endDate,
                reservationNumber
        );
    }

    public boolean available() {
        return true; // simplified for now
    }
}
