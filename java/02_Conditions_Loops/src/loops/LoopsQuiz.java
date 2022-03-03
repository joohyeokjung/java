package loops;

import java.util.Scanner;

public class LoopsQuiz {

	public static void main(String[] args) {
		// 01. for문을 활용하여 x의 y승을 구하세요
//		Scanner sc = new Scanner(System.in);
//		System.out.println("x 숫자를 입력하세요");
//		int x = sc.nextInt();
//		System.out.println("y 숫자를 입력하세요");
//		int y = sc.nextInt();
//		int result = 1;
//		for (int i = 0; i < y; i++) {
//			result = result * x;
//		}
//		System.out.println(x + "의 " + y + "승 은 " + result + " 입니다");
		
		
		// 02. 3자리 이상의 정수 L, 정수 a, 정수 b를 입력받아
		//		L까지 a, b의 배수 갯수를 구하세요
//		Scanner sc = new Scanner(System.in);
//		System.out.println("3자리 정수를 입력하세요");
//		int L = sc.nextInt();
//		System.out.println("3자리 정수를 입력하세요");
//		int a = sc.nextInt();
//		System.out.println("3자리 정수를 입력하세요");
//		int b = sc.nextInt();
//		int aSum = 0;
//		int aCount = 0;
//		int bSum = 0;
//		int bCount = 0;
//		for (int i = 0; i < L; i++) {
//			if (i%a==0) {
//				aSum+=i;
//				aCount++;
//			}
//			if (i%b==0) {
//				bSum+=i;
//				bCount++;
//			}
//		}
//		System.out.println(a + "의 배수의 개수는" + aSum);
//		System.out.println(a + "의 배수의 개수는" + aCount);
//		System.out.println(b + "의 배수의 개수는" + bSum);
//		System.out.println(b + "의 배수의 개수는" + bCount);
		
		// 03. 음수나 0을 입력할때까지 숫자를 계속 입력받고
		//		음수나 0이 입력되면 지금까지 입력된 수의 총합과 평균을 구하세요
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		int sum = 0;
		double average = 0.0;
		int sount = 0;
		Boolean flag = true;
		do {
			
			if (sc.nextInt()==0) {
				flag = false;
			}
		} while (flag);
		
		// 04. 컴퓨터가 랜덤으로 1~100 사이의 정수를 정하면 
		//		맞추는 게임을 구현하세요
		//		컴퓨터의 수보다 높은 수를 입력하면 > 더 낮은 수를 입력하세요
		//		컴퓨터의 수보다 낮은 수를 입력하면 > 더 높은 수를 입력하세요
//		int comNum = (int)Math.floor(Math.random()*100)+1;
//		System.out.println(comNum);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정답을 입력하세요");
//		int myNum = sc.nextInt();
//		if (comNum > myNum) {
//			System.out.println("더 높은 수를 입력하세요");
//		} else if (comNum < myNum) {
//			System.out.println("더 낮은 수를 입력하세요");
//		} else {
//			System.out.println("정답입니다");
//		}
		
		// 05. (Optional)
		//		다음과 같이 출력되도록 하세요
		//		ABCDEFGHIJKMLNOPQRSTUVWXYZ
		//		ABCDEFGHIJKMLNOPQRSTUVWXY
		//		ABCDEFGHIJKMLNOPQRSTUVWX
		//		ABCDEFGHIJKMLNOPQRSTUVW
		//		ABCDEFGHIJKMLNOPQRSTUV
		//		ABCDEFGHIJKMLNOPQRSTU
		//		ABCDEFGHIJKMLNOPQRST
		//		ABCDEFGHIJKMLNOPQRS
		//		ABCDEFGHIJKMLNOPQR
		//		ABCDEFGHIJKMLNOPQ
		//		....
		//		...
		//		..
		
		
	}

}
