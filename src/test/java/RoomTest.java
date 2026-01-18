import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    void shouldReserveFreeRoom() {
        Room room = new Room(101);
        room.reserve();
        assertEquals(RoomState.RESERVED, room.getState());
    }

    @Test
    void shouldCheckInReservedRoom() {
        Room room = new Room(102);
        Guest guest = new Guest("Ali");

        room.reserve();
        room.checkIn(guest);

        assertEquals(RoomState.OCCUPIED, room.getState());
    }

    @Test
    void shouldThrowExceptionIfCheckInWithoutReservation() {
        Room room = new Room(103);
        Guest guest = new Guest("Ahmed");

        assertThrows(IllegalStateException.class,
                () -> room.checkIn(guest));
    }

    @Test
    void shouldCheckOutOccupiedRoom() {
        Room room = new Room(104);
        Guest guest = new Guest("Sara");

        room.reserve();
        room.checkIn(guest);
        room.checkOut();

        assertEquals(RoomState.FREE, room.getState());
    }
}
