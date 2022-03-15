package list.hotel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelServiceImpl implements HotelService1 {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Room1> roomList;
	
	public HotelServiceImpl(ArrayList<Room1> roomList) {
		this.roomList = roomList;
	}

	@Override
	public boolean choiceMenu(int menu) {
		String roomNum = "";
		switch (menu) {
		case 1:
			getRoomsStatus();
			break;
		case 2:
			System.out.println("입실할 방번호를 입력 >");
			roomNum = sc.next();
			roomCheckIn(roomNum);
			break;
		case 3:
			System.out.println("퇴실할 방번호를 입력 >");
			roomNum = sc.next();
			roomCheckOut(roomNum);
			break;
		case 4:
			System.out.println("조회할 방번호를 입력 >");
			roomNum = sc.next();
			getRoomDetail(roomNum);
			break;
		case 5:
			System.out.println("--------- 투숙객 리스트 ----------");
			getUserList();
			break;
		default:
			System.out.println("저희 호텔을 이용해 주셔서 감사합니다");
			return false;
		}
		return true;
	}

	@Override
	public void getRoomsStatus() {
		for (Room1 room1 : roomList) {
			System.out.print(room1.getRoomNum() + "호");
			System.out.print("[" + (room1.isEmpty() ? "입실가능" : "사용중") + "]");
			System.out.println();
		}

	}

	@Override
	public void roomCheckIn(String roomNum) {
		for (Room1 room1 : roomList) {
			if (room1.getRoomNum().equals(roomNum)) {
				if (room1.isEmpty()) {
					room1.setEmpty(false);
					room1.setUser(getUserInfo());
					LocalDateTime todayNow = LocalDateTime.now();
					room1.setCheckInTime(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));
					room1.setCheckOutTime(null);
					System.out.println(roomNum + "호 입실완료");
				}else {
					System.out.println(roomNum + "호는 현재 사용중!");
				}
				break;
			}
		}

	}

	private User1 getUserInfo() {
		System.out.println("이용자의 정보를 입력해야 합니다");
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("성별 > ");
		char gen = sc.next().charAt(0);
		
		User1 user = new User1(name, age, gen);
		
		return user;
	}

	@Override
	public void roomCheckOut(String roomNum) {
		for (Room1 room1 : roomList) {
			if (room1.getRoomNum().equals(roomNum)) {
				if (!room1.isEmpty()) {
					room1.setEmpty(true);
					room1.setUser(null);
					LocalDateTime todayNow = LocalDateTime.now();
					room1.setCheckOutTime(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));
					room1.setCheckInTime(null);
					System.out.println(roomNum + "호 퇴실완료");
				}else {
					System.out.println(roomNum + "호는 현재 빈방!");
				}
				break;
			}
		}

	}

	@Override
	public void getRoomDetail(String roomNum) {
		for (Room1 room1 : roomList) {
			if (room1.getRoomNum().equals(roomNum)) {
				System.out.println(room1);
				break;
			}
		}

	}

	@Override
	public void getUserList() {
		for (Room1 room1 : roomList) {
			System.out.print(room1.getRoomNum() + "호");
			System.out.println(room1.getUser());
		}

	}

}
