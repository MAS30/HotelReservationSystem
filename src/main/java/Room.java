enum RoomState {
    FREE,
    RESERVED,
    OCCUPIED
}

public class Room {

    private int number;
    private RoomState state;
    private Guest occupant;

    public Room(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Room number must be positive");
        }
        this.number = number;
        this.state = RoomState.FREE;
        this.occupant = null;
    }

    public void reserve() {
        if (state != RoomState.FREE) {
            throw new IllegalStateException("Room is not free");
        }
        state = RoomState.RESERVED;
    }

    public void checkIn(Guest guest) {
        if (state != RoomState.RESERVED) {
            throw new IllegalStateException("Room must be reserved before check-in");
        }
        this.occupant = guest;
        state = RoomState.OCCUPIED;
    }

    public void checkOut() {
        if (state != RoomState.OCCUPIED) {
            throw new IllegalStateException("Room is not occupied");
        }
        this.occupant = null;
        state = RoomState.FREE;
    }

    public RoomState getState() {
        return state;
    }

    public int getNumber() {
        return number;
    }
}

