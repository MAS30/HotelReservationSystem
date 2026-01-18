public class Guest {

    private String name;

    public Guest(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Guest name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
