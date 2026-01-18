public class Hotel {

    public void cancelReservation(Reservation reservation) {
        reservation.cancel();
        System.out.println("Reservation " + reservation.getNumber() + " cancelled");
    }
}
