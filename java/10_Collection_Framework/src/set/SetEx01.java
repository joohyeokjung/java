package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx01 {
	
	public static void main(String[] args) { // set은 순서가 보장되지 않는다. 랜덤으로 들어감. 안쪽에서 순서가 없음(저장도 랜덤 출력할때도 랜덤). iterator 순환이 안됨
		Set set = new HashSet();
		int count = 0;
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			count++;
		}
		System.out.println(count);
		System.out.println(set);
		
		List list = new LinkedList(set); // set 정렬하는 방법
		Collections.sort(list);
		
		System.out.println(list);
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(set);
//		}
	}
}
