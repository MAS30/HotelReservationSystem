public class Main {

    public static void main(String[] args) {

        HotelChain chain = new HotelChain("Demo Chain");
        Hotel hotel = new Hotel("Four Seasons");
        RoomType type = new RoomType("Deluxe", 5000);
        Room room = new Room(101);

        System.out.println("Commit 1: Domain structure initialized");
    }
}


