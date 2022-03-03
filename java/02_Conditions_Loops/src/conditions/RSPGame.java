package conditions;

import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		// 가위바위보 게임을 해보자
		
		// 1. 컴퓨터는 랜덤으로 가위바위보를 선택한다
		// 2. 나도 가위바위보 중에 하나를 입력한다
		// 3. 가위바위보를 비교해서 결과를 출력한다.
		System.out.println("가위바위보 게임 시작 >>>");
		Scanner sc = new Scanner(System.in);
		int comNum = (int)(Math.floor(Math.random()*3));
		System.out.println("컴퓨터가 자신의 패를 선택하였습니다 >>>");
		System.out.println("가위바위보 중 한개를 선택하세요 >>>");
		System.out.println("가위:0, 바위:1, 보:2");
//		int myNum = sc.nextInt();
		String myChoice = sc.next();
		
		String comChoice = comNum == 0 ? "가위" : comNum == 1 ? "바위" : "보";
		
		if (comChoice.equals(myChoice)) {
			System.out.println("비겼습니다");
		}else {
			if(comChoice.equals("가위")) {
				if (myChoice.equals("바위")) {
					System.out.println("이겼습니다");
				}else {
					System.out.println("졌습니다");
				}
			}else if (comChoice.equals("바위")) {
				if (myChoice.equals("보")) {
					System.out.println("이겼습니다");
				}else {
					System.out.println("졌습니다");
				}
			}else { // comChoice => "보"
				if (myChoice.equals("가위")) {
					System.out.println("이겼습니다");
				}else {
					System.out.println("졌습니다");
				}
			}
		}
	}

}
