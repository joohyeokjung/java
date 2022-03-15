package list.hotel;

public interface HotelService1 {

	boolean choiceMenu(int menu);
	void getRoomsStatus();
	void roomCheckIn(String roomNum);
	void roomCheckOut(String roomNum);
	void getRoomDetail(String roomNum);
	void getUserList();
}
