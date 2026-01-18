public class Room {

    private int number;

    public Room(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Room number must be positive");
        }
        this.number = number;
    }

    public void createGuest() {
        // guest assignment handled later
    }
}
