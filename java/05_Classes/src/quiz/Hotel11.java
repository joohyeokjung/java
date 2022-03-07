package quiz;

import java.util.Iterator;
import java.util.Scanner;

class HotelRoom {
	private int floor;
	private int room;
	
	public HotelRoom() {}
	
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int create(int floor, int room) {
		int roomNum = 0;
		int[][] hotelCreate = new int[floor][room];
		for (int i = 0; i < hotelCreate.length; i++) {
			for (int j = 0; j < hotelCreate[i].length; j++) {
				System.out.print((i+1) + (j < 9 ? "0" : "") + (j+1) + "호:");
				System.out.print(hotelCreate[i][j] == 0 ? "입실가능" : "사용중");
				System.out.print("\t");
			}
		}
		return roomNum;
	}
}
class HotelInfo {
	private int floor;
	private int room;
	
	public HotelInfo() {}
	
	public HotelInfo(int floor, int room, User name) {
		this.floor = floor;
		this.room = room;
	}
}

class User1 {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User1() {}
}
public class Hotel11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HotelRoom hotelR = new HotelRoom();
		hotelR.create(5, 3);
	}

}
