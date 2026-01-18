public class Main {
    public static void main(String[] args) {

        HotelChain chain = new HotelChain("Demo Chain");
        Room room = new Room(101);
        Guest guest = new Guest("Affan");

        room.reserve();               // FREE → RESERVED
        chain.checkInGuest(room, guest);  // RESERVED → OCCUPIED
        chain.checkOutGuest(room);        // OCCUPIED → FREE

        System.out.println("Check-in and check-out executed");
    }
}
