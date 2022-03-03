package quiz;

public class Quiz05 {

	public static void main(String[] args) {
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
		//		A
		// 역삼각형의 공식 (아스키코드)
		for (int i = 0; i < 26; i++) {
			char a = 'A';
			for (int j = 0; j < 26-i; j++) {
				System.out.print((char)(a+j));
			}
			System.out.print("\n");
		}
		System.out.println("=============================");
		
		String str = "ABCDEFGHIJKMLNOPQRSTUVWXYZ"; // index > 0~25, length > 26
		for (int i = 0; i < 26; i++) {
//			String subStr = str.substring(0,str.length()-i);
//			System.out.println(subStr);
			System.out.println(str.substring(0,str.length()-i));
		}
		
	}

}
