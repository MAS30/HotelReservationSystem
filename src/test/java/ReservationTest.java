import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class ReservationTest {

    @Test
    void shouldCreateValidReservation() {
        Reservation r = new Reservation(
                LocalDate.now(),
                LocalDate.now().plusDays(2),
                123
        );
        assertNotNull(r);
    }

    @Test
    void shouldThrowExceptionForInvalidDates() {
        assertThrows(IllegalArgumentException.class,
                () -> new Reservation(
                        LocalDate.now(),
                        LocalDate.now().minusDays(1),
                        124
                ));
    }
}
