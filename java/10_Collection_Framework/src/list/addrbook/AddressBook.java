package list.addrbook;

import java.util.ArrayList;

public class AddressBook {

	public static void main(String[] args) {
		ArrayList<Address> addrDatas = new ArrayList<>(); // 1. ArrayList<타입> 객체 생성 (집합객체)
		AddressMenu addrMenu = new AddressMenu(); // 2. 프로그램 구동 
		System.out.println(addrDatas.hashCode());
		addrMenu.processor(addrDatas); // 3. 프로그램 진행
		
	}

}
