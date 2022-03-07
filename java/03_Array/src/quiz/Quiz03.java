package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 숫자 야구 게임
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		// 컴퓨터의 숫자와 나의 숫자 정보를 셋팅
		int[] comNum = {0,0,0};
		int[] myNum = new int[3];
		
		// 컴퓨터의 숫자를 랜덤으로 중복되지 않게 초기화
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9) + 1;
			for (int j = 0; j < i; j++) {
				if (comNum[j] == comNum[i]) {
					i--;
					break;
				}
			}
		}
		// 컴퓨터 숫자 추출결과 확인
		for (int i : comNum) {
			System.out.println(" " + i);
		}
		// 숫자수측하는 반복문
		while (true) {
			int strike = 0, ball = 0;
		// 반복문 내부 : 추측 숫자 입력받기
			System.out.println("숫자를 추측하세요 > ");
			String myNumStr = sc.next();
			String[] myNumStrArr = myNumStr.split("");
			
			count++;
		// 반복문 내부 : 추측숫자를 수자형 배열에 저장하기	
			for (int i = 0; i < myNumStrArr.length; i++) {
				myNum[i] = Integer.parseInt(myNumStrArr[i]);
			}
		
		// 반복문 내부 : 추측 숫자와 컴퓨터 숫자를 비교하여 Strike, Ball 누적하기
			for (int i = 0; i < comNum.length; i++) {
				for (int j = 0; j < myNum.length; j++) {
					if (comNum[i] == myNum[j] && i==j) {
						strike++;
					} else if(comNum[i] == myNum[j] && i!=j) {
						ball++;
					}
				}
			}
		// 반복문 내부 : 추측 결과 출력하기
			System.out.println(count + "회 시도 : " + myNumStr);
			System.out.println(">" + strike + "S" + ball + "B");
			if (strike == 3) {
				System.out.println("게임종료 : 총 " + count + "회 시도");
				break;
			}
		}
	}
}
