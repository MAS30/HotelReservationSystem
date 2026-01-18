public class ReserverPayer {

    private String creditCardDetails;
    private int id;

    public ReserverPayer(int id, String creditCardDetails) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID");
        }
        if (creditCardDetails == null || creditCardDetails.isBlank()) {
            throw new IllegalArgumentException("Credit card required");
        }
        this.id = id;
        this.creditCardDetails = creditCardDetails;
    }

    public void create() {
        // creation logic later
    }
}
