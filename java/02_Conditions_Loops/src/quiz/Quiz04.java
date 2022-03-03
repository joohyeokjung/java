package quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 04. 컴퓨터가 랜덤으로 1~100 사이의 정수를 정하면 
		//		맞추는 게임을 구현하세요
		//		컴퓨터의 수보다 높은 수를 입력하면 > 더 낮은 수를 입력하세요
		//		컴퓨터의 수보다 낮은 수를 입력하면 > 더 높은 수를 입력하세요
		
		int comNum = (int)(Math.floor(Math.random()*100)) + 1;
		System.out.println("컴퓨터가 랜덤 숫자를 정했습니다 (1~100) >");
		Scanner sc = new Scanner(System.in);
		
//		boolean flag = true;
		int count = 0;
		while (true) {
			System.out.println("숫자를 입력해 주세요 >");
			int myNum = sc.nextInt();
			
			if (comNum == myNum) {
				System.out.println("맞추셨네요 > 컴퓨터의 숫자 :" + comNum);
				break;
			} else {
				if (comNum > myNum) {
					System.out.println("더 큰숫자를 입력하세요");
				}else {
					System.out.println("더 작은숫자를 입력하세요");
				}
				count++;
			}
		}
		System.out.println("시도횟수 : " + count + "회");
	}

}
