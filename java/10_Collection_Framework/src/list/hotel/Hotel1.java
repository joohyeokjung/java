package list.hotel;

import java.util.ArrayList;
import java.util.Scanner;

import list.hotel_t.Room;

public class Hotel1 {
	private ArrayList<Room1> roomList;
	private Scanner sc = new Scanner(System.in);
	private HotelService1 hsv;
	
	public Hotel1() {
		buildHotel();
		hsv = new HotelServiceImpl(roomList);
		frontDest();
	}

	private void frontDest() {
		int menu = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.println("\n=================== 호텔 관리 메뉴 ====================");
			System.out.println("1:객실현황  2:입실  3:퇴실  4:객실상세조회 5:투숙객조회 Etc:종료");
			System.out.println("------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>>>>>>>>>>>");
			menu = sc.nextInt();
			
			flag = hsv.choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
	}
	
	public void buildHotel() {
		System.out.println("호텔의 층 수 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층 당 방 수 입력 > ");
		int roomCount = sc.nextInt();
		
		initializeRooms(floorCount, roomCount);
	}
	public void initializeRooms(int floorCount, int roomCount) {
		this.roomList = new ArrayList<>();
		
		for (int i = 1; i <= floorCount; i++) {
			for (int j = 1; j <= roomCount; j++) {
				this.roomList.add(new Room1(i+(j<10 ? "0" : "")+j,null,true));
			}
		}
	}
}
