package conditions;

import java.util.Scanner;

public class FinancialPlan {

	public static void main(String[] args) {
		// 1. 꼭 구매하고 싶은 것 입력 받기. 예) 아파트, 자동차, 등등...
		// 2. 구매할 대상의 가격 입력 받기
		// 3. 미래에 수령할 월급 입력받기 => 현실적으로 입력
		// 4. 월급의 몇 %를 저축할지? => 현실적으로 입력
		// 5. 대상을 구매하기 위해 소요되는 기간 구하기 (월, 년 상관없음)
		// 6. 연 이율은 적금을 기준으로 2.5%로 가정
//		int price = 0;
//		int month = 0;
//		int sav = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구매 품목을 입력해주세요");
//		String item = sc.next();
//		System.out.println("구매 품목 가격을 입력해주세요");
//		price = sc.nextInt();
//		System.out.println("미래에 수령할 월급 입력");
//		month = sc.nextInt();
//		System.out.println("월급의 몇 %를 저축할지 입력");
//		sav = sc.nextInt();
//		
//		sav = (int)((double)sav / (double)month * 100.0);
//		
//		System.out.println("월급의 " + sav + "% 저축");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구매하고 싶은 것 >");
		String target = sc.next();
		System.out.println("가격은 ?");
		int price = sc.nextInt();
		System.out.println("미래의 소득(월급) >");
		int salary = sc.nextInt();
		System.out.println("예상 저축률 % >");
		double savingRatio = sc.nextDouble();
		double bankRate = 2.5 / 100 / 12;
		
		
		// 총수령액(T) = (월납입금(A) x 납입월[n]) + (월납입금(A) x (납입월[n](납입월[n]+1)/2) x (연이율[r]/12)) => 단리적금계산식
		// n*(n+1)/2 = T /(A * r/12)
		// n*(n+1) = 2T /(A * r/12)
		// n+1 = 2T / ((A*r/12)*n)
		// n = 2T / (A * (r/12) * n) - 1
		
		// n = ((2*price) / (salary*savingRation/100) * (bankRate) * n) - 1
		
		// T = (A * n) + (A * (n * (n + 1) / 2) * (r / 12))
		
		double t = 0;
		int n = 0;
		final double A = salary * (savingRatio / 100);
		
		do {
			t = (A * n) + (A * (n * (n + 1) / 2) * bankRate);
			n++;
		} while (t < price);
		System.out.println(target + "을 구매하기 위해 필요한 최소 저축 개월수 :" + n + "개월");
	}

}
