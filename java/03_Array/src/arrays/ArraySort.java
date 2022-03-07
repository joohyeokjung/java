package arrays;

import java.util.Iterator;

public class ArraySort {

	public static void main(String[] args) {
		int[] intArr = new int[12];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random()*100))+1;
			
			System.out.print(intArr[i] + " ");
		}
		System.out.println("\n============================================");
		intArr[0] = 101;
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println("\n==================순차정렬====================");
		// 순차정렬과 역정렬을 구현해보세요~
		
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if (intArr[i] > intArr[j]) {
					int temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
			if (i != intArr.length-1) {
				System.out.print(", ");
			}
		}
//		for (int i = 0; i < intArr.length; i++) {
//			System.out.print(intArr[i] + " ");
//		}
		System.out.println("\n==================역정렬======================");
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if (intArr[i] < intArr[j]) {
					int temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
			if (i != intArr.length-1) {
				System.out.print(", ");
			}
		}
//		for (int i = 0; i < intArr.length; i++) {
//			System.out.print(intArr[i] + " ");
//		}
		
	}

}
