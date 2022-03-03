package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 02. 3자리 이상의 정수 L, 정수 a, 정수 b를 입력받아
		//		L까지 a, b의 배수 갯수를 구하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한계값 입력 (3자리 이상)>");
		int limit = sc.nextInt();
		
		System.out.println("첫번쨰 정수 입력 >");
		int a = sc.nextInt();
		System.out.println("두번쨰 정수 입력 >");
		int b = sc.nextInt();
		
		int count = 0;
		
		for (int i = 1; i < limit+1; i++) {
			if (i % a == 0 || i % b == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println("\n" + limit + "까지의" + a + "또는" + b + "의 배수 갯수는" + count + "개입니다");
	}

}
