public class HotelChain {
    
    private String name;

    public HotelChain(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("HotelChain name cannot be empty");
        }
        this.name = name;
    }

    public void cancelReservation(Hotel hotel, Reservation reservation) {
        hotel.cancelReservation(reservation);
    }

    public void checkInGuest(Room room, Guest guest) {
        if (room == null || guest == null) {
            throw new IllegalArgumentException("Room and guest cannot be null");
        }
        room.checkIn(guest);
        System.out.println("Guest checked in to room " + room.getNumber());
    }

    public void checkOutGuest(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }
        room.checkOut();
        System.out.println("Guest checked out from room " + room.getNumber());
    }
}
