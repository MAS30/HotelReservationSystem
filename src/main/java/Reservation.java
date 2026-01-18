import java.time.LocalDate;

public class Reservation {

    private LocalDate reservationDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private int number;

    public Reservation(LocalDate reservationDate,
                       LocalDate startDate,
                       LocalDate endDate,
                       int number) {

        if (reservationDate == null || startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
        if (number <= 0) {
            throw new IllegalArgumentException("Reservation number must be positive");
        }

        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
