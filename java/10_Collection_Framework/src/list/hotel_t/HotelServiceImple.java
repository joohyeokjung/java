package list.hotel_t;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


public class HotelServiceImple implements HotelService {
	private Scanner sc = new Scanner(System.in); // 전역 변수
	private List<Room> roomList; // 전역 변수
	
	public HotelServiceImple(List<Room> roomList) {
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
	public void getRoomsStatus() { // 1.객식현황 만들기
		for (Room room : roomList) {
			System.out.print(room.getRoomNum() + "호");
			System.out.print("[" + (room.isEmpty() ? "입실가능" : "사용중") + "]\t");
			System.out.println();
		}

	}

	@Override
	public void roomCheckIn(String roomNum) { // 2.입실 방번호 선택
		for (Room room : roomList) {
			if (room.getRoomNum().equals(roomNum)) {
				if (room.isEmpty()) {
					room.setEmpty(false);
					room.setUser(getUserInfo()); // 유저정보 받기 유저정보 넣기
					LocalDateTime todayNow = LocalDateTime.now();
					room.setCheckInTime(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow)); // 날짜, 시간 포맷팅하기!
					room.setCheckOutTime(null);
					System.out.println(roomNum + "호 입실완료");
				}else {
					System.out.println(roomNum + "호는 현재 사용중!");
				}
				break;
			}
		}
	}

	private User getUserInfo() {
		System.out.println("투숙객의 정보를 입력해야 합니다!");
		System.out.println("이름 >");
		String name = sc.next();
		System.out.println("나이 >");
		int age = sc.nextInt();
		System.out.println("성별 >");
		char gen = sc.next().charAt(0);
		
		return new User(name, age, gen);
	}

	@Override
	public void roomCheckOut(String roomNum) { // 3. 퇴실 > 입실의 반대
		for (Room room : roomList) {
			if (room.getRoomNum().equals(roomNum)) {
				if (!room.isEmpty()) { // 현재 방번호가 false냐고 물어봄
					room.setEmpty(true); // 빈방 만들기
					room.setUser(null); // 유저정보 빼기
					LocalDateTime todayNow = LocalDateTime.now();
					room.setCheckOutTime(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow)); // 날짜, 시간 포맷팅하기!
					room.setCheckInTime(null);
					System.out.println(roomNum + "호 퇴실완료");
				}else {
					System.out.println(roomNum + "호는 현재 빈방!");
				}
				break;
			}
		}

	}

	@Override
	public void getRoomDetail(String roomNum) { // 객실 호수 조회
		for (Room room : roomList) {
			if (room.getRoomNum().equals(roomNum)) {
				System.out.println(room);
				break;
			}
		}

	}

	@Override
	public void getUserList() { // 유저리스트 만들기
		for (Room room : roomList) {
			System.out.print(room.getRoomNum() + " > ");
			System.out.println(room.getUser());
		}
	}

}
