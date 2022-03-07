package quiz;

import java.util.Scanner;

public class Quiz03_t {

	public static void main(String[] args) {
		// 숫자 야구 게임
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		int[] comNum = makeRandomNumberOfComputer();
		
		boolean flag = true;
		
		while (flag) {
			int[] myNum = guessNumberOfMine(sc);
			
			int[] strikeAndBall = compareNumbers(comNum, myNum);
			count += strikeAndBall[2];
			
			flag = printResult(strikeAndBall, count, String.valueOf(myNum[myNum.length-1]));
		}
		System.out.println("야구 게임 종료!");
	}

	private static boolean printResult(int[] strikeAndBall, int count, String myNumStr) {
		System.out.println(count + "회 시도 : " + myNumStr);
		System.out.println(">" + strikeAndBall[0] + "S" + strikeAndBall[1] + "B");
		if (strikeAndBall[0] == 3) {
			System.out.println("게임종료 : 총 " + count + "회 시도");
			return false;
		}
		return true;
	}

	private static int[] compareNumbers(int[] comNum, int[] myNum) {
		int[] strikeAndBall = new int[3];
		
			for (int i = 0; i < comNum.length; i++) {
				for (int j = 0; j < myNum.length; j++) {
					if (comNum[i] == myNum[j] && i==j) {
						strikeAndBall[0]++;
					} else if(comNum[i] == myNum[j] && i!=j) {
						strikeAndBall[1]++;
					}
				}
			}
		
			strikeAndBall[2] = 1;
		return strikeAndBall;
	}

	private static int[] guessNumberOfMine(Scanner sc) {
		int[] myNum = new int[4];
		System.out.println("숫자를 추측하세요 > ");
		String myNumStr = sc.next();
		String[] myNumStrArr = myNumStr.split("");
		
		for (int i = 0; i < myNumStrArr.length; i++) {
			myNum[i] = Integer.parseInt(myNumStrArr[i]);
		}
		myNum[myNum.length-1] = Integer.parseInt(myNumStr);
		return myNum;
	}

	private static int[] makeRandomNumberOfComputer() {
				int[] comNum = {0,0,0};
				
				for (int i = 0; i < comNum.length; i++) {
					comNum[i] = (int)(Math.random()*9) + 1;
					for (int j = 0; j < i; j++) {
						if (comNum[j] == comNum[i]) {
							i--;
							break;
						}
					}
				}
				for (int i : comNum) {
					System.out.println(" " + i);
				}
		return comNum;
	}
}
