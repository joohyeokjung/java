package list.hotel;

public class Room1 {
	private String roomNum;
	private User1 user;
	private boolean empty;
	private String checkInTime;
	private String checkOutTime;
	
	public Room1() {}

	public Room1(String roomNum, User1 user, boolean empty) {
		this.roomNum = roomNum;
		this.user = user;
		this.empty = empty;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public User1 getUser() {
		return user;
	}

	public void setUser(User1 user) {
		this.user = user;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Override
	public String toString() {
		return "Room1 [roomNum=" + roomNum + ", user=" + user + ", empty=" + empty + ", checkInTime=" + checkInTime
				+ ", checkOutTime=" + checkOutTime + "]";
	}

	

	
	
	
}
