package list.addrbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMenu {
	
	private Scanner sc = new Scanner(System.in);
	private int menu;
	private boolean flag = true;
	private String menuStr = "1.추가  2.검색  3.수정  4.삭제  5.전체출력  6.데이터초기화  0.종료";
//	private final String MENU_STR = "1.추가  2.검색  3.수정  4.삭제  5.전체출력  6.데이터초기화  0.종료"; // 자바의 final(상수) 표기법 (대문자)

	public void processor(ArrayList<Address> addrDatas) {
		System.out.println(addrDatas.hashCode());
		int idx = 0;
		while (flag) {
			System.out.println(menuStr);
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				addrDatas.add(inputObject()); // 1.addrDatas.add 구현 메서드 Address객체 리턴받음
				break;
			case 2:
				idx = searchIndex(addrDatas);
				if (idx < 0) {
					System.out.println("찾는 정보가 없습니다");
				}else {
					System.out.println(addrDatas.get(idx));
				}
				break;
			case 3:
				idx = searchIndex(addrDatas);
				System.out.println("수정할 정보를 입력합니다...");
				addrDatas.add(idx, inputObject());
//				if (addrDatas.get(idx).hashCode() != addrDatas.get(idx+1).hashCode()) { // hashCode 로 비교안해도됨
//					addrDatas.remove(idx+1);
//				}
				addrDatas.remove(idx+1);
				break;
			case 4:
				idx = searchIndex(addrDatas);
				addrDatas.remove(idx);
				break;
			case 5:
				for (Address address : addrDatas) {
					System.out.println(address); // toString 안만들면 래퍼런스 주소값 표시
				}
				break;
			case 6:
				addrDatas.clear();
				break;
			case 0:
				flag = false;
				System.out.println("프로그램을 종료합니다");
				break;

			default:
				break;
			}
		}
	}

	private int searchIndex(ArrayList<Address> addrDatas) {
		System.out.println("1.이름으로 찾기  2.전화번호로 찾기");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("이름 > ");
			String name = sc.next();
			
			for (int i = 0; i < addrDatas.size(); i++) {
				if (name.equals(addrDatas.get(i).getName())) {
					return i;
				}
			}
			
		}else {
			System.out.println("전화번호 > ");
			String tel = sc.next();
			
			for (int i = 0; i < addrDatas.size(); i++) {
				if (tel.equals(addrDatas.get(i).getTel())) {
					return i;
				}
			}
		}
		
		return -1;
	}

	private Address inputObject() { // Address 객체 리턴 메서드
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("전화번호 > ");
		String tel = sc.next();
		System.out.println("주소 > ");
		String addr = sc.next();
		
//		Address address = new Address(name, tel, addr);
		return new Address(name, tel, addr);
	}
}
