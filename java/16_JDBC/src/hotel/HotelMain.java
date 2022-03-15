package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HotelMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HotelService hsv = new HotelServiceImple();
		List<HotelVO> list = null;
		HotelVO hvo = null;
		
		boolean flag = true;
		boolean empty = true;
		int menu, age, isOK = 0;
		int roomNum = 0;
		String name, gen = null;
		
		while (flag) {
			System.out.println("==================== 호텔 관리 메뉴 ======================");
			System.out.println("1:객실현황  2:입실  3:퇴실  4:객실상세조회 5:투숙객조회 6:호텔건설 Etc:종료");
			System.out.println("------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>> 메뉴를 선택하세요 >>>>>>>>>>>>>>>>>>>>");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				list = hsv.getList();
				for (HotelVO hotVo : list) {
					System.out.println(hotVo);
				}
				break;
			case 2:
				System.out.println("입실할 방번호 입력 > ");
				roomNum = sc.nextInt();
				System.out.println("이름 > ");
				name = sc.next();
				System.out.println("나이 > ");
				age = sc.nextInt();
				System.out.println("성별 > ");
				gen = sc.next();
				empty = hsv.bool(roomNum);
				if (empty) {
					hsv.modifyRoomIn(new HotelVO(roomNum,name,age,gen));
					System.out.println(roomNum + "호 입실 완료");
				}else {
					System.out.println("현재 사용중인 방입니다");
				}
				break;
			case 3:
				System.out.println("퇴실할 방번호 입력 > ");
				roomNum = sc.nextInt();
				empty = hsv.bool(roomNum);
				if (!empty) {
					hsv.modifyRoomOut(new HotelVO(roomNum));
					System.out.println(roomNum + "호 퇴실 완료");
				}else {
					System.out.println("현재 빈방입니다");
				}
				break;
			case 4:
				System.out.println("조회할 방번호 입력 > ");
				roomNum = sc.nextInt();
				hvo = hsv.getOneDetail(roomNum);
				System.out.println(hvo);
				break;
			case 5:
				System.out.println("조회할 이름 입력 > ");
				name = sc.next();
				list = hsv.getName(name);
				for (HotelVO hoteVo : list) {
					System.out.println(hoteVo);
				}
				break;
			case 6:
				list = new ArrayList<>();
				System.out.println("호텔의 층 수 입력 > ");
				int floorCount = sc.nextInt();
				System.out.println("층 당 방 수 입력 > ");
				int roomCount = sc.nextInt();
				for (int i = 1; i <= floorCount; i++) {
					for (int j = 1; j <= roomCount; j++) {
						isOK = hsv.register(new HotelVO(Integer.parseInt(i + (j < 10 ? "0" : "") + j)));
					}
				}
				System.out.println("호텔 건설 " + (isOK > 0 ? "성공" : "실패"));
				break;

			default:
				flag = false;
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}
}
