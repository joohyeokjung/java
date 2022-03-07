package creation;

public class Quiz_t {

	public static void main(String[] args) {
		// 랜덤으로 정수를 5개를 배열로 만들어
		// 그 배열을 메서드에 전달하면
		// 평균을 연산 후 리턴 받아 
		// 출력하는 코드를 작성하세요
		// 1. 랜덤으로 정수 5개 만드는 메서드
		// 2. 평균을 연산하는 메서드
		
		int[] numArr = makeRandomNumberArray();
		
		double avg = makeAverageArray(numArr);
		System.out.println(avg);
	}

	private static double makeAverageArray(int[] numArr) {
		int total = 0;
		for (int i : numArr) {
			total += i;
		}
		System.out.println("\nTotal : " + total);
		return (double)total / numArr.length;
	}

	private static int[] makeRandomNumberArray() {
		int[] numArr = new int[5];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random()*100) + 1;
			System.out.print(numArr[i] + " ");
		}
		return numArr;
	}

}
