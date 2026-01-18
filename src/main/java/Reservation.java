public class Reservation {
    private int number;
    private boolean cancelled = false;

    public Reservation(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void cancel() {
        this.cancelled = true;
    }

    public boolean isCancelled() {
        return cancelled;
    }
}
