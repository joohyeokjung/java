package quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 테스트에 참여할 인원수를 입력하세요 > 3
		
		// 1번째 사람의 이름을 입력하세요
		// 1번째 사람의 국어점수를 입력하세요
		// 1번째 사람의 영어점수를 입력하세요
		// 1번째 사람의 수학점수를 입력하세요
		// ...
		// ...
		// ...
		// ...
		// 3번째 사람의 수학점수를 입력하세요 >
		
		// 이름 국어 영어 수학 총점 평균
		// aaa  89  88  78  ?   ?
		// bbb   ?   ?   ?  ?   ?
		// ...
		// ...
		// ...
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트에 참여할 인원수를 입력하세요");
		int people = sc.nextInt();
		String[] name = new String[people];
		int[][] sum = new int[people][3];
		int[] sum1 = new int[people];
		for (int i = 0; i < people; i++) {
			System.out.println(i + 1 + "번째 이름을 입력하세요");
			name[i] = sc.next();
			System.out.println(i + 1 + "번째 국어점수를 입력하세요");
			sum[i][0] = sc.nextInt();
			sum1[i] += sum[i][0];
			System.out.println(i + 1 + "번째 영어점수를 입력하세요");
			sum[i][1] = sc.nextInt();
			sum1[i] += sum[i][1];
			System.out.println(i + 1 + "번째 수학점수를 입력하세요");
			sum[i][2] = sc.nextInt();
			sum1[i] += sum[i][2];
		}
		double[] average = new double[people];
		for (int i = 0; i < average.length; i++) {
			average[i] = sum1[i] / 3;
		}
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 >" + name[i] + ", 총점 >" + sum1[i] + ", 평균 >" + average[i] + ",");
			System.out.println("국어 > " + sum[i][0]	 + ", 영어 > " + sum[i][1] + ", 수학 > " + sum[i][2]);
		}
	}
}
