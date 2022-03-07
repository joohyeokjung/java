package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 24절기 맞추기 게임
		String[] seasonal = {
				"입춘", "우수", "경칩", "춘분", 
				"청명", "곡우", "입하",
				"소만","망종","하지","소서","대서",
				"입추","처서","백로","추분",
				"한로","상강","입동",
				"소설","대설","동지","소한","대한" 
		};
		// ? 번째 절기는 무엇입니까 >
		// 몇 번 시도했는지도 출력
		Scanner sc = new Scanner(System.in);
		int rNum = (int)(Math.floor(Math.random()*seasonal.length));
		int count = 1;
		while (true) {
			System.out.println(rNum + 1 + "번째 절기는 무엇입니까?");
			String myAns = sc.next();
			if (myAns.equals(seasonal[rNum])) {
				System.out.println("정답입니다");
				break;
			}else {
				System.out.println("틀렸습니다");
			}
			count++;
		}
		System.out.println(rNum + 1 +"번째 절기는 " + seasonal[rNum] + " 입니다");
		System.out.println("시도횟수는 : " + count);
	}

}
