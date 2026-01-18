public class HotelChain {

    private String name;

    public HotelChain(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("HotelChain name cannot be empty");
        }
        this.name = name;
    }

    // --- Operations from UML (no heavy logic yet) ---

    public void makeReservation() {
        // will be implemented later
    }

    public void cancelReservation() {
        // will be implemented later
    }

    public void checkInGuest() {
        // will be implemented later
    }

    public void checkOutGuest() {
        // will be implemented later
    }

    // --- Guard methods from UML (simple stubs) ---

    private boolean canMakeReservation() {
        return true;
    }

    private boolean canCancelReservation() {
        return true;
    }

    private boolean canCheckInGuest() {
        return true;
    }

    private boolean canCheckOutGuest() {
        return true;
    }
}
