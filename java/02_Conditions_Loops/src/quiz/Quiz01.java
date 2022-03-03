package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 01. for문을 활용하여 x의 y승을 구하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("X 값을 입력하세요 >");
		int x = sc.nextInt();
		
		System.out.println("y 값을 입력하세요 >");
		int y = sc.nextInt();
		
		int result = 1;
		
		for (int i = 0; i < y; i++) {
			//result = result * x;
			result *= x;
			
		}
		System.out.println(x + "의" + y + "승은" + result + "입니다");
		
		double result2 = Math.pow(x, y);
		
		System.out.println(x + "의" + y + "승은" + (int)result2 + "입니다");
	}

}
