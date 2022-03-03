package printEx;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		String name = "Joo";
		int age = 32;
		float height = 180.3f;
		double weight = 73.321;
		char blood = 'A';
		boolean vachine = true;
		long asset = 214800000000L;
		String description = "현재는 OpenAPI 강의중";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 멤버의 정보를 입력하세요");
		System.out.println("이름 >");
		name = sc.next();
		System.out.println("나이 >");
		age = sc.nextInt();
		System.out.println("키 >");
		height = sc.nextFloat();
		System.out.println("몸무게 >");
		weight = sc.nextDouble();
		System.out.println("혈액형 >");
		blood = sc.next().charAt(0);
		System.out.println("백신접종여부 >");
		vachine = sc.nextBoolean();
		System.out.println("자산 >");
		asset = sc.nextLong(10);
		System.out.println("부가정보");
		description = sc.nextLine();
		
		// C언어에서 사용하는 포맷형
		System.out.printf("%s, %d, %f, %f, %s, %s, %d, %s",
				name, age, height, weight, blood, vachine, asset, description); 
		
//		char ch1 = 65; // 아스키코드 A
//		char ch2 = 97; // a
//		System.out.println(ch1);
//		System.out.println(ch2);
	}

}
