public class Guest {

    private String name;
    private String addressDetails;

    public Guest(String name, String addressDetails) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Guest name required");
        }
        if (addressDetails == null || addressDetails.isBlank()) {
            throw new IllegalArgumentException("Address required");
        }
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public void create() {
        // guest creation logic later
    }
}
