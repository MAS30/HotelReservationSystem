public class Main {

    public static void main(String[] args) {

        System.out.println(">>> HOTEL RESERVATION SYSTEM DEMO <<<");

        // Initialize system
        HotelChain chain = new HotelChain("Demo Chain");
        Room room = new Room(101);
        Guest guest = new Guest("Affan Siddiqui");

        // Reservation lifecycle
        room.reserve();                      // FREE → RESERVED
        chain.checkInGuest(room, guest);     // RESERVED → OCCUPIED
        chain.checkOutGuest(room, guest);            // OCCUPIED → FREE

        System.out.println(">>> DEMO COMPLETED SUCCESSFULLY <<<");
    }
}
