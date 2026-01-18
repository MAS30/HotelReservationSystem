import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoomTypeTest {

    @Test
    void shouldCreateValidRoomType() {
        RoomType type = new RoomType("Deluxe", 3000);
        assertNotNull(type);
    }

    @Test
    void shouldThrowExceptionForInvalidCost() {
        assertThrows(IllegalArgumentException.class,
                () -> new RoomType("Deluxe", -1));
    }
}
