package creation;

public class Quiz {

	public static void main(String[] args) {
		// 랜덤으로 정수를 5개를 배열로 만들어
		// 그 배열을 메서드에 전달하면
		// 평균을 연산 후 리턴 받아 
		// 출력하는 코드를 작성하세요
		// 1. 랜덤으로 정수 5개 만드는 메서드
		// 2. 평균을 연산하는 메서드
		int[] rNum = new int[5];
		for (int i = 0; i < rNum.length; i++) {
			rNum[i] = (int)Math.floor(Math.random()*100)+1;
			System.out.print(rNum[i] + " ");
		}
		double average = calculator(rNum);
		System.out.println("\n" + average);
	}

	private static double calculator(int[] rNum) {
		double sum = 0;
		for (int i = 0; i < rNum.length; i++) {
			sum += rNum[i];
		}
		double average = sum / rNum.length;
		return average;
	}


}
