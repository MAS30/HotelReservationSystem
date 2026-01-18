public class Main {
    public static void main(String[] args) {

        HotelChain chain = new HotelChain();
        Hotel hotel = new Hotel();
        Reservation reservation = new Reservation(828);

        chain.cancelReservation(hotel, reservation);

        System.out.println("Commit 3: cancelReservation executed");
    }
}
