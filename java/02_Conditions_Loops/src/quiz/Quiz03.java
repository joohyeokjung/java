package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 03. 음수나 0을 입력할때까지 숫자를 계속 입력받고
		//		음수나 0이 입력되면 지금까지 입력된 수의 총합과 평균을 구하세요

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int total = 0, count = 0;
		
		while (flag) {
			System.out.println("정수 입력, 0이하의 수를 입력하면 종료됨니다 >");
			int num = sc.nextInt();
			if (num <= 0) {
				flag = false;
			}else {
				total += num;
				count++;
			}
		}
		System.out.println("입력한 수의 총합 :" + total);
		System.out.println("입력하 수의 갯수 :" + count);
		System.out.println("평균 : " + (double)total/count);
	}

}
