package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) { // 키와 벨류가 연관되어있을때 자료 계수가 별로 없을때 사용하면 좋음, set과 같이 순서가없음
		Map map = new HashMap();
//		Map<String, String> hashMap = new HashMap<>();
		
		map.put("abc", "1234");
		map.put("bcd", "2345");
		map.put("cde", "3456");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("id 와 pw를 입력해주세요");
			System.out.println("id > ");
			String id = sc.next();
			System.out.println("pw > ");
			String pw = sc.next();
			
			if (map.containsKey(id)) { // key 값
				if (map.get(id).equals(pw)) { // map.get(id) > value 값
					System.out.println("로그인 성공");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			}else {
				System.out.println("입력한 id는 존재하지 않습니다!");
				break;
			}
		}
	}

}
