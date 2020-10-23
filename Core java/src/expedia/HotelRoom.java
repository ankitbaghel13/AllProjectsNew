package expedia;

public class HotelRoom extends Room{
	
	public int getQuantity() {
		return 1;
	}
	
	public void getHotelRoomDetails() {
		System.out.println("Hotel room");
	}

	public static void main(String[] args) {
		Room room = new HotelRoom();
		System.out.println(room.getQuantity());
		room.getRoomDetails();
		//room.getHotelRoomDetails(); CLE
		
		HotelRoom hotelRoom = new HotelRoom();
		System.out.println(hotelRoom.getQuantity());
		hotelRoom.getRoomDetails();
		hotelRoom.getHotelRoomDetails();
		
		Room room1 = new Room();
		System.out.println(room1.getQuantity());
		room1.getRoomDetails();
		//room1.getHotelRoomDetails(); CLE
		
		/*
		 * HotelRoom hotelRoom = new Room();
		 * System.out.println(hotelRoom.getQuantity()); hotelRoom.getRoomDetails();
		 * hotelRoom.getHotelRoomDetails();
		 */
	}
}
