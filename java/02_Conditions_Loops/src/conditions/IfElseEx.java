package conditions;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 몇시니?");
		int nowHour = sc.nextInt();

		if (nowHour < 9) {
			System.out.println("굿 모닝~");
		} else {
			System.out.println("일어나야지??");

			if (nowHour < 13) {
				System.out.println("굿 앱터눈~");
			} else {
				System.out.println("신호보내셔야죠~");
			}
		}
		// if > else > if else

		System.out.println("백신 맞았니? > y, n, w");
		String ans = sc.next();

		if (ans.equals("y")) {
			System.out.println("응 잘 하셨어요~");
		} else if (ans.equals("n")) {
			System.out.println("왜 왜 왜 안맞은거야~");
		} else {
			System.out.println("응 잘 생각했어~");
		}
	}

}
