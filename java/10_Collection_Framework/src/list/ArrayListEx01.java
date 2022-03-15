package list;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(43); // new Integer(43) > Deprecated
		list1.add(15);
		list1.add(23);
		list1.add(34);
		
		for (int i = 0; i < list1.size(); i++) { // 길이는 size() 메서드를 사용
			System.out.println("index " + i + " : " + list1.get(i));
		}
		System.out.println(list1);
		System.out.println("43 포함여부 : " + list1.contains(43)); // boolean 타입
		
		// add 추가
		// size 길이
		// get 인덱스 가져올때
		// contains 값이 포함되어있는지 찾을때 boolean type
	}

}
