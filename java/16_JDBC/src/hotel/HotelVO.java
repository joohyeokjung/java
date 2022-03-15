package hotel;

public class HotelVO {
	private int roomNum;
	private String name;
	private int age;
	private String gen;
	private boolean empty;
	private String checkInTime;
	private String checkOutTime;

	public HotelVO() {}

	public HotelVO(int roomNum) {
		this.roomNum = roomNum;
	}
	public HotelVO(int roomNum, String name, int age, String gen) {
		this.roomNum = roomNum;
		this.name = name;
		this.age = age;
		this.gen = gen;
	}
	
	public HotelVO(int roomNum, String name, int age, String gen, boolean empty, String checkInTime) {
		this(roomNum,name,age,gen);
		this.empty = empty;
		this.checkInTime = checkInTime;
	}
	public HotelVO(int roomNum, String name, int age, String gen, boolean empty, String checkInTime, String checkOutTime) {
		this(roomNum,name,age,gen,empty,checkInTime);
		this.checkOutTime = checkOutTime;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
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
		return checkInTime;
	}
	
	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Override
	public String toString() {
		return "HotelVO [roomNum=" + roomNum + ", name=" + name + ", age=" + age + ", gen=" + gen + ", empty=" + empty
				+ ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + "]";
	}
	
	
	
}
