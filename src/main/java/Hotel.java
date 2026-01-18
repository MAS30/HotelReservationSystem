public class Hotel {

    private String name;

    public Hotel(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Hotel name cannot be empty");
        }
        this.name = name;
    }

    public void createReservation() {
        // reservation creation logic later
    }

    public boolean available() {
        return true;
    }
}
