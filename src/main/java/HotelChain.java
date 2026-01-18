import java.time.LocalDate;

public class HotelChain {

    private String name;

    public HotelChain(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("HotelChain name cannot be empty");
        }
        this.name = name;
    }

    public Reservation makeReservation(Hotel hotel,
                                       LocalDate startDate,
                                       LocalDate endDate) {

        if (hotel == null) {
            throw new IllegalArgumentException("Hotel cannot be null");
        }

        if (!hotel.available()) {
            throw new IllegalStateException("Hotel not available");
        }

        // simple reservation number (for demo)
        int reservationNumber = (int) (Math.random() * 1000) + 1;

        return hotel.createReservation(startDate, endDate, reservationNumber);
    }

    public void cancelReservation() {
        // later
    }

    public void checkInGuest() {
        // later
    }

    public void checkOutGuest() {
        // later
    }
}
