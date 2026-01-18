public class RoomType {

    private String kind;
    private double cost;

    public RoomType(String kind, double cost) {
        if (kind == null || kind.isBlank()) {
            throw new IllegalArgumentException("Room type is required");
        }
        if (cost <= 0) {
            throw new IllegalArgumentException("Room cost must be positive");
        }
        this.kind = kind;
        this.cost = cost;
    }
}
